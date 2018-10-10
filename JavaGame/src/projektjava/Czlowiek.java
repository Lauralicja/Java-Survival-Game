/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektjava;

import java.awt.Color;

/**
 *
 * @author Laura
 */
public class Czlowiek extends Zwierze {
    
    
   
    private boolean umiejetnosc;
    private int dni;
  

    public Czlowiek(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
          this.umiejetnosc = false;
    
     
        this.imie="Czlowiek";
        this.inicjatywa=4;
       
        this.sila=5;
    }
 
    public void akcja(Polozenie delta)
    {
        
         
        ruch(new Polozenie(location.x+delta.x,location.y+delta.y));
          
    }
    
    @Override
    public boolean pasyw(Organizm drugi)
    {
       
        
        if(umiejetnosc)
        {
        
         
           this.setSila(10);
         
       }
        return true;
    }
    

}
