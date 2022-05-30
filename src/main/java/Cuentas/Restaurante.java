/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

import EDL.ListaDE;
import Publicaciones.PRestaurante;

public class Restaurante {
public String rutaIcon;
    public ListaDE<PRestaurante> publicaciones;
    public ListaDE<String> zonas;
    
    
    public Restaurante(){
        publicaciones = new ListaDE<PRestaurante>();
    }
    
    public void addZonas(String zona){
        zonas.add(zona);
    }
    
        
}