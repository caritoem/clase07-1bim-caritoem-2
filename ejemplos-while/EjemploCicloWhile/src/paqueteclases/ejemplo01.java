/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteclases;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class ejemplo01 {
    
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        int limite = 10;
         while (contador <=limite) {
             System.out.printf("Contador %d/n", contador);
         }        
    }
    
}
