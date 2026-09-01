
package com.mycompany.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Ingrese a,b,c: ");
       double a=s.nextDouble();
       double b=s.nextDouble();
       double c=s.nextDouble();
       var sol=new EcuacionLineal(a, b, c);
       double discr=sol.getDiscriminante();
       if (discr>0){
           System.out.println("La ecuacion tiene dos raices " + sol.getRaiz1() + "  y  " + sol.getRaiz2());
       }
       else if(discr==0){
           System.out.println("La ecuacion tiene una raiz " + sol.getRaiz1());
       }
       else{
           System.out.println("La ecuacion no tiene raices reales ");
       
       }
       
    }
}
