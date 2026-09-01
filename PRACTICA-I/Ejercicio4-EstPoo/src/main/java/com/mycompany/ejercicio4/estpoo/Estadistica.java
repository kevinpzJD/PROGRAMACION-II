
package com.mycompany.ejercicio4.estpoo;

public class Estadistica {
    private double[] numeros;   

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }
    
    public double promedio(){
        double s=0;
        for(int i=0;i<numeros.length;i++){
            s=s+numeros[i];
        }
        return s/numeros.length;
    }
    
    public double desviacion(){
        double prom=promedio();
        double s=0;
        for (int i=0;i<numeros.length;i++){
            s=s+Math.pow((numeros[i]-prom), 2);
        }
        return Math.sqrt(s/(numeros.length-1));
    }
    
}
