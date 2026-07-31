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
        
        int opcion;
        do {
            System.out.println("===MENU===");
            System.out.println("1: ¿Es un numero Compuesto? ");
            System.out.println("2: Aproximacion de Euler");
            System.out.println("3: Numero de Amstrong");
            System.out.println("4:FIN ");
            System.out.println("Ingrese una de las opciones: ");
            opcion = leer.nextInt();
                    
            
        } while (opcion != 4);
        
        if (opcion < 1 || opcion > 4) {
            System.out.println(" Error Ingrese una opcion del 1-4");
         
        }
        if (opcion == 1) {
            System.out.println("1: ¿Es un numero Compuesto?");
            System.out.println("\n Ejercicio 1 - Determinar Numero Compuesto");
            
                    
            
        }
     
    }
    
}
