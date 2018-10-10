/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rosliny;

import java.awt.Color;
import projektjava.Organizm;
import projektjava.Polozenie;
import projektjava.Roslina;
import projektjava.SwiatDodawanie;


/**
 *
 * @author Laura
 */
public class Guarana extends Roslina{
    
        public Guarana(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
        
        this.imie="Guarana";
    }
    
    @Override
    public boolean pasyw(Organizm drugi)
    {
        drugi.setSila(drugi.getSila()+3);
        return true;
    }
    
}
