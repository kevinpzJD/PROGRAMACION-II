
package com.mycompany.aplicacion;

public class Aplicacion {

    public static void main(String[] args) {
        JuegoAdivinaNumero usuario=new JuegoAdivinaNumero(3);
        JuegoAdivinaPar user2=new JuegoAdivinaPar(3);
        JuegoAdivinaImpar user3=new JuegoAdivinaImpar(3);
        System.out.println("--------------Juego adivina un numero-----------");
        usuario.juega();
        System.out.println("---------------Juego adivina par ---------------");
        user2.juega();
        System.out.println("-------------Juego adivina impar");
        user3.juega();
    }
}
