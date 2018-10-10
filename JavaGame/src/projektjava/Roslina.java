/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektjava;

import java.util.Random;

/**
 *
 * @author Laura
 */
public class Roslina extends Organizm{
    
     public Roslina(Polozenie kordy, SwiatDodawanie Farma)
    {
        super(kordy,Farma);
        this.sila=0;
        this.inicjatywa=0;
    }
    
    @Override
    public void rozmnazanie()
    {
        Random random = new Random();
        Polozenie noweKordy = Farma.freeRandomAround(location, 1);
        if(noweKordy.czyToSamo(location))return;
        if(random.nextInt(10)==0)
        {
            Farma.addOrganism(noweKordy, imie);
        }
    }
    
    public void akcja()
    {
        rozmnazanie();
    }
    
}
