/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUItienda;

import Jugador.Jugador;
import Jugador.Objetos;
import Objetos.Items.Items;
import Objetos.ProductorTienda;
import Objetos.Tienda;
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
public class GUItienda extends JPanel {
    
    public JButton boton,boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10;
    public ImageIcon imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10, img1, img2;
    public JLabel fondo, fondo1;
    Jugador player = new Jugador();
    Objetos obj = new Objetos();

    public GUItienda() {
        img1 = new ImageIcon(getClass().getResource("Fondo.jpg"));
        fondo1 = new JLabel(img1);
        fondo1.setBounds(0, 0, 900, 700);
        
        img2 = new ImageIcon(getClass().getResource("boton.png"));
        boton = new JButton();
        boton.setIcon(img2);
        boton.setBounds(413, 53, 80 , 70);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ve =  new JFrame("ventana");
                ve = new Tienda2();
                ve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ve.setResizable(false);
                ve.pack();
                ve.setVisible(true);
                
                

            }

        });
        
        add(boton);
        add(fondo1);
        
        setLayout(null);
        setPreferredSize(new Dimension(900, 700));
    }  
}
    
    
