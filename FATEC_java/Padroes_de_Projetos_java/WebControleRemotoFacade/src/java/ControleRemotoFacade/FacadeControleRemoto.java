/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleRemotoFacade;

import java.util.Scanner;

public class FacadeControleRemoto {

    Scanner entrada = new Scanner(System.in);//recebe as opções do controle.
    private int genero;//tipo de vídeo.
    private int opcao;//opcoes de configuração apos o inicio do filme.
    private BlueRay br;//**ligam antes de escolher o tipo de filme.
    private HomeTheater ht;//**
    private Projetor pro;//**
    private Cadeira cad;
    private Iluminacao luz;
    private Pipoqueira pip;
    private ArCondicionado ar;

    public FacadeControleRemoto() {
    }

    public void ligar() {
        br = new BlueRay();
        br.ligar();
        ar = new ArCondicionado(25);
        ar.ligar();
        ht = new HomeTheater();
        ht.ligar();
        pro = new Projetor();
        pro.ligar();
        this.mostrarOpcoes();
        this.escolherTipo(entrada.nextInt());
        this.mostrarConfiguracoes();
        this.assistindo();
    }

    public void aventura() {
        cad = new Cadeira(130);
        luz = new Iluminacao(4);
        pip = new Pipoqueira("doce", "grande");
        ar = new ArCondicionado(18);
    }

    public void romantico() {
        cad = new Cadeira(160);
        luz = new Iluminacao(6);
        pip = new Pipoqueira("manteiga", "pequeno");
        ar = new ArCondicionado(25);
    }

    public void comedia() {
        cad = new Cadeira(140);
        luz = new Iluminacao(8);
        pip = new Pipoqueira("queijo", "medio");
        ar = new ArCondicionado(20);
    }

    public void acao() {
        cad = new Cadeira(120);
        luz = new Iluminacao(5);
        pip = new Pipoqueira("sal", "grande");
        ar = new ArCondicionado(17);
    }

    public void novela() {
        cad = new Cadeira(180);
        luz = new Iluminacao(7);
        pip = new Pipoqueira("sal", "pequeno");
        ar = new ArCondicionado(22);
    }

    public void esporte() {
        cad = new Cadeira(130);
        luz = new Iluminacao(10);
        pip = new Pipoqueira("sal", "grande");
        ar = new ArCondicionado(19);
    }

    public void show() {
        cad = new Cadeira(160);
        luz = new Iluminacao(5);
        pip = new Pipoqueira("doce", "medio");
        ar = new ArCondicionado(22);
    }

    public void mostrarOpcoes() {
        System.out.println("Escolha sua diversão: ");
        System.out.print("[1-Aventura]");
        System.out.print("[2-Romântico]");
        System.out.println("[3-Comédia]");
        System.out.print("[4-Ação]");
        System.out.print("[5-Novela]");
        System.out.print("[6-Esporte]");
        System.out.println("[7-Show]");
    }

    public void escolherTipo(int tipo) {
        this.genero = tipo;
        switch (genero) {
            case 1:
                System.out.println("Aventura");
                this.aventura();
                break;
            case 2:
                System.out.println("Romântico");
                this.romantico();
                break;
            case 3:
                System.out.println("Comédia");
                this.comedia();
                break;
            case 4:
                System.out.println("Ação");
                this.acao();
                break;
            case 5:
                System.out.println("Novela");
                this.novela();
                break;
            case 6:
                System.out.println("Esporte");
                this.esporte();
                break;
            case 7:
                System.out.println("Show");
                this.show();
                break;
            default:
                System.out.println("escolha de 1 a 7");
                this.escolherTipo(entrada.nextInt());
                break;
        }
    }

    public void mostrarConfiguracoes() {
        System.out.println("\tAr Condicionado: " + ar.getTemperatura() + "º");
        System.out.println("\tReclinando cadeiras em: " + cad.getAngulo() + "º");
        System.out.println("\tIntensidade da luz: " + luz.getIntensidade() + "/10");
        System.out.println("\tPipoca sabor: " + pip.getSabor() + ", tamanho " + pip.getTamanho());
    }

    public void assistindo() {
        System.out.println("assistindo...");
        System.out.println("[8-Pausar] [9-Configurar] [10-Mudar] [0-Desligar]");
        this.outrasOpcoes(entrada.nextInt());
    }

    public void outrasOpcoes(int opcao) {
        this.opcao = opcao;
        switch (opcao) {
            case 8:
                this.pausar();
                break;
            case 9:
                this.configurar();
                break;
            case 10:
                this.mudar();
                break;
            case 0:
                this.desligar();
                System.out.println("Sistema encerrado... Até logo.");
        }

    }

    public void pausar() {
        int play;
        System.out.println("Pausado || tecle qualquer número para despausar");
        play = entrada.nextInt();
        this.assistindo();
    }

    public void configurar() {
        System.out.print("Angulo das cadeiras: ");
        cad.setAngulo(entrada.nextInt());
        System.out.print("Intensidade da luz: ");
        luz.setIntensidade(entrada.nextInt());
        System.out.print("tipo de pipoca: ");
        pip.setSabor(entrada.next());
        System.out.print(" tamanho: ");
        pip.setTamanho(entrada.next());
        System.out.print("Ar condicionado:");
        ar.setTemperatura(entrada.nextInt());
        System.out.println("Novas Configurações:");
        this.mostrarConfiguracoes();
        this.assistindo();
    }

    public void mudar() {
        this.mostrarOpcoes();
        this.escolherTipo(entrada.nextInt());
        this.mostrarConfiguracoes();
        this.assistindo();
    }

    public void desligar() {
        this.ar.desligar();
        this.ht.desligar();
        this.pro.desligar();
        this.br.desligar();
    }

}
