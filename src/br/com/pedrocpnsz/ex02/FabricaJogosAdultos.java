package br.com.pedrocpnsz.ex02;

import br.com.pedrocpnsz.ex02.jogos.JogoCartas;
import br.com.pedrocpnsz.ex02.jogos.JogoCartasAdulto;
import br.com.pedrocpnsz.ex02.jogos.JogoTabuleiro;
import br.com.pedrocpnsz.ex02.jogos.JogoTabuleiroAdulto;

public class FabricaJogosAdultos implements FabricaJogo {

    @Override
    public JogoCartas criarJogoCartas() {
        return new JogoCartasAdulto();
    }

    @Override
    public JogoTabuleiro criarJogoTabuleiro() {
        return new JogoTabuleiroAdulto();
    }
    
    
}
