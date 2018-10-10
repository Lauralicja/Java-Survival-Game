/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zwierzeta;

import  java.awt.Color;
import java.util.Random;
import projektjava.Organizm;
import projektjava.Polozenie;
import projektjava.Swiat;
import projektjava.SwiatDodawanie;
import projektjava.Zwierze;

/**
 *
 * @author Laura
 */
public class Antylopa extends Zwierze{
    
     public Antylopa(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
        this.imie="Antylopa";
        this.inicjatywa=4;
         
        this.sila=4;
    }
    
    @Override
    public void akcja()
    {
              ruch(Farma.randomAround(location,2));
    }
    
    @Override
    public boolean pasyw(Organizm drugi)
    {
          Random random = new Random();
          if(random.nextBoolean())
            {
                        Polozenie newLocation = Farma.freeRandomAround(location, 1);
                        if(newLocation==this.location)return true;
                        this.ruch(newLocation);
                        return false;
          }
           return true;
    }
    
}
