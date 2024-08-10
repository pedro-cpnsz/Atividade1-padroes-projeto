package br.com.pedrocpnsz.ex02;

import br.com.pedrocpnsz.ex02.jogos.JogoCartas;
import br.com.pedrocpnsz.ex02.jogos.JogoTabuleiro;

public interface FabricaJogo {
    
    JogoCartas criarJogoCartas();
    
    JogoTabuleiro criarJogoTabuleiro();
}
