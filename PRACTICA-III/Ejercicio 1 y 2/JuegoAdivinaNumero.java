package com.mycompany.aplicacion;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego{
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega(){
        reiniciaPartida();
        this.numeroAAdivinar=(int) (Math.random()*11);
        boolean jugar=true;
        Scanner sc=new Scanner(System.in);
        while (jugar){
        System.out.println("Ingrese un numero del 0 al 10");
        int nusuario=sc.nextInt();
        
        if (validaNumero(nusuario)){
            System.out.println("el numero esta entre 0 y 10");
        }
        else{
            System.out.println("el numero esta fuera de rango");
            continue;
        }
  
        if (nusuario==numeroAAdivinar){
            System.out.println("Acertaste");
            actualizarRecord();
            jugar=false;
        }
        else{
            boolean vidas=quitaVida();
            if ( vidas){
                if(nusuario<numeroAAdivinar){
                    System.out.println("el numero a adivinar es mayor,intente de nuevo");
                }
                else{
                    System.out.println("el numero es menor ,intente de nuevo");
                }
            }
            else{
                System.out.println("sin vidas,fin");
                jugar=false;
            }
        }
       }
    } 
    public boolean validaNumero(int numero){
        if(numero>=0 && numero<=10){
            return true;
        }
        else{
            return false;
        }
    }
    
}
