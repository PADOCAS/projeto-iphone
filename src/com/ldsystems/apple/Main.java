package com.ldsystems.apple;

import com.ldsystems.apple.projetos.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone(312322222L);
        iPhone.checarBateria();
        iPhone.verificaMemoriaDisponivel();

        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.exibirPagina();

        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
    }
}
