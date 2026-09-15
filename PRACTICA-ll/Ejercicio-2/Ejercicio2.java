package com.mycompany.ejercicio2;
public class Ejercicio2 {

    public static void main(String[] args) {
        AlgebraVectorial vectores = new AlgebraVectorial(3.0, 0.0, 0.0, 4.0);
        System.out.print("Inciso a: ");
        vectores.Perpendicular();
        System.out.print("Inciso b: ");
        vectores.Perpendicular(3.0);
        System.out.print("Inciso c: ");
        vectores.Perpendicular(3.0, 0.0);
        System.out.print("Inciso d: ");
        vectores.Perpendicular(3.0, 0.0, 0.0);
        System.out.print("Inciso e: ");
        vectores.Paralela(2.0);
        System.out.print("Inciso f: ");
        vectores.Paralela();
        System.out.print("g) Proyección: ");
        vectores.ProyeccionDeAsobreB();
        System.out.print("h) Componente: ");
        vectores.ComponenteDeAenB();  
        System.out.println("--------------PRUEBA 2-----------------");
        AlgebraVectorial vectoresParalelos = new AlgebraVectorial(4.0, 6.0, 2.0, 3.0);
        System.out.print("Inciso e (con r=2): ");
        vectoresParalelos.Paralela(2.0);
        System.out.print("Inciso f: ");
        vectoresParalelos.Paralela();
    }  
}