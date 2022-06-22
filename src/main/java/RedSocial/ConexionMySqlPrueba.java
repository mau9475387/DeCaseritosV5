/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RedSocial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class ConexionMySqlPrueba {
    
    String bd = "prueba";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "decaseritos";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public ConexionMySqlPrueba() {

    }

    public Connection conectar() {
       try {
           Class.forName(driver);
           cx = DriverManager.getConnection(url + bd, user, password);
           System.out.println("se conecto a base de datos: " + bd);
       } catch (ClassNotFoundException | SQLException ex) {
           System.out.println("no se conecto a base de datos: " + bd);
           Logger.getLogger(ConexionMySqlPrueba.class.getName()).log(Level.SEVERE, null, ex);
       }
       return cx;
   }
    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
           Logger.getLogger(ConexionMySqlPrueba.class.getName()).log(Level.SEVERE, null, ex);
       }
  }

   public static void main(String[] args) {
       ConexionMySqlPrueba conexion = new ConexionMySqlPrueba();
      conexion.conectar();
  }
    
}
