/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cositasgraficas;

import java.awt.Color;

/**
 *
 * @author bielc
 */
public class Finestra extends javax.swing.JFrame {
    
    private javax.swing.JLabel jEtSaludo;
    private javax.swing.JTextArea jtext;
    private javax.swing.JTextField jcampodetexto;
    private javax.swing.JButton jBtSaludo;
    javax.swing.JPanel Marco;
   
    public Finestra(){
    this.setSize(450,300);
    setTitle("Primera Ventana");
    initComponents();
    }
    private void initComponents(){
    this.jEtSaludo = new javax.swing.JLabel();  
    this.jcampodetexto = new javax.swing.JTextField();
//    this.jBtSaludo = new javax.swing.JButton();
    this.getContentPane().setLayout(null);
//    this.getContentPane().add(jtext);
//    jtext.setVisible(true);
    this.getContentPane().add(jcampodetexto);
    jcampodetexto.setVisible(true);
    
        
    addWindowListener(new java.awt.event.WindowAdapter (){
        
    @Override
    public void windowClosing (java.awt.event.WindowEvent evt){
    exitForm(evt);
    }
    });
    
    this.jEtSaludo.setText("hola mundo");
    this.jEtSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    this.jEtSaludo.setFont(new java.awt.Font("Arial",1,30));
    this.getContentPane().add(jEtSaludo);
    this.jEtSaludo.setBounds(75,75,300,70);
//    this.jtext.setBounds(0, 0, 450, 75);
//    this.jtext.setkground(Color.CYAN);
      this.jcampodetexto.setBounds(0, 0, 450, 50);
      this.jcampodetexto.setBackground(Color.CYAN);
      
    
//    this.jBtSaludo.setToolTipText("pitjem :)");
//    this.jBtSaludo.setMnemonic('C');//
//    this.jBtSaludo.setText("boton numero 1");
//    this.getContentPane().add(jBtSaludo);
//    this.jBtSaludo.setBounds(42, 90, 150, 50);
    }
    
    
    private void exitForm(java.awt.event.WindowEvent evt){
     System.exit(0);
    }
   
}
