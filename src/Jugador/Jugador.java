/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Jugador {
    private String nombre = "Mir";
    private int vidaTotal = 20,magiaTotal = 20,magiaActual = 20,vidaActual = 20;
    private int ataque = 50;
    private ArrayList <Objetos> items = new ArrayList<>();
    private ArrayList <Magia> magia;
   
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public ArrayList<Objetos> getItems() {
        return items;
    }

    public void setItems(ArrayList<Objetos> items) {
        this.items = items;
    }

    public int getMagiaTotal() {
        return magiaTotal;
    }

    public void setMagiaTotal(int magiaTotal) {
        this.magiaTotal = magiaTotal;
    }

    public int getMagiaActual() {
        return magiaActual;
    }

    public void setMagiaActual(int magiaActual) {
        this.magiaActual = magiaActual;
    }

    public ArrayList<Magia> getMagia() {
        return magia;
    }

    public void setMagia(ArrayList<Magia> magia) {
        this.magia = magia;
    }
    
    public Jugador(){
        
    }
    
    public void AgregarObjeto(Objetos obj){
        System.out.println(obj.getAtributo());
        System.out.println(obj.getNombre());
        items.add(obj);
    }
}
