package org.example;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico ,NavegadorInternet{

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

    //Aparelho telefonico:

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    //Navegador de Intenet:

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando a página atraves da url: " + url);
    }

    @Override
    public void adicionandoNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
