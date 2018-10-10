/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektjava;
import java.util.ArrayList;
import Dodatki.Rysowanie;
import Rosliny.Barszcz;
import Rosliny.Guarana;
import Rosliny.Mleczyk;
import Rosliny.Trawa;
import Rosliny.WilczaJagoda;
import Zwierzeta.Antylopa;
import Zwierzeta.Lis;
import Zwierzeta.Owca;
import Zwierzeta.Wilk;
import Zwierzeta.Zolw;
import java.awt.Frame;
import java.util.Random;
/**
 *
 * @author Laura
 */
public class SwiatDodawanie {
    
    Polozenie wielkosc;
    
    protected ArrayList <ArrayList <Organizm>> organizmy;
    
    protected Rysowanie mainFrame;
    
    public SwiatDodawanie(int x, int y)
    {
        wielkosc=new Polozenie(x,y);
        
        organizmy = new ArrayList <>();
        for(int i=0;i<10;i++)
        {
            organizmy.add(new ArrayList <>());
        }
    }
    
    public Organizm addOrganism(Polozenie kordy, String name)
    {
        if(!isEmpty(kordy))return null;
        Organizm newOrganism;
        switch (name)
        {
            case "Antylopa":
                newOrganism = new Antylopa(kordy, this);
                break;
                
            case "Lis":
                newOrganism = new Lis(kordy,this);
                break;
                
            case "Owca":
                newOrganism = new Owca(kordy, this);
                break;
                
            case "Zolw":
                newOrganism = new Zolw(kordy, this);
                break;
                
            case "Wilk":
                newOrganism = new Wilk(kordy, this);
                break;
                
            case "Czlowiek":
                newOrganism = new Czlowiek(kordy,this);
                break;
            
            case "Trawa":
                newOrganism = new Trawa(kordy,this);
                break;
            
            case "Mleczyk":
                newOrganism = new Mleczyk(kordy,this);
                break;
                
            case "Barszcz":
                newOrganism = new Barszcz(kordy,this);
                break;
                
            case "Guarana":
                newOrganism = new Guarana(kordy,this);
                break;
                
            case "Jagodka":
                newOrganism = new WilczaJagoda(kordy,this);
                break;
                
            default:
                return null;
        }
        
        organizmy.get(newOrganism.getInicjatywa()).add(newOrganism);
        
        return newOrganism;
    }
    
    public boolean isEmpty(Polozenie kordy)
    {
        for(ArrayList <Organizm> organism : organizmy)
        {
            for(Organizm actual : organism)
            {
                if(actual.location.czyToSamo(kordy))return false;
            };
        }
        return true;
    }
    
    public boolean inBoundaries(Polozenie kordy)
    {
        if(kordy.x >= 0 && kordy.x <wielkosc.x && kordy.y >=0 && kordy.y<wielkosc.y)return true;
        return false;
    }
    
    public Organizm findObject(Polozenie kordy)
    {
        for(ArrayList <Organizm> organism : organizmy)
        {
            for(Organizm actual : organism)
            {
                if(actual.location.czyToSamo(kordy))return actual;
            };
        }
        return null;
    }
    
    public Polozenie randomAround(Polozenie center, int range)
    {
        Random random = new Random();
        
        Polozenie newPolozenie = new Polozenie(center.x+(random.nextInt(3)-1)*range,center.y+(random.nextInt(3)-1)*range);
                while(!inBoundaries(newPolozenie) || newPolozenie.equals(center))
                  {
                            newPolozenie = new Polozenie(center.x+(random.nextInt(3)-1)*range,center.y+(random.nextInt(3)-1)*range);
                     }
                  return newPolozenie;
       }
    
    public Polozenie freeRandomAround(Polozenie center, int range)
    {
        int triesCounter=50;
        
                Random random = new Random();
                
                Polozenie newPolozenie = new Polozenie(center.x+(random.nextInt(3)-1)*range,center.y+(random.nextInt(3)-1)*range);
                
                              while(!inBoundaries(newPolozenie) || newPolozenie.equals(center) || !isEmpty(newPolozenie))
                            {
                                        if(triesCounter==0)return center;
                                              newPolozenie = new Polozenie(center.x+(random.nextInt(3)-1)*range,center.y+(random.nextInt(3)-1)*range);
                                        triesCounter--;
                             }
                      return newPolozenie;
     }
    
}
