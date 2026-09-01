
package com.mycompany.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int n=100000;
        double[] numeros = new double[n];
        
        for(int w=0;w<n;w++){
            numeros[w]=Math.random()*10;
        }
        
        var c=new Cronometro();
        c.inicia();
        
        /*Ordenación por Selección */
        for (int i = 0; i < numeros.length-1; i++) {
            int posMinimo = i;
 
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[posMinimo]) {
                    posMinimo = j;
                }
            }
            double aux = numeros[posMinimo];
            numeros[posMinimo] = numeros[i];
            numeros[i] = aux;
        }
        c.detener();
        System.out.println(c.lapsoDeTiempo());
    }
}
