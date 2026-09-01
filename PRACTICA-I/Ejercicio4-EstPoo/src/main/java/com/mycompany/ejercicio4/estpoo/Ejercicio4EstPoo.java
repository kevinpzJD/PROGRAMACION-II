
package com.mycompany.ejercicio4.estpoo;
import java.util.Scanner;
public class Ejercicio4EstPoo {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double[] numeros=new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i=0;i<numeros.length;i++){
            numeros[i]=s.nextDouble();
        }
        var resultados=new Estadistica(numeros);
        System.out.println("El promedio es " + resultados.promedio());
        System.out.println("La desviacion estandar es " + resultados.desviacion());
    }
}
