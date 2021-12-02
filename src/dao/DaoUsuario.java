/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Usuario;
/**
 *
 * @author Andreita
 */
public class DaoUsuario {
    private final Conexion conexion = new Conexion();
    private Connection conn;
    private PreparedStatement modificarUsuario;
    private PreparedStatement mostrarUsuario;
    ArrayList<Usuario> listaUsuario = new ArrayList<>();
    
    @Override
    public void finalize() throws Throwable{
        
    }
    
    public DaoUsuario(){
        try{
            conn = conexion.obtenerConexion();
            mostrarUsuario = conn.prepareStatement("Select * from Usuario");
            modificarUsuario = conn.prepareStatement("Update Proyecto set"
                    + " password = ?, username = ?"
                    + " where username = ?");

            listaUsuario = new ArrayList<>();
            listaUsuario = this.listarUsuario();
                    
            
        }catch(Exception ex){
            ex.printStackTrace();
            conexion.close(conn);
        }
    }
    private ArrayList<Usuario> getListaUsuario(){
        return listaUsuario;
    }

    private ArrayList<Usuario> listarUsuario() {
        ArrayList<Usuario> listado = null;
        ResultSet rs = null;
        try{
            rs = mostrarUsuario.executeQuery();
            listado = new ArrayList<>();
            while(rs.next()){
                listado.add(new Usuario(
                        rs.getString("username"),
                        rs.getString("password"),
                        1
                ));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
   
        }finally{
            try{
                rs.close();
            }catch(SQLException ex){
                conexion.close(conn);
                ex.printStackTrace();
            }
        }
        return listado;
    }
    /*
    modifica al usuario
    */
    public int modificarUsuario(String username, String password){
        int b = 1;
        try{
            for(Usuario us: listaUsuario){
                if(us.getUsername().equals(username)){
                    us.setUsername(username);
                    us.setContraseña(username);
                    b =1;
                    return b;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return b;
    }
    /*
    modifica al usuario en Prisma
    */
    public int modificarUsuarioBD(Usuario usuario){
        int r = 0;
        try{
            modificarUsuario.setString(1, usuario.getContraseña());
            modificarUsuario.setString(2, usuario.getUsername());
            modificarUsuario.setString(3, usuario.getUsername());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                    "Error al modificar", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    /*
    Actualizar tabla usuario
    */
    public String actualizarBD(){
        String msn = "";
        String msnError = "Errores en: ";
        
        int modificado = 0;
        int errorM = 0;
        
        for(Usuario us: listaUsuario){
            if (this.modificarUsuarioBD(us) != 0) modificado++;
            else{
                errorM++;
                msnError += "-Error al modificar Usuario" + us.getUsername();
            }
        }
        msn = "Usuario modificado con exito";
        if(!msnError.equals("Errores en:")){
            msn += "\n" + msnError;
        }
        return msn;
    }
    
}
    

