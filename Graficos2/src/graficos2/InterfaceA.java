/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author bielc
 */
public class InterfaceA extends javax.swing.JFrame {

    private javax.swing.JPanel panelGrande;
    private javax.swing.JPanel panelabajo;
    private javax.swing.JPanel panelpeq;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton botonabajo;

    public InterfaceA() {
        this.setSize(400, 300);
        setTitle("Interficie A");
        initComponents();

    }

    private void initComponents() {
        panelGrande = new javax.swing.JPanel(new BorderLayout());
        panelabajo = new javax.swing.JPanel(new BorderLayout());
        panelpeq = new javax.swing.JPanel(new FlowLayout());
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonabajo = new javax.swing.JButton();
        this.getContentPane().setLayout(null);

        this.panelGrande.setBackground(Color.red);
        this.getContentPane().add(panelGrande);
        this.panelGrande.setBounds(100, 0, 300, 200);

        this.panelabajo.setBackground(Color.BLUE);
        this.getContentPane().add(panelabajo);
        this.panelabajo.setBounds(0, 200, 400, 100);

        this.panelpeq.setBackground(Color.YELLOW);
        this.getContentPane().add(panelpeq);
        this.panelpeq.setBounds(0, 0, 100, 200);

        ////////////////Botones///////////////////////
//        this.panelabajo.setToolTipText("Pitja el botó");
//        this.panelabajo.setMnemonic('C');// alt + c per activar el botó
//        this.boton1.setText("Fes click aquí");
        this.boton1.setText("Fes click aquí");
        this.boton1.setBackground(Color.CYAN);
        this.panelpeq.add(boton1);
        this.boton1.setSize(100, 40);

        this.boton2.setText("Fes click aquí");
        this.boton2.setBackground(Color.BLACK);
        this.panelpeq.add(boton2);
        this.boton2.setSize(100, 40);

        this.boton3.setText("Fes click aquí");
        this.boton3.setBackground(Color.DARK_GRAY);
        this.panelpeq.add(boton3);
        this.boton3.setSize(100, 40);

        this.boton4.setText("Fes click aquí");
        this.boton4.setBackground(Color.GRAY);
        this.panelpeq.add(boton4);
        this.boton4.setSize(100, 40);

        this.boton5.setText("Fes click aquí");
        this.boton5.setBackground(Color.GREEN);
        this.panelpeq.add(boton5);
        this.boton5.setSize(100, 40);

        this.boton6.setText("Fes click aquí");
        this.boton6.setBackground(Color.LIGHT_GRAY);
        this.panelpeq.add(boton6);
        this.boton6.setSize(100, 40);

        this.botonabajo.setText("SALIR");
        this.botonabajo.setBackground(Color.LIGHT_GRAY);
        this.panelabajo.add(botonabajo);
        this.botonabajo.setSize(100, 40);
        this.botonabajo.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitForm(evt);

            }
        });

        ActionListener botones = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Color buttonColor = ((JButton) evt.getSource()).getBackground();
                panelGrande.setBackground(buttonColor);
//        Color buttonColor = boton1.getBackground();
//        panelGrande.setBackground(buttonColor);
            }
        };
        boton1.addActionListener(botones);
        boton2.addActionListener(botones);
        boton3.addActionListener(botones);
        boton4.addActionListener(botones);
        boton5.addActionListener(botones);
        boton6.addActionListener(botones);

        addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
    }

    private void exitForm(java.awt.event.WindowEvent evt) {
        System.exit(0);
    }

    private void exitForm(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}
