/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUItienda;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Ricardo Villeda
 */
public class GUItienda extends JPanel{
    public JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10;
    public ImageIcon imagen1,imagen2,imagen3, imagen4,imagen5,imagen6, imagen7,imagen8,imagen9, imagen10, img1;
    public JLabel fondo,info1, info2, info3, info4, info5, info6, info7, info8, info9, info10;
    
    public  GUItienda(){
       imagen2 = new ImageIcon(getClass().getResource("7F4.jpg"));
       fondo = new JLabel(imagen2);
       fondo.setBounds(0,0,900,900);
       
       /*
       Agregando los botones de los objetos de la tienda
       */
       imagen1 = new ImageIcon(getClass().getResource("espada.jpg"));
       boton1 = new JButton("boton1");
       boton1.setIcon(imagen1);
       boton1.setBounds(20, 20,90, 90);
       
       info1 = new JLabel("info1");
       img1 =new ImageIcon(getClass().getResource("info1.JPG"));
       info1.setIcon(img1);
      info1.setBounds(20,120, 220, 220);
       
       imagen2 = new ImageIcon(getClass().getResource("botas.jpg"));
       boton2 = new JButton("boton2");
       boton2.setIcon(imagen2);
       boton2.setBounds(120, 20,90, 90);
       
       
       imagen3 = new ImageIcon(getClass().getResource("espada2.jpg"));
       boton3 = new JButton("boton3");
       boton3.setIcon(imagen3);
       boton3.setBounds(220, 20,90, 90);
       
       imagen4 = new ImageIcon(getClass().getResource("gema.jpg"));
       boton4 = new JButton("boton4");
       boton4.setIcon(imagen4);
       boton4.setBounds(320, 20,90, 90);
       
       
       imagen5 = new ImageIcon(getClass().getResource("KEY.JPG"));
       boton5 = new JButton("boton5");
       boton5.setIcon(imagen5);
       boton5.setBounds(420, 20,90, 90);
       
       
       imagen6 = new ImageIcon(getClass().getResource("martillo.JPG"));
       boton6 = new JButton("boton6");
       boton6.setIcon(imagen6);
       boton6.setBounds(20, 320,90, 90);
       
       imagen7 = new ImageIcon(getClass().getResource("pocion.JPG"));
       boton7 = new JButton("boton7");
       boton7.setIcon(imagen7);
       boton7.setBounds(120, 320,90, 90);
       
       
       imagen8 = new ImageIcon(getClass().getResource("sepa.JPG"));
       boton8 = new JButton("boton8");
       boton8.setIcon(imagen8);
       boton8.setBounds(220, 320,90, 90);
       
       
       imagen9 = new ImageIcon(getClass().getResource("sepa2.JPG"));
       boton9 = new JButton("boton9");
       boton9.setIcon(imagen9);
       boton9.setBounds(320, 320,90, 90);
       
       imagen10 = new ImageIcon(getClass().getResource("varita.JPG"));
       boton10 = new JButton("boton10");
       boton10.setIcon(imagen10);
       boton10.setBounds(420, 320,90, 90);
       
       
       add(boton1);
       add(info1);
       add(boton2);
       add(boton3);
       add(boton4);
       add(boton5);
       add(boton6);
       add(boton7);
       add(boton8);
       add(boton9);
       add(boton10);
       add(fondo);
       
       setLayout(null);
       setPreferredSize(new Dimension(900,900));
   }
}
