/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import RedSocial.Error;
import Cuentas.Comensal;
import Cuentas.Restaurante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mau
 */
public class Ficheros {
    public Ficheros(){
        
    }
    
    
    
    public void crearComensal(Comensal com){//guarda datos de comensales en archivos txt
        try{
            FileWriter fw = null;
            BufferedWriter bw = null;
            String usuario = com.getUsuario();
            String dir = "src\\main\\java\\recursos\\Cuentas\\Comensales\\" + usuario;
            File d = new File(dir);
                if(d.mkdirs()){
                File f = new File(dir+"\\"+usuario+".txt");
                String dir2 = dir + "\\publicaciones";
                File e = new File (dir2);
                e.mkdir();
                fw = new FileWriter(f,true);
                bw = new BufferedWriter(fw);
                bw.write(com.getNombre()+"-"+com.getUsuario()+"-"+com.getContraseña()+"-"+
                    com.getEmail()+"-"+com.getCelular()+"-"+com.getTipo());
            Error error = new Error();
                error.cambiarMensaje("Registro exitoso");
                error.setVisible(true);
                
                }else{
                Error error = new Error();
                error.cambiarMensaje("el usuario ya existe");
                error.setVisible(true);
                }
            bw.close();
            fw.close();
        }
        catch(IOException e){
            Error error = new Error();
            error.cambiarMensaje("IOException: e");
            error.setVisible(true);
        }
    }
    
    public Comensal leerComensal(String usuario){
        Comensal res = null;
        try{
            File f = new File("src\\main\\java\\recursos\\Cuentas\\Comensales\\" + usuario);
                if (f.exists()){
                    FileReader fr = new FileReader(f+"\\"+usuario+".txt");
                    BufferedReader br = new BufferedReader(fr);
                    String linea=br.readLine();
                    String[] com = linea.split("-");
                    Comensal comensal = new Comensal(com[0],com[1],com[2],
                                            com[3], com[4]);
                    res = comensal;
                }
                else{
                    Error error = new Error();
                    error.cambiarMensaje("el usuario no existe");
                    error.setVisible(true);
                    
                }
        }catch(IOException e){
           Error error = new Error();
            error.cambiarMensaje("IOException: e");
            error.setVisible(true); 
        }
     return res;
    }
    
    //Restaurante
    public void crearRestaurante(Restaurante res){//guarda datos de comensales en archivos txt
        try{
            FileWriter fw = null;
            BufferedWriter bw = null;
            String usuario = res.getUsuario();
            String dir = "src\\main\\java\\recursos\\Cuentas\\Restaurantes\\" + usuario;
            File d = new File(dir);
                if(d.mkdirs()){
                File f = new File(dir+"\\"+usuario+".txt");
                String dir2 = dir + "\\publicaciones";
                File e = new File (dir2);
                e.mkdir();
                fw = new FileWriter(f,true);
                bw = new BufferedWriter(fw);
                bw.write(res.getNombre()+"-"+res.getUsuario()+"-"+res.getContraseña()+"-"+
                res.getEmail()+"-"+res.getCelular()+"-"+res.getZNiños()+"-"+res.getWifi()+"-"+
                res.getDelivery()+"-"+res.getHorario()+"-"+res.getEspecialidad()+"-"+
                res.getDireccion()+"-"+res.getFotoPerfil()+"-"+res.getTipo());
            
                Error error = new Error();
                error.cambiarMensaje("Registro exitoso");
                error.cambiarTitulo("Registro completado");
                error.setVisible(true);
                
                }else{
                Error error = new Error();
                error.cambiarMensaje("el usuario ya existe");
                error.setVisible(true);
                }
            bw.close();
            fw.close();
        }
        catch(IOException e){
            Error error = new Error();
            error.cambiarMensaje("IOException: e");
            error.setVisible(true);
        }
    }
    public Restaurante leerRestaurante(String usuario){
        Restaurante res = null;
        try{
            File f = new File("src\\main\\java\\recursos\\Cuentas\\Restaurantes\\" 
                    + usuario);
                if (f.exists()){
                    FileReader fr = new FileReader(f+"\\"+usuario+".txt");
                    BufferedReader br = new BufferedReader(fr);
                    String linea=br.readLine();
                    String[] rest = linea.split("-");
                    Restaurante restaurante = new Restaurante (rest[0],rest[1],rest[2],
                                            rest[3], rest[4], rest[5], rest[6], rest[7]
                                            , rest[8], rest[9], rest[10],rest[11]);
                    res = restaurante;
                }
                else{
                    Error error = new Error();
                    error.cambiarMensaje("el usuario no existe");
                    error.setVisible(true);
                    
                }
        }catch(IOException e){
           Error error = new Error();
            error.cambiarMensaje("IOException: e");
            error.setVisible(true); 
        }
     return res;
    }
}
