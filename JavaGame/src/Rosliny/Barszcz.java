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
public class Barszcz extends Roslina{
    
       public Barszcz(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
        
        this.imie="Barszcz";
        this.sila=10;
    }
    
        @Override
    public boolean pasyw(Organizm drugi)
    {

        if(!this.getLocation().czyObszar(drugi.getLocation())){
        } else {
        drugi.zabijany();
        }
        return false;
        
        
    }
    
}
