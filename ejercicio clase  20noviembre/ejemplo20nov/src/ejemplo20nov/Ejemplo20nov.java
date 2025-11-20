/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo20nov;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejemplo20nov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String mensaje = "";
        int dias;
        double costo_dia;
        int contador = 1;
        double total;

        while (contador <= 5) {
            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el numero de dias trabajados");
            dias = entrada.nextInt();
            System.out.println("Ingrese el costo por dia");
            costo_dia = entrada.nextDouble();
            total = (dias * costo_dia);
            entrada.nextLine();
            mensaje = String.format("%sNombre %s dias %s, costo por dia "
                    + "$%.2f total $%.2f\n", mensaje, nombre, dias, 
                    costo_dia, total);

            contador = (contador + 1);

        }
        System.out.println(mensaje);

    }

}
