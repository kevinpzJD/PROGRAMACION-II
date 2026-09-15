package com.mycompany.ejercicio2;
public class AlgebraVectorial {
    private double ax;
    private double bx;
    private double ay;
    private double by;
    
    public AlgebraVectorial(){
        this.ax = 0;
        this.ay = 0;
        this.bx = 0;
        this.by = 0;
    }
    public AlgebraVectorial(double ax, double ay, double bx, double by){
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
    }
    /* a) */
    public void Perpendicular(){
        double s = Math.sqrt(Math.pow(this.ax + this.bx, 2) + Math.pow(this.ay + this.by, 2));
        double s1 = Math.sqrt(Math.pow(this.ax - this.bx, 2) + Math.pow(this.ay - this.by, 2));
        if (s == s1){
            System.out.println("Es perpendicular");
        } else {
            System.out.println("No es perpendicular");
        }
    }
    /* b)*/
    public void Perpendicular(double a){
        double s1 = Math.sqrt(Math.pow(this.ax - this.bx, 2) + Math.pow(this.ay - this.by, 2));
        double s2 = Math.sqrt(Math.pow(this.bx - this.ax, 2) + Math.pow(this.by - this.ay, 2));
        if (s1 == s2){
            System.out.println("Es perpendicular");
        } else {
            System.out.println("No es perpendicular");
        }
    }
    /* c) */
    public void Perpendicular(double a, double b){
        double s = (this.ax * this.bx) + (this.ay * this.by);
        if (s == 0){
            System.out.println("El vector es ortogonal");
        } else {
            System.out.println("El vector no es ortogonal");
        }
    }
    /* d)  */
    public void Perpendicular(double a, double b, double c){
        double i = Math.pow(this.ax + this.bx, 2) + Math.pow(this.ay + this.by, 2);
        double d = Math.pow(this.ax, 2) + Math.pow(this.ay, 2) + Math.pow(this.bx, 2) + Math.pow(this.by, 2);
        if (i == d){
            System.out.println("El vector es ortogonal");
        } else {
            System.out.println("El vector no es ortogonal");
        }
    }
    /* e)  */
    public void Paralela(double r){
        double c1 = r * this.bx;
        double c2 = r * this.by;
        if (this.ax == c1 && this.ay == c2){
            System.out.println("El vector es paralelo");
        } else {
            System.out.println("El vector no es paralelo");
        }     
    }
    /* f)  */
    public void Paralela(){
        double d = (this.ax * this.by) - (this.ay * this.bx);
        if (d == 0){
            System.out.println("El vector es paralelo");
        } else {
            System.out.println("El vector no es paralelo");
        }
    }
    /* g)  */
    public void ProyeccionDeAsobreB() {
        double productoEscalar = (this.ax * this.bx) + (this.ay * this.by);
        double magnitudBCuadrado = Math.pow(this.bx, 2) + Math.pow(this.by, 2);
        double k = productoEscalar / magnitudBCuadrado;
        double li = k * this.bx;
        double ld = k * this.by;
        System.out.println("La proyeccion ortogonal de a sobre b es : (" + li + " , " + ld + ")");
    }
    /* h) */
    public void ComponenteDeAenB(){
        double num = (this.ax * this.bx) + (this.ay * this.by);
        double den = Math.sqrt(Math.pow(this.bx, 2) + Math.pow(this.by, 2));
        double sol = num / den;
        System.out.println("El componente de a en b es: " + sol);            
    }
}