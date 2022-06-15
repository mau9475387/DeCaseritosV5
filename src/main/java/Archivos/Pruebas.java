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
        Comensal com2 = new Comensal("santos","santos97","dog2","santos@gmail.com");
        prueba.crearComensal(com2);
        Comensal com3 = new Comensal("hector","hector1","bncms","hector1@gmail.com");
        prueba.crearComensal(com3);
        Comensal com4 = new Comensal("juancho","juan97","dog3","juancho@gmail.com");
        prueba.crearComensal(com4);
        Comensal com5 = new Comensal("santos col","snc","sant","san@gmail.com");
        prueba.crearComensal(com5);
    }
    
}
