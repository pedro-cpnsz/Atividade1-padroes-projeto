package br.com.pedrocpnsz.ex01;

import br.com.pedrocpnsz.ex01.veiculos.Caminhao;
import br.com.pedrocpnsz.ex01.veiculos.CaminhaoEletrico;
import br.com.pedrocpnsz.ex01.veiculos.Carro;
import br.com.pedrocpnsz.ex01.veiculos.CarroEletrico;

public class FabricaVeiculosEletricos implements FabricaVeiculo {

    @Override
    public Carro criarCarro() {
        return new CarroEletrico();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoEletrico();
    }

    
}
