/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import GUI.VentanaBatalla;
import GUItienda.GUItienda;

import Jugador.Jugador;
import javax.swing.JFrame;

/**
 *
 * @author javie
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Jugador m = new Jugador();
        //VentanaBatalla ventana = new VentanaBatalla(m);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setSize(900,900);
        //ventana.setVisible(true);
        
        
        JFrame ventana1 =  new JFrame("ventana");
        ventana1.setContentPane(new GUItienda());
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setResizable(false);
        ventana1.pack();
        ventana1.setVisible(true);
    }
    
    public void VentanaVisible(VentanaBatalla m){
        
    }
    
}
