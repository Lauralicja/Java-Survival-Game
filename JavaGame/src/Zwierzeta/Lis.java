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
public class Lis extends Zwierze{
    
         public Lis(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
        this.imie="Lis";
        this.inicjatywa=7;
    
        this.sila=3;
    }
    
   @Override
    public void akcja()
    {
        Polozenie nowekordy;
        int pomocnicza=20;
        do{
            if(pomocnicza==0)return;
            nowekordy = Farma.randomAround(location, 1);
            pomocnicza--;
        } while(!Farma.isEmpty(nowekordy) && Farma.findObject(nowekordy).getSila()>this.sila);
        ruch(nowekordy);
    }
    
  
    
}
