package ui;

import javax.swing.*;
import jogo.Jogo;
import jogo.Jogador;

public class InterfaceGrafica {
    private JanelaJogo janelaJogo;
    private Jogo jogo;

    public InterfaceGrafica(Jogo jogo) {
        this.jogo = jogo;
        janelaJogo = new JanelaJogo(jogo);
        janelaJogo.atualizar();
    }

    public void atualizar() {
        janelaJogo.atualizar();
    }

    public void fechar() {
        janelaJogo.dispose();
    }
}
