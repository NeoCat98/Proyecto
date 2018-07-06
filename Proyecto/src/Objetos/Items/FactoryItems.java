/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos.Items;

import Objetos.Tienda;

/**
 *
 * @author Ricardo Villeda
 */
public class FactoryItems implements Tienda{

    @Override
    public Items GetItem(String Tipo) {
        switch (Tipo) {
            case "Espada":
                return new Espada();
            case "Espada2":
                return new Espada2();
            case "Botas":
                return new Botas();
            case "Gema":
                return new Gema();
            case "Key":
                return new Key();
            case "Martillo":
                return new Martillo();
            case "Pocion":
                return new Pocion();
            case "Sepa":
                return new Sepa();
            case "Sepa2":
                return new Sepa2();
            case "Varita":
                return new Varita();
        }
        return null;
    }
    
}
