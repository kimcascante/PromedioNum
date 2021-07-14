package Adicional;
/**
 * Nombre del programa: 
 * Descripcion: Programa que imprime el promedio de numeros
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class leerk {

    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{

        double suma=0;
        double k=0;
        double prom;

        escribir.println("Digite el valor de K:");
        k = Double.parseDouble(leer.readLine());

        for(int count = 1; count <= k; count++){
            escribir.println("Digite un numero:");
            double numero = Double.parseDouble(leer.readLine());

            suma += numero;
        }

        prom = suma / k;

        escribir.println(prom);

    }
}