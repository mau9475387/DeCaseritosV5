package RedSocial;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package RedSocial;

/*
public class Usuario {

    public String nombreUsuario = "";
    public String nombre = "";
    public String password = "";
    public String correo_alterno = "";
    public int telefono = 0;
    public String path_fotografia = "";

    public String delimiter(String tipoDato, String variable, int CantidadMaxima) {
        String cadena = "";
        int cantidadCaracteres = 0;
        int caracteresFaltantes = 0;
        if (tipoDato.equals("txt")) {
            cadena = variable.toString();
            cantidadCaracteres = cadena.length();

            if (cantidadCaracteres != CantidadMaxima) {

                caracteresFaltantes = CantidadMaxima - cantidadCaracteres;
                for (int i = 0; i < caracteresFaltantes; i++) {
                    cadena = cadena + "=";
                }

            }

        }

        if (tipoDato.equals("bt")) {
            cadena = String.valueOf(variable);
        }
        return cadena;
    }

    public String DelimitarCaracteres() {
        return delimiter("txt", nombreUsuario, 20) + "|" + delimiter("txt", nombre, 30) + "|" + delimiter("txt", password, 40) + "|" + delimiter("txt", correo_alterno, 40) + "|" + delimiter("txt", String.valueOf(telefono), 8) + "|" + delimiter("txt", path_fotografia, 200);
    }
}
*/
