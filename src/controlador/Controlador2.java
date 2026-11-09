/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import view.Quizzes;
import view.telaIntroducao;
import view.telaCreditos;
import view.telaFalhou;
/**
 *
 * @author Discentes
 */
public class Controlador2 {
    

    private JDesktopPane jDesktopPane1;
    private JButton jButtonCome, jButtonIntro, jButtonCredi;

    private Component[] componentesMenu;
    private JPanel painelAtual;

    // Construtor
    public Controlador2(JDesktopPane desktop,
                        JButton come,
                        JButton intro,
                        JButton credi) {

        this.jDesktopPane1 = desktop;
        this.jButtonCome = come;
        this.jButtonIntro = intro;
        this.jButtonCredi = credi;

        componentesMenu = desktop.getComponents();
    }

    // Abrir tela Começar
    public void AbrirTelaCome() {

        for (Component componente : componentesMenu) {
            componente.setVisible(false);
        }

        if (painelAtual != null) {
            jDesktopPane1.remove(painelAtual);
        }

        
    }
    
    int perguntaAtual = 1;

public void carregarPergunta() {
    if (perguntaAtual == 1) {
        jLabelPergunta.setText("Qual é a capital do Brasil?");
        btnA.setText("São Paulo");
        btnB.setText("Brasília");
        btnC.setText("Rio de Janeiro");
        btnD.setText("Salvador");
    }

    else if (perguntaAtual == 2) {
        jLabelPergunta.setText("Qual é o maior planeta do Sistema Solar?");
        btnA.setText("Terra");
        btnB.setText("Marte");
        btnC.setText("Júpiter");
        btnD.setText("Vênus");
    }

}
    
    public void iniciarPartida() {

        perguntaAtual = 1;
        carregarPergunta();
    }

    // Abrir tela Introdução
    public void AbrirTelaIntro() {

        for (Component componente : componentesMenu) {
            componente.setVisible(false);
        }

        if (painelAtual != null) {
            jDesktopPane1.remove(painelAtual);
        }

        Dimension resolucao = jDesktopPane1.getSize();
        telaIntroducao tela1 = new telaIntroducao(this);

        tela1.setSize(resolucao);
        tela1.setLocation(0, 0);

        jDesktopPane1.add(tela1);
        tela1.setVisible(true);

        painelAtual = tela1;

        jDesktopPane1.revalidate();
        jDesktopPane1.repaint();
    }

    // Abrir tela Créditos
    public void AbrirTelaCredi() {

        for (Component componente : componentesMenu) {
            componente.setVisible(false);
        }

        if (painelAtual != null) {
            jDesktopPane1.remove(painelAtual);
        }

        Dimension resolucao = jDesktopPane1.getSize();
        telaCreditos tela3 = new telaCreditos(this);

        tela3.setSize(resolucao);
        tela3.setLocation(0, 0);

        jDesktopPane1.add(tela3);
        tela3.setVisible(true);

        painelAtual = tela3;

        jDesktopPane1.revalidate();
        jDesktopPane1.repaint();
    }

    // Abrir tela Falhou
    public void AbrirTelaFalhou() {

        if (painelAtual != null) {
            jDesktopPane1.remove(painelAtual);
        }

        Dimension resolucao = jDesktopPane1.getSize();
        telaFalhou tela4 = new telaFalhou(this);

        tela4.setSize(resolucao);
        tela4.setLocation(0, 0);

        jDesktopPane1.add(tela4);
        tela4.setVisible(true);

        painelAtual = tela4;

        jDesktopPane1.revalidate();
        jDesktopPane1.repaint();
    }

    // Retornar ao menu principal
    public void voltar(JPanel painel) {

        if (painel == painelAtual &&
            painel.getParent() == jDesktopPane1) {

            jDesktopPane1.remove(painel);
            painelAtual = null;

            for (Component componente : componentesMenu) {
                componente.setVisible(true);
            }

            jDesktopPane1.revalidate();
            jDesktopPane1.repaint();
        }
    }
}

