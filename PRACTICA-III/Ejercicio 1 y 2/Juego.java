
package com.mycompany.aplicacion;

public class Juego {
    protected int numeroDeVidas;
    protected int record;
    ;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        
    }
    public void reiniciaPartida(){
        System.out.println("Reiniciando la partida");
    }
    
    public void actualizarRecord(){
        System.out.println("actualizando record");
        
    }
    public boolean quitaVida(){
        System.out.println("menos 1 de vida");
        this.numeroDeVidas=this.numeroDeVidas-1;
        return this.numeroDeVidas>0;
        
    }
}
