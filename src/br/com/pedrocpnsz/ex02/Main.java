package br.com.pedrocpnsz.ex02;

import br.com.pedrocpnsz.ex02.jogos.JogoCartas;
import br.com.pedrocpnsz.ex02.jogos.JogoTabuleiro;

public class Main {

    public static void main(String[] args) {

        FabricaJogo fabricaAdulto = new FabricaJogosAdultos();
        JogoCartas cartasAdulto = fabricaAdulto.criarJogoCartas();
        JogoTabuleiro tabuleiroAdulto = fabricaAdulto.criarJogoTabuleiro();
        cartasAdulto.embaralhar();
        tabuleiroAdulto.jogar();
        
        System.out.println("----------------------------------------------------");

        FabricaJogo fabricaInfantil = new FabricaJogosInfantil();
        JogoCartas cartasInfantil = fabricaInfantil.criarJogoCartas();
        JogoTabuleiro tabuleiroInfantil = fabricaInfantil.criarJogoTabuleiro();
        cartasInfantil.embaralhar();
        tabuleiroInfantil.jogar();
    }

}
