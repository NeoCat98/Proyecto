/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Jugador.Jugador;
import Villano.Villano;
import java.awt.Container;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author javie
 */
public class VentanaBatalla extends JFrame{
    
    public int WIDTH = 400, widthTF = 120, widthB = 100,posImageJX = 25 ,posImageVX = 325;
    public int HEIGHT = 400, heightTF = 30, heightB = 30,posImageJY = 325 ,posImageVY = 325;
    public JTextField textF3;
    public JButton buttonAtaque, buttonMagia, buttonObjetos, buttonCorrer, buttonEnemigo1,buttonEnemigo2,buttonRegresar;
    public JLabel nombreJugador,vidaJugador,manaJugador,nombreVillano1,vidaVillano1,nombreVillano2,vidaVillano2,fondo,personaje,villano1,villano2;  
    public ImageIcon imagen,imagen2,imagen3,imagen4;
    public TextArea infoBatalla;
    public ArrayList<JButton> items;
    public ArrayList<JButton> magia;
    
    public VentanaBatalla(Jugador j){
        Villano v = new Villano();
        Villano s = new Villano();
        
        //Imagen        
        imagen = new ImageIcon(getClass().getResource("BosqueNoche.jpg"));
        fondo = new JLabel(imagen);
        fondo.setBounds(0,0,500,500);
        
        imagen2 = new ImageIcon(getClass().getResource("dsBuffer.gif"));
        personaje = new JLabel(imagen2);
        personaje.setBounds(posImageJX,posImageJY, 150, 150);
        
        imagen3 = new ImageIcon(getClass().getResource("malo.gif"));
        villano1 = new JLabel(imagen3);
        villano1.setBounds(posImageVX,posImageVY,150,150);
        
        imagen4 = new ImageIcon(getClass().getResource("malo2.gif"));
        villano2 = new JLabel(imagen4);
        villano2.setBounds(posImageVX-50,posImageVY-50,150,150);
        
        //
        infoBatalla = new TextArea();
        add(infoBatalla);
        
        //Botones
        buttonAtaque = new JButton("Atacar");
        buttonAtaque.setBounds(new Rectangle(10,500,widthB,heightB));
        
        buttonEnemigo1 = new JButton(v.getNombre());
        buttonEnemigo1.setBounds(new Rectangle(10,500,widthB,heightB));
        
        buttonEnemigo2 = new JButton("Ninja");
        buttonEnemigo2.setBounds(new Rectangle(120,500,widthB,heightB));
        
        buttonMagia = new JButton("Magia");
        buttonMagia.setBounds(new Rectangle(10,525,widthB,heightB));
        
        buttonObjetos = new JButton("Objetos");
        buttonObjetos.setBounds(new Rectangle(120,500,widthB,heightB));
        
        buttonCorrer = new JButton("Escapar");
        buttonCorrer.setBounds(new Rectangle(120,525,widthB,heightB));
        
        buttonRegresar = new JButton("Regresar");
        buttonRegresar.setBounds(new Rectangle(10,525,widthB,heightB));
        
        //Nombres,vida
        nombreJugador = new JLabel(j.getNombre());
        nombreJugador.setBounds(250,500,widthB,heightB);
        
        nombreVillano1 = new JLabel(v.getNombre());
        nombreVillano1.setBounds(250,500,widthB,heightB);
        
        nombreVillano2 =  new JLabel("Ninja");
        nombreVillano2.setBounds(250,525,widthB,heightB);
  
        vidaJugador = new JLabel("HP: "+j.getVidaActual()+"/"+j.getVidaTotal());
        vidaJugador.setBounds(300,500,widthB,heightB);
        
        manaJugador = new JLabel("MP: "+j.getMagiaActual()+" / "+j.getMagiaTotal());
        manaJugador.setBounds(300,525,widthB,heightB);
        
        vidaVillano1 = new JLabel("HP: "+v.getVidaActual()+" / "+v.getVidaTotal());
        vidaVillano1.setBounds(350,500,widthB,heightB);
        
        vidaVillano2 = new JLabel("HP: "+v.getVidaActual()+" / "+v.getVidaTotal());
        vidaVillano2.setBounds(350,525,widthB,heightB);
        
        buttonAtaque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuInvisible();
                buttonRegresar.setVisible(true);
                if(v.getVidaActual()>0 && s.getVidaActual()>0){
                    buttonEnemigo1.setVisible(true);
                    nombreVillano1.setVisible(true);
                    vidaVillano1.setVisible(true);
                    buttonEnemigo2.setVisible(true);
                    nombreVillano2.setVisible(true);
                    vidaVillano2.setVisible(true);
                }
                if(v.getVidaActual()>0 && s.getVidaActual()<=0){
                    buttonEnemigo1.setVisible(true);
                    nombreVillano1.setVisible(true);
                    vidaVillano1.setVisible(true);
                }
                if(s.getVidaActual()>0 && v.getVidaActual()<=0){
                    buttonEnemigo2.setVisible(true);
                    nombreVillano2.setVisible(true);
                    vidaVillano2.setVisible(true);
                }
            }
        });
        
        buttonMagia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
            }
        });
        
        buttonObjetos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(int i = 1; i <= 9; i++) {
                    items.add(new JButton(String.valueOf(i)));
                }
            }
        });
        
        buttonCorrer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OcultarTodo();
            }
        });
        
        buttonEnemigo1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEnemigo1.setVisible(false);
                buttonEnemigo2.setVisible(false);
                nombreVillano1.setVisible(false);
                vidaVillano1.setVisible(false);
                nombreVillano2.setVisible(false);
                vidaVillano2.setVisible(false);
                v.setVidaActual(Atacar(j,v));
                if(v.getVidaActual()<=0){
                    villano1.setVisible(false);
                }
                vidaVillano1.setText("HP: "+v.getVidaActual()+" / "+v.getVidaTotal());
                if(s.getVidaActual()>0 && v.getVidaActual()>0){
                    EnemigoAtaca(j,s);
                    EnemigoAtaca(j,v);    
                }
                if(s.getVidaActual()<=0 && v.getVidaActual()>0){
                    EnemigoAtaca(j,v);
                }
                if(s.getVidaActual()>0 && v.getVidaActual()<=0){
                    EnemigoAtaca(j,s);
                }
                vidaJugador.setText("HP: "+j.getVidaActual()+" / "+j.getVidaTotal());
                MenuVisible(j);
                if(j.getVidaActual() == 0 ){
                    OcultarTodo();
                    System.out.println("GAME OVER");
                }
                
            }
        });
        buttonEnemigo2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEnemigo1.setVisible(false);
                buttonEnemigo2.setVisible(false);
                nombreVillano1.setVisible(false);
                vidaVillano1.setVisible(false);
                nombreVillano2.setVisible(false);
                vidaVillano2.setVisible(false);
                s.setVidaActual(Atacar(j,s));
                if(s.getVidaActual()<=0){
                    villano2.setVisible(false);
                }
                vidaVillano2.setText("HP: "+s.getVidaActual()+" / "+s.getVidaTotal());
                if(s.getVidaActual()<=0 && v.getVidaActual()<=0){
                    OcultarTodo();
                }
                if(s.getVidaActual()>0 && v.getVidaActual()>0){
                    EnemigoAtaca(j,s);
                    EnemigoAtaca(j,v);
                }
                if(s.getVidaActual()<=0 && v.getVidaActual()>0){
                    EnemigoAtaca(j,v);
                }
                if(s.getVidaActual()>0 && v.getVidaActual()<=0){
                    EnemigoAtaca(j,s);
                }
                if(j.getVidaActual()<0){
                    j.setVidaActual(0);
                }
                vidaJugador.setText("HP: "+j.getVidaActual()+" / "+j.getVidaTotal());
                MenuVisible(j);
                if(j.getVidaActual() == 0){
                    OcultarTodo();
                    System.out.println("GAME OVER");
                }
            }
        });
        
        buttonRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEnemigo1.setVisible(false);
                buttonEnemigo2.setVisible(false);
                nombreVillano2.setVisible(false);
                vidaVillano2.setVisible(false);
                nombreVillano1.setVisible(false);
                vidaVillano1.setVisible(false);
                buttonRegresar.setVisible(false);
                MenuVisible(j);
                if(s.getVidaActual()<=0 && v.getVidaActual()<=0){
                    OcultarTodo();
                }
            }
            
        });
        
        add(buttonAtaque);
        add(buttonMagia);
        add(buttonObjetos);
        add(buttonCorrer);
        add(nombreJugador);
        add(nombreVillano1);
        add(nombreVillano2);
        add(vidaVillano1);
        add(vidaVillano2);
        add(vidaJugador);
        add(manaJugador);
        add(personaje);
        add(villano1);
        add(villano2);
        add(buttonRegresar);
        add(fondo);
        add(buttonEnemigo1);
        add(buttonEnemigo2);
        
        buttonEnemigo1.setVisible(false);
        buttonEnemigo2.setVisible(false);
        nombreVillano1.setVisible(false);
        vidaVillano1.setVisible(false);
        nombreVillano2.setVisible(false);
        vidaVillano2.setVisible(false);
        buttonRegresar.setVisible(false);
        
        setLayout(null);
        setPreferredSize(new Dimension(1000,1000));
    }
    
    public void MenuInvisible(){
        buttonAtaque.setVisible(false);
        buttonMagia.setVisible(false);
        buttonObjetos.setVisible(false);
        buttonCorrer.setVisible(false);
        nombreJugador.setVisible(false);
        vidaJugador.setVisible(false);
        manaJugador.setVisible(false);
    }
    public void MenuVisible(Jugador j){
        buttonAtaque.setVisible(true);
        buttonMagia.setVisible(true);
        buttonObjetos.setVisible(true);
        buttonCorrer.setVisible(true);
        manaJugador.setVisible(true);
        nombreJugador.setVisible(true);
        vidaJugador.setVisible(true);
    }
    public int Atacar(Jugador j,Villano v){
        v.setVidaActual(v.getVidaActual()-j.getAtaque());
        if(v.getVidaActual()<=0){
            System.out.println("El villano ha sido derrotado.");
        }
        return v.getVidaActual();
    }
    
    public void EnemigoAtaca(Jugador j,Villano v){  
        j.setVidaActual(j.getVidaActual()-v.getAtaque());            
    }
    
    public void OcultarTodo(){
        villano2.setVisible(false);
        buttonAtaque.setVisible(false);
        buttonMagia.setVisible(false);
        buttonObjetos.setVisible(false);
        buttonCorrer.setVisible(false);
        nombreJugador.setVisible(false);
        nombreVillano1.setVisible(false);
        nombreVillano2.setVisible(false);
        vidaVillano2.setVisible(false);
        vidaVillano1.setVisible(false);
        vidaJugador.setVisible(false);
        personaje.setVisible(false);
        villano1.setVisible(false);
        manaJugador.setVisible(false);
        buttonRegresar.setVisible(false);
        fondo.setVisible(false);
        buttonEnemigo1.setVisible(false);
        buttonEnemigo2.setVisible(false);
    }
}


















