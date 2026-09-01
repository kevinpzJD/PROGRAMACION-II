package com.mycompany.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Ingrese a,b,c,...");
       double a=s.nextDouble();
       double b=s.nextDouble();
       double c=s.nextDouble();
       double d=s.nextDouble();
       double e=s.nextDouble();
       double f=s.nextDouble();
       
       var ecuacion=new EcuacionLineal(a, b, c, d, e, f);
       
       if (ecuacion.tieneSolucion()){
           System.out.println("La solucion en X es: " + ecuacion.getX());
           System.out.println("La solucion en Y es: " + ecuacion.getY()); 
       }
       else{
           System.out.println("La ecuacion no tiene solucion");
       
       }
    }
}
