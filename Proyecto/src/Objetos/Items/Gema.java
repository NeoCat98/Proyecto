/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos.Items;

/**
 *
 * @author Ricardo Villeda
 */
public class Gema implements Items{
    String nombre = "Gema";
    int atributo = 100;
    
    @Override
    public String getNombre() {
        return nombre;
    }

 
    @Override
    public int getAtributo() {
        return atributo;
    }

   
}
