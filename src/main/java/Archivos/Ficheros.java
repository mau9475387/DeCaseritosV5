/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import RedSocial.Error;
import Cuentas.Comensal;
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
            String nombre = com.getNombre();
            String dir = "D:\\Universidad\\2022 primer Semestre\\Taller de Progra\\DeCaseritos\\src\\main\\java\\com\\Ficheros\\Cuentas\\Comensal\\" + nombre;
            File d = new File(dir);
                if(d.mkdirs()){
                File f = new File(dir+"\\"+nombre+".txt");
                String dir2 = dir + "\\publicaciones";
                File e = new File (dir2);
                e.mkdir();
                fw = new FileWriter(f,true);
                bw = new BufferedWriter(fw);
                bw.write(com.getNombre()+"||"+com.getUsuario()+"||"+com.getContraseña()+"||"+
                    com.getEmail()+"||"+com.getCelular()+"||"+com.getTipo());
            
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
    
    public Comensal leerComensal(String nombre){
        Comensal res = null;
        try{
            File f = new File("D:\\Universidad\\2022 primer Semestre\\Taller de Progra\\DeCaseritos\\src\\main\\java\\com\\Ficheros\\Cuentas\\Comensal\\" + nombre);
                if (f.exists()){
                    FileReader fr = new FileReader(f+"\\"+nombre+".txt");
                    BufferedReader br = new BufferedReader(fr);
                    String linea=br.readLine();
                    String[] com = linea.split("||");
                    Comensal comensal = new Comensal(com[0],com[1],com[2],
                                            com[3]);
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
    
}
