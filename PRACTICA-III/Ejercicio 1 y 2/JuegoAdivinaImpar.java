package com.mycompany.aplicacion;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    public JuegoAdivinaImpar(int numeroDeVidas){
        super(numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int numero){
       
        if ((numero >=0 && numero<=10) && numero%2==1 ){
            return true;
        }
        else{
            System.out.println("error");
            return false;
        }
    }
}
