/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rosliny;

import java.awt.Color;
import projektjava.Polozenie;
import projektjava.Roslina;
import projektjava.SwiatDodawanie;

/**
 *
 * @author Laura
 */
public class Mleczyk extends Roslina{
    
    
     public Mleczyk(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
        this.imie="Mleczyk";
        
    }
    
    @Override
    public void akcja()
    {
        rozmnazanie();
        rozmnazanie();
        rozmnazanie();
    }
    
}
