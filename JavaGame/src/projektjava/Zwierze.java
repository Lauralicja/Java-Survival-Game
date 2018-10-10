/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektjava;

/**
 *
 * @author Laura
 */
public class Zwierze extends Organizm{
    
    
    
    public Zwierze(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
    }
    
    @Override
    protected void rozmnazanie()
    {
        Polozenie newLoc = Farma.freeRandomAround(location, 1);
        if(newLoc.czyToSamo(this.location))return;
        Farma.addOrganism(newLoc, this.getImie());
    }
            
    
    @Override
    public void akcja()
    {
        this.czyMoze=true;
        ruch(Farma.randomAround(location,1));
    }
    
    protected void ruch (Polozenie newPolozenie)
    {
        
        
        
        if(newPolozenie.czyToSamo(location))return;
        if(!Farma.inBoundaries(newPolozenie))return;
        if(Farma.isEmpty(newPolozenie))
        {
            location=newPolozenie;
            return;
        }
        Organizm enemy = Farma.findObject(newPolozenie);

       
       
        if(!enemy.czyZabija())kolizja(this, enemy);
        
        if(!this.zabity && this.czyMoze)location=newPolozenie;
      
    }
    
}
