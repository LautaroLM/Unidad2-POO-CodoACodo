/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.time.Clock;
import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        String nombre, apellido, hobbie, editorCodigo, sistemaOperativo;
        int edad;
        
        System.out.println("Ingrese su nombre, apellido, edad, hobbie, editor de codigo y sistema operativo favorito.\n");
        
        nombre = reader.next();
        apellido = reader.next();
        edad = reader.nextInt();
        hobbie = reader.next();
        editorCodigo = reader.next();
        sistemaOperativo = reader.next();
        
        System.out.println("Nombre: "+nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nHobbie: "+ hobbie + "\nEditorCodigo: " + editorCodigo+ "\nSistemaOperativo: "+ sistemaOperativo);

    }
}
