package br.com.pedrocpnsz.ex02;

import br.com.pedrocpnsz.ex02.jogos.JogoCartas;
import br.com.pedrocpnsz.ex02.jogos.JogoCartasInfantil;
import br.com.pedrocpnsz.ex02.jogos.JogoTabuleiro;
import br.com.pedrocpnsz.ex02.jogos.JogoTabuleiroInfantil;

public class FabricaJogosInfantil implements FabricaJogo {

    @Override
    public JogoCartas criarJogoCartas() {
        return new JogoCartasInfantil();
    }

    @Override
    public JogoTabuleiro criarJogoTabuleiro() {
        return new JogoTabuleiroInfantil();
    }
    
    
}
