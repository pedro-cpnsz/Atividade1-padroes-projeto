package br.com.pedrocpnsz.ex01;

import br.com.pedrocpnsz.ex01.veiculos.Caminhao;
import br.com.pedrocpnsz.ex01.veiculos.CaminhaoCombustao;
import br.com.pedrocpnsz.ex01.veiculos.Carro;
import br.com.pedrocpnsz.ex01.veiculos.CarroCombustao;

public class FabricaVeiculosCombustao implements FabricaVeiculo {

    @Override
    public Carro criarCarro() {
        return new CarroCombustao();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoCombustao();
    }

    
}
