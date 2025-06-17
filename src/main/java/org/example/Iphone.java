package org.example;

public class Iphone implements ReprodutorMusical{

    //Reprodutor Musical:

    private String musicaAtual;
    private boolean tocando;

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            tocando = true;
            System.out.println("Tocando a música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Música pausada.");
        } else {
            System.out.println("Nenhuma música esta tocando.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

}
