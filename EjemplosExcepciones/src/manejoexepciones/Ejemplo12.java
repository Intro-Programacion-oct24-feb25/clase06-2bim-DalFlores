/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package manejoexepciones;

 import java.util.InputMismatchException;
 import java.util.Scanner;

/**
 *
 * @author reroes
 */
 public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1;
        int valor2;
        String cadena = "";

        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];

        for (int i = 0; i < resultados.length; i++) {
            try {
                System.out.println("Ingrese el dividendo");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el divisor "
                        + valor1);
                valor2 = entrada.nextInt();
                resultados[i] = valor1 / valor2;
                cadena = String.format("%s%d / %d = %d\n", cadena, 
                        valor1,
                        valor2,
                        resultados[i]);
                
            } catch (ArithmeticException arithmeticException) {
                System.out.printf("Existe un error de tipo %s\n"
                        , arithmeticException);
                i = i-1;
            } catch (InputMismatchException inputMismatchException) {
                entrada.nextLine();

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
                i = i-1;

            }
            
        }

        System.out.printf("%s", cadena);
        
    }
}
    
