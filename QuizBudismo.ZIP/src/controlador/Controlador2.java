/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.plaf.DesktopPaneUI;
import view.Quizzes;
import view.telaCreditos;
import view.telaIntroducao;

/**
 *
 * @author Discentes
 */
public class Controlador2 {
    
    JDesktopPane jDesktopPane1;
    JButton jButtonCome, jButtonIntro, jButtonCredi;

    public Controlador2(JDesktopPane jDesktopPane1, JButton jButtonCome, JButton jButtonIntro, JButton jButtonCredi) {
        this.jDesktopPane1 = jDesktopPane1;
        this.jButtonCome = jButtonCome;
        this.jButtonIntro = jButtonIntro;
        this.jButtonCredi = jButtonCredi;
    }

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    public void setjDesktopPane1(JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
    }

    public JButton getjButtonCome() {
        return jButtonCome;
    }

    public void setjButtonCome(JButton jButtonCome) {
        this.jButtonCome = jButtonCome;
    }

    public JButton getjButtonIntro() {
        return jButtonIntro;
    }

    public void setjButtonIntro(JButton jButtonIntro) {
        this.jButtonIntro = jButtonIntro;
    }

    public JButton getjButtonCredi() {
        return jButtonCredi;
    }

    public void setjButtonCredi(JButton jButtonCredi) {
        this.jButtonCredi = jButtonCredi;
    }
    
    public void AbrirTelaCome(){
          jDesktopPane1.removeAll();
          jDesktopPane1.updateUI();
          Dimension resolucao = jDesktopPane1.getSize();
          Quizzes tela2 = new Quizzes();
        tela2.setSize(resolucao);
        tela2.setLocation(0, 0);
        jDesktopPane1.add(tela2);
        tela2.setVisible(true);
    }
    
    
    
    public void AbrirTelaIntro(){
          jDesktopPane1.removeAll();
          jDesktopPane1.updateUI();
          Dimension resolucao = jDesktopPane1.getSize();
          telaIntroducao tela1 = new telaIntroducao();
        tela1.setSize(resolucao);
        tela1.setLocation(0, 0);
        jDesktopPane1.add(tela1);
        tela1.setVisible(true);
    }
    
    public void AbrirTelaCredi(){
          jDesktopPane1.removeAll();
          jDesktopPane1.updateUI();
          Dimension resolucao = jDesktopPane1.getSize();
          telaCreditos tela3 = new telaCreditos();
        tela3.setSize(resolucao);
        tela3.setLocation(0, 0);
        jDesktopPane1.add(tela3);
        tela3.setVisible(true);
    }
    
    public void voltar() {
        jDesktopPane1.removeAll();
        jDesktopPane1.revalidate();
        jDesktopPane1.repaint();
    }
}
