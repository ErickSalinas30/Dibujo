/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u03_01.vista;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Ventana0301b extends JFrame {
    
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;

    public Ventana0301b() throws HeadlessException {
        this.setTitle("Ventana 0301b");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarLabels();
        this.setContentPane(this.jPanelList.get(0));        
        this.setVisible(true);
    }
    
    private void iniciarPanels(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(Color.white);
        this.jPanelList.get(1).setBackground(Color.yellow);
        this.jPanelList.get(2).setBackground(Color.blue);
        this.jPanelList.get(3).setBackground(Color.red);
        this.jPanelList.get(4).setBackground(Color.green);
        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
    }
    
    public void iniciarLabels(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Amarillo"));
        this.jLabelList.add(new JLabel("Azul"));
        this.jLabelList.add(new JLabel("Rojo"));
        this.jLabelList.add(new JLabel("verde"));
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
    }
    
    
    
}
