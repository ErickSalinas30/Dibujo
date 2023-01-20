/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u03_03.vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Ventana0303a extends JFrame implements ActionListener{
    
    
    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;
    
    
    

    public Ventana0303a(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.iniciarJButtons();
        this.iniciarJCheckBoxs();
        this.iniciarJRadioButtons();
        this.iniciarCombos();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }
    
    public void iniciarPanels(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        
        this.jPanelList.get(0).setLayout(new GridLayout(10,1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(0).add(this.jPanelList.get(10));
        
        
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        
 
    }
    
    public void iniciarJTextFields(){
        this.jLabelList = new ArrayList<>();
        
        this.jLabelList.add(new JLabel("Ingrese el código: "));
        this.jLabelList.add(new JLabel("Ingrese el nombre: "));
        this.jLabelList.add(new JLabel("Ingrese el peso: "));
        this.jLabelList.add(new JLabel("Ingrese el estatura: "));
        this.jLabelList.add(new JLabel("Ingrese la fecha de nacimiento (aaaa/mm/dd): "));
        
        this.jTextFieldList = new ArrayList<>();
        
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField("yyyy"));
        this.jTextFieldList.add(new JTextField("mm"));
        this.jTextFieldList.add(new JTextField("dd"));
        
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(5));
        this.jPanelList.get(5).add(this.jTextFieldList.get(6));
        
    
    }
    
    public void iniciarJButtons(){
        this.jButtonList = new ArrayList<>();
        
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Cancelar"));
        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this);
        
        this.jPanelList.get(6).add(this.jButtonList.get(0));
        this.jPanelList.get(6).add(this.jButtonList.get(1));

    }
    
    public void iniciarJCheckBoxs(){
        this.jCheckBoxList = new ArrayList<>();
        
        this.jCheckBoxList.add(new JCheckBox("Arquero",true));
        this.jCheckBoxList.add(new JCheckBox("Defensa"));
        this.jCheckBoxList.add(new JCheckBox("Mediocampo"));
        this.jCheckBoxList.add(new JCheckBox("Delantero"));
        
        this.jCheckBoxList.get(0).addActionListener(this);
        
        this.jPanelList.get(7).add(this.jCheckBoxList.get(0));
        this.jPanelList.get(7).add(this.jCheckBoxList.get(1));
        this.jPanelList.get(7).add(this.jCheckBoxList.get(2));
        this.jPanelList.get(7).add(this.jCheckBoxList.get(3));
        
    }
    
    public void iniciarJRadioButtons(){
        this.jRadioButtonList = new ArrayList<>();
        var buttonGroup = new ButtonGroup();
        
        this.jRadioButtonList.add(new JRadioButton("Varón"));
        this.jRadioButtonList.add(new JRadioButton("Mujer"));
        
        buttonGroup.add(this.jRadioButtonList.get(0));
        buttonGroup.add(this.jRadioButtonList.get(1));
        
        this.jPanelList.get(8).add(this.jRadioButtonList.get(0));
        this.jPanelList.get(8).add(this.jRadioButtonList.get(1));
        
    }
    
    public void iniciarCombos(){
        this.jComboBoxList = new ArrayList<>();
        var listaPaises = new String[4];
        listaPaises[0]="Qatar";
        listaPaises[1]="Ecuador";
        listaPaises[2]="Paises Bajos";
        listaPaises[3]="Senegal";
        
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaPaises)));
        this.jComboBoxList.add(new JComboBox());
        
        
        
        
        this.jPanelList.get(9).add(this.jComboBoxList.get(0));
        this.jPanelList.get(10).add(this.jComboBoxList.get(1));
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Guardar")){
                System.out.println(this.recuperarDatosIngresados()[0]);
        }
        if(e.getSource().equals(this.jButtonList.get(1))){
            this.limpiarDatosIngressados();
        }
        
    }
    
    
    private void limpiarDatosIngressados(){
        this.jTextFieldList.get(0).setText("");
    }
    
    public String [] recuperarDatosIngresados(){
        var retorno = new String[12];
        retorno[0]=this.jTextFieldList.get(0).getText();
        if(this.jRadioButtonList.get(0).isSelected()){
            retorno[1]="SI";
        }
        else{
            retorno[1]="NO";
        }
        
        
        
        return retorno;
    }
    
    
}
