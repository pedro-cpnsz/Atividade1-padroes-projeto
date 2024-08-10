package br.com.pedrocpnsz.ex01.veiculos;

public class CarroEletrico implements Carro {

    public CarroEletrico() {
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo carro eletrico.");
    }
    
}
