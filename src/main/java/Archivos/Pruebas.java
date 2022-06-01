/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Cuentas.Comensal;

/**
 *
 * @author Mau
 */
public class Pruebas {
    public static void main (String[] args){
        Ficheros prueba = new Ficheros();
        Comensal com1= new Comensal("mauricio Almendras","mau97","dog","mau94@gmail.com");
        prueba.crearComensal(com1);
        Comensal com2 = prueba.leerComensal("mauricio Almendras");
        System.out.println(com2.toString());
    }
    
}
