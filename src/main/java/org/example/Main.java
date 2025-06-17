package org.example;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        //Testando reprodutor musical:
        iphone.selecionarMusica("A noite chega (G.A)");
        iphone.tocar();
        iphone.pausar();

        System.out.println("<---------------------------------------------->");

        //Testando aparelho telefonico:
        iphone.ligar("(81) 99840-9867");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("<---------------------------------------------->");

        //Testando navegador de internet
        iphone.exibirPagina("https://github.com/luanmvcosta0");
        iphone.adicionandoNovaAba();
        iphone.atualizarPagina();

    }
}