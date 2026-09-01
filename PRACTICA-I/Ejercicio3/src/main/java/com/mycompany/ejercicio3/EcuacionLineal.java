
package com.mycompany.ejercicio3;

public class EcuacionLineal {
    private double a;
    private double b;
    private double c;
    
    public EcuacionLineal(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminante(){
        double s=4*this.a*this.c;
        return (this.b*this.b)-s;
    }
    
    public double getRaiz1(){
        
        double raiz=Math.sqrt(getDiscriminante());
        return (-this.b+raiz)/(2*this.a);
    }
    public double getRaiz2(){
        
        double raiz=Math.sqrt(getDiscriminante());
        return (-this.b-raiz)/(2*this.a);
    }
    
}
