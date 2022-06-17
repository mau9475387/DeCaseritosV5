/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;


import EDL.ListaDE;
import Publicaciones.PRestaurante;

public class Restaurante extends Cuenta{
    
    public ListaDE<PRestaurante> publicaciones;
    public String zNiños,wifi,delivery;
    public String horario,especialidad,direccion,fotoPerfil;
    
    
    public Restaurante(){
        publicaciones = new ListaDE<>();
                tipo = "Restaurante";
    }
    
    public Restaurante(String nombre, String usuario,String contraseña,
            String email, String celular,String zNiños,String wifi,
            String delivery,String horario, String especialidad, 
            String direccion, String fotoPerfil) {
                
                this.nombre = nombre;
                this.usuario = usuario;
                this.email = email;
                this.contraseña = contraseña;
                this.celular = celular;
                this.zNiños=zNiños;
                this.wifi = wifi;
                this.delivery = delivery;
                this.horario = horario;
                this.especialidad = especialidad;
                this.direccion = direccion;
                this.fotoPerfil = fotoPerfil;
   
                tipo = "Restaurante";
    }
    
    //Getters
    public String getZNiños(){
        return zNiños;
    }
    
    public String getWifi(){
        return wifi;
    }
    
    public String getDelivery(){
        return delivery;
    }

    public String getHorario(){
        return horario;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public String getFotoPerfil(){
        return fotoPerfil;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    //Setters
    public void setFotoPerfil(String nuevo){
        this.fotoPerfil = nuevo;
    }

    //Metodos
    public String toString() {
        return nombre + "-" + usuario + "-" + contraseña + "-" + email + "-" +tipo;
    }
    
}        
