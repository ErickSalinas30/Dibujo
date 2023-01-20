/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u03_03.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import p61.u03_03.controlador.ViajeControl;

/**
 *
 * @author Mauricio Ortiz
 */
public class VentanaViaje extends JFrame implements ActionListener, KeyListener, MouseListener {

    private ViajeControl viajeControl;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;

    public VentanaViaje() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.viajeControl = new ViajeControl();
        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();

        this.jPanelList.add(new JPanel());

        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));

        this.jTextFieldList.add(new JTextField("", 5));
        this.jTextFieldList.add(new JTextField("", 10));
        this.jTextFieldList.add(new JTextField("", 10));
        this.jTextFieldList.add(new JTextField("", 5));
        this.jTextFieldList.add(new JTextField("", 5));
        this.jTextFieldList.add(new JTextField("", 5));

        this.jLabelList.add(new JLabel("Ingrese el código: "));
        this.jLabelList.add(new JLabel("Ingrese el origen: "));
        this.jLabelList.add(new JLabel("Ingrese el destino: "));
        this.jLabelList.add(new JLabel("Ingrese el fecha: "));

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));
        this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jTextFieldList.get(2));
        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jTextFieldList.get(3));
        this.jPanelList.get(0).add(this.jTextFieldList.get(4));
        this.jPanelList.get(0).add(this.jTextFieldList.get(5));

        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));

        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this);
        
        this.jTextFieldList.get(1).addKeyListener(this);
        
        this.jLabelList.get(0).addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jButtonList.get(0))) {
            this.viajeControl.crear(this.recuperarDatosIngresados());
            this.limpiarDatosIngresados();
        }

        if (e.getSource().equals(this.jButtonList.get(1))) {
            for (var viaje : this.viajeControl.listar()) {
                System.out.println("viaje = " + viaje.toString());
            }
        }

    }

    private void limpiarDatosIngresados() {
        for (var i = 0; i < 6; i++) {
            this.jTextFieldList.get(i).setText("");
        }
    }

    private String[] recuperarDatosIngresados() {
        String[] retorno = new String[6];
        retorno[0] = this.jTextFieldList.get(0).getText();
        retorno[1] = this.jTextFieldList.get(1).getText();
        retorno[2] = this.jTextFieldList.get(2).getText();
        retorno[3] = this.jTextFieldList.get(3).getText();
        retorno[4] = this.jTextFieldList.get(4).getText();
        retorno[5] = this.jTextFieldList.get(5).getText();
        return retorno;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyLocation()+" soltó la tecla");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e.getPoint().toString());
        System.out.println(e.getClickCount());
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
