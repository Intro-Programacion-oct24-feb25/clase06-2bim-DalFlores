/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            try {
                System.out.println("Ingrese un país: ");
                String pais = entrada.nextLine();
                
                if (pais.isEmpty()) {
                    throw new IllegalArgumentException("El nombre del país no "
                            + "puede estar vacío.");
                }

                char primerCaracter = Character.toUpperCase(pais.charAt(0));

                if (primerCaracter == 'A' || primerCaracter == 'E' || 
                    primerCaracter == 'I' || primerCaracter == 'O' || 
                    primerCaracter == 'U') {
                    System.out.println("El país comienza con una vocal.");
                } else {
                    throw new Exception("El país no comienza con una vocal.");
                }
            } catch (Exception e) {
                System.out.println("Excepción: " + e.getMessage());
            }
        }
    }
}
