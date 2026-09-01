/*Programacion Estructurada*/

package com.mycompany.ejercicio4.estadistica;
import java.util.Scanner;

public class Ejercicio4Estadistica {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double[] numeros=new double[10];
        llenarVector(s, numeros);
        double promedio=promedioNumeros(numeros);
        double desviacion=desviacionNumeros(numeros,promedio);
        System.out.println("El promedio de los 10 num,eros es: " + promedio);
        System.out.println("La desviacion estandar es: " + desviacion);
        
    }
    
    public static void llenarVector(Scanner s,double[] vnumero){
        for (int i=0;i<vnumero.length;i++){
            System.out.println("Llenar el vector");
            vnumero[i]=s.nextDouble();
        }
    }
    
    public static double promedioNumeros(double[] numerosv){
        double s=0;
        for (int i=0;i<numerosv.length;i++){
            s=s+numerosv[i];
        }
        return s/numerosv.length;
    }
    
    public static double desviacionNumeros(double[] numero ,double prom){
        double s=0;
        for (int i=0;i<numero.length;i++){
            s=s+Math.pow((numero[i]-prom),2);
        }
        return Math.sqrt(s/(numero.length-1));
    }
    
}
