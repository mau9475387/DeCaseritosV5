/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;
public abstract class Cuenta {
protected String  nombre,usuario, contraseña, email,celular;   
    protected String  propietario,tipo;
    
    protected Cuenta(){
        propietario = usuario;
    }
    //Setters
    
    /**Crea el nombre real del dueño de la cuenta*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**establece el nombre de usuario para login y nombre de la cuenta*/
    public void setUsuario(String usuario)  {
        this.usuario = usuario;
    }
    
    /**cambia la contraseña actual*/
    public void setContraseña(String nuevaContraseña){
        contraseña = nuevaContraseña;
    }
    
    /**establece una nueva dirección de correo electrónico*/
    public void setEmail(String nuevoEmail){
        if(verificarEMail(nuevoEmail)){
            email = nuevoEmail;
        }
        
    }
    
    /**establece una nueva referencia de número de celular*/
    public void setCelular(String nuevoNumero){
        celular = nuevoNumero;
    }
    
    //GETTERS
    /**retorna el nombre real del dueño de la cuenta*/
    public String getNombre(){
        return nombre;
    }
    
    /**retorna el nombre de "usuario" registrado en la cuenta*/
    public String getUsuario(){
        return usuario;
    }
    
    /**retorna la contraseña de la cuenta*/
    public String getContraseña(){
        return contraseña;
    }
    
    /**retorna el email registrado en la cuenta*/
    public String getEmail(){
        return email;
    }
    
    /**retorna el número de celular registrado en la cuenta*/
    public String getCelular(){
        return celular;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    //MÉTODOS
    public boolean verificarEMail(String mail){
        boolean res=false;
        if(mail.contains("@")){
        String[] partes = mail.split("@", 2);
            if(partes[1].equals("gmail.com") ||
               partes[1].equals("hotmail.com") ||
               partes[1].equals("hotmail.es")){
            res = true;    
            }
        }
    return res;    
    }    
}
