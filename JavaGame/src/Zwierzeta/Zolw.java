/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zwierzeta;

import java.awt.Color;
import java.util.Random;
import projektjava.Organizm;
import projektjava.Polozenie;
import projektjava.SwiatDodawanie;
import projektjava.Zwierze;

/**
 *
 * @author Laura
 */
public class Zolw extends Zwierze{
    
    
       public Zolw(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
        this.imie="Zolw";
        this.inicjatywa=1;
        this.sila=2;
     
    }
    
    @Override public void akcja()
    {
        Random random = new Random();
        if(random.nextInt(4)==0)return;
        ruch(Farma.randomAround(location, 1));
    }
    
    @Override
    public boolean pasyw(Organizm other)
    {
        if(other.getSila()<5)
        {
            other.czyMoze=false;
            this.czyMoze=false;
            return false;
        }
        
        return true;    
        
    }
    
}
