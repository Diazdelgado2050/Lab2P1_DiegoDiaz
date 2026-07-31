/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_diegodiaz;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Lab2P1_DiegoDiaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4){
        
            System.out.println("\n===MENU===");
            System.out.println("1: ¿Es un numero Compuesto? ");
            System.out.println("2: Aproximacion de Euler");
            System.out.println("3: Numero de Amstrong");
            System.out.println("4:FIN ");
            System.out.println("Ingrese una de las opciones: ");
            opcion = leer.nextInt();
            
            if (opcion == 1) {
                
                System.out.println("\nEjercicio 1 - Determinar Numero Compuesto");
                System.out.print("Ingrese un numero:\n");
                int numero = leer.nextInt();
                
                
                
                int divisor = 1;
                int divisores = 0; 

                while (divisor <= numero) {
                    if (numero % divisor == 0) {
                        divisores = divisores + 1; 
                    }
                    divisor = divisor + 1; 
                }

                if (divisores > 2){
               
                    System.out.println("El numero " + numero + " es un numero compuesto!");
                } else {
                    System.out.println("El numero " + numero + " no es un numero compuesto!");
                
                }
            } else if (opcion == 2 ) {
                System.out.println("Ejercicio 2 - Aproximacion de Euler");
                System.out.println("Ingrese nivel de aproximacion: ");
                int nivel = leer.nextInt();
                
                double euler = 1;
                double factorial = 1;
                int contador = 1;
                
                while (contador <= nivel) {
                    factorial = factorial * contador;
                    euler = euler + (1/factorial);
                    contador = contador + 1;
                    
                }
                System.out.println("La aproximacion de euler con un nivel de " + nivel + " es: " + euler);
                 
                       
            } else if (opcion == 3) {
                System.out.println("Ejercicio 3 - Numero de Amstrong");
                System.out.println("Ingrese el numero de amstrong que desea determinar: ");
                int numPrincipal = leer.nextInt();
                
                int temp = numPrincipal;
                int cantidadDigitos = 0;
                
                while (temp > 0) {
                    temp = temp / 10;
                    cantidadDigitos = cantidadDigitos + 1;
                  
                }
                temp = numPrincipal;
                int suma = 0;
                
                while (temp > 0 ) {
                    int digito = temp % 10;
                    
                    int potenciaCalculada = 1;
                    int contadorPotencia = 0;
                    
                    while (contadorPotencia < cantidadDigitos) {
                        potenciaCalculada = potenciaCalculada * digito;
                        contadorPotencia = contadorPotencia + 1;
                        

                    }
                    suma = suma + potenciaCalculada;
                    temp = temp / 10;
                   
                }
                
                if (suma == numPrincipal){
                    
                    System.out.println(numPrincipal + " Es un numero de Amstrong");
                    
                } else {
                    System.out.println(numPrincipal + "No es un numero de Amstrong");
                }
                
            } else if (opcion == 4){
                System.out.println("Fin de el programa... Gracias por Usarme :3");
            } else {
                System.out.println(" Ingrese un numero valido de el 1 al 4... Gracias ");
            }
     
            }
        }
    }
