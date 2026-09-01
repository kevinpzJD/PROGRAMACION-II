
package com.mycompany.ejercicio2;

public class EcuacionLineal {
    
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public EcuacionLineal(double a, double b, double c, double d, double e,double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public boolean tieneSolucion(){
         double s=(this.a*this.d)-(this.b*this.c);
         if (s!=0){
             return true;
         }
         return false;
    }
    
    public double getX(){
        double m=(this.e*this.d)-(this.b*this.f);
        double n=(this.a*this.d)-(this.b*this.c);
        return m/n;
    }
    public double getY(){
        double m=(this.a*this.f)-(this.e*this.c);
        double n=(this.a*this.d)-(this.b*this.c);
        return m/n;
    }
    
    
   
}
