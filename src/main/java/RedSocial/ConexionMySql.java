/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RedSocial;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySql {
    
    Connection cn;
    
    public Connection conectar(){
    try {
    Class.forName("com.mysql.jdbc.Driver");
    cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bddecaseritos","root","decaseritos");
            System.out.println("CONECTADO");
            } catch (Exception e) {
            System.out.println("ERROR DE CONEXION BD"+e);
            }
            return cn;
}
    
}
