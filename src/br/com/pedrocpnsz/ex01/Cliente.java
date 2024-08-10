package br.com.pedrocpnsz.ex01;

import br.com.pedrocpnsz.ex01.veiculos.Caminhao;
import br.com.pedrocpnsz.ex01.veiculos.Carro;

public class Cliente {

    public static void main(String[] args) {
        FabricaVeiculo fabricaEletrico = new FabricaVeiculosEletricos();
        Carro carroEletrico = fabricaEletrico.criarCarro();
        Caminhao caminhaoEletrico = fabricaEletrico.criarCaminhao();
        carroEletrico.dirigir();
        caminhaoEletrico.transportar();

        FabricaVeiculo fabricaCombustao = new FabricaVeiculosCombustao();
        Carro carroCombustao = fabricaCombustao.criarCarro();
        Caminhao caminhaoCombustao = fabricaCombustao.criarCaminhao();
        carroCombustao.dirigir();
        caminhaoCombustao.transportar();
    }

}
