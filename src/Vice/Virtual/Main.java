/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice.Virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author nazarov
 * 
 * Реализация виртуального заместителя. По всем пунктам он что и тот что по сети
 * работал, но просто в одельном потоке что ли выполнение
 */
public class Main {
    
    public static void main (String[] args) throws Exception {
        Main testDrive = new Main();
    }
 
    public Main() throws Exception{
        // Создание панели и меню
        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        URL urlIMG = new URL("https://docs.oracle.com/javase/tutorial/figures/uiswing/components/LabelDemoMetal.png");
        Icon icon = new ImageProxy(urlIMG);
        JLabel label1 = new JLabel("Image and Text", icon, JLabel.CENTER);
        frame.getContentPane().add(label1);
        frame.setVisible(true);
    }
}


