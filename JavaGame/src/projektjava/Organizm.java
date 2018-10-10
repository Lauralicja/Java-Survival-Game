/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektjava;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Laura
 */
public class Organizm implements Serializable{
    
        boolean zabity=false;
    
    public void zabijany()
    {
        zabity=true;
    }
        
    public boolean czyZabija()
    {
        return zabity;
    }
    
    protected String imie;

    protected int sila;
    
    public int getSila()
    {
        return this.sila;
    }
    
    public void setSila(int wartosc)
    {
        this.sila=wartosc;
    }
    
    public boolean czyMoze=true;
    
    protected int inicjatywa;
  
    protected int wiek;
    
    protected Polozenie location;
    
    protected SwiatDodawanie Farma;
    
    public Organizm(Polozenie kordy, SwiatDodawanie Farma)
    {
        this.wiek=0;
        this.location=kordy;
       this.Farma=Farma;
    }
    
    public void akcja()
    {
        
    };
    
    public boolean pasyw(Organizm drugi)
    {
        return true;
    }
    
    public int getWiek()
    {
        return this.wiek;
    }
    

    
    public void kolizja(Organizm morderca, Organizm ofiara)
    {
        if(morderca.getImie()==ofiara.getImie())
        {
            this.rozmnazanie();
            morderca.czyMoze=false;
            return;
        }
        
        if(!this.pasyw(ofiara))return;
        if(!ofiara.pasyw(this))return;
        
        if(morderca.getSila()>=ofiara.getSila())
        {
            ofiara.zabijany();

            
            return;
        }
        morderca.zabijany();
        return;
    }
    
    public String getImie()
    {
        return this.imie;
    }
    
    public int getInicjatywa()
    {
        return this.inicjatywa;
    }
    
    public void setWiek(int wiek)
    {
        this.wiek=wiek;
    }
    
    public Polozenie getLocation()
    {
        return this.location;
    }

    protected void rozmnazanie() {
    }
    
    
}
