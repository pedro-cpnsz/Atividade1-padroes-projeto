package br.com.pedrocpnsz.ex01;

import br.com.pedrocpnsz.ex01.veiculos.Caminhao;
import br.com.pedrocpnsz.ex01.veiculos.Carro;

public interface FabricaVeiculo {

    Carro criarCarro();

    Caminhao criarCaminhao();
}
