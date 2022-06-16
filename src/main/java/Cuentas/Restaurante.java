/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;


import EDL.ListaDE;
import Publicaciones.PRestaurante;

public class Restaurante extends Cuenta{
public String rutaIcon;
    public ListaDE<PRestaurante> publicaciones;
    public ListaDE<String> zonas;
    
    
    public Restaurante(){
        publicaciones = new ListaDE<>();
                tipo = "Restaurante";
    }
    
        public Restaurante(String nombre, String usuario, String email, String contraseña, String celular, String horario, String especialidad, String direccion) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
   
        tipo = "Restaurante";
    }

    public Restaurante(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
@Override
            public String toString() {
        return nombre + "----" + usuario + "----" + contraseña + "----" + email + "-----" +tipo;
            }
    public void addZonas(String zona){
        zonas.add(zona);
    }

    public void crearRestaurante(Restaurante restaurante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        
}