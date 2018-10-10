/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektjava;

import Dodatki.Rysowanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Swiat extends SwiatDodawanie{
    
    private void tworzZyjatka() {
        
          Random ilosc = new Random(); 
          int Randilosc = ilosc.nextInt(15)+1; 
          
          for(int i=0; i<Randilosc; i++){
          
          
         Random jakie = new Random();
         int Randjakie = jakie.nextInt(5);
         
         Random RandX = new Random();
         Random RandY = new Random();
         
         int x = RandX.nextInt(20);
         int y = RandY.nextInt(20);
        

        switch(Randjakie) {
                            case 0: 
                this.addOrganism(new Polozenie(x,y), "Antylopa");
                break;
                           case 1: 
                this.addOrganism(new Polozenie(x,y), "Lis");
                break;
                            case 2: 
                this.addOrganism(new Polozenie(x,y), "Owca");
                break;
                            case 3: 
                this.addOrganism(new Polozenie(x,y), "Wilk");
                break;
                            case 4: 
                this.addOrganism(new Polozenie(x,y), "Zolw");
                break;
                            default: break;
            
            
              }
          }
        
        
    }
    
    
    private void tworzKwiatki() {
        
            Random ilosc = new Random(); 
          int Randilosc = ilosc.nextInt(3)+1; 
          
          for(int i=0; i<Randilosc; i++){
          
          
         Random jakie = new Random();
         int Randjakie = jakie.nextInt(5);
         
         Random RandX = new Random();
         Random RandY = new Random();
         
         int x = RandX.nextInt(20);
         int y = RandY.nextInt(20);
        

        switch(Randjakie) {

                   case 0: 
                this.addOrganism(new Polozenie(x,y), "Barszcz");
                break;
                   case 1: 
                this.addOrganism(new Polozenie(x,y), "Guarana");
                break;
                   case 2: 
                this.addOrganism(new Polozenie(x,y), "Trawa");
                break;
                   case 3: 
                this.addOrganism(new Polozenie(x,y), "Mleczyk");
                break;
                   case 4: 
                this.addOrganism(new Polozenie(x,y), "Jagodka");
                break;
                            default: break;
            
            
              }
          }
        
    }
    
    private void tworzSwiat()
    {
        
        Random StartX = new Random();
        Random StartY = new Random();
        
        int x = StartX.nextInt(20);
        int y = StartY.nextInt(20);
        
        czlek=(Czlowiek)this.addOrganism(new Polozenie(x,y), "Czlowiek");
  
        tworzZyjatka();
        tworzKwiatki();
    
   
    }

    public void zapisz() throws FileNotFoundException
    {
        PrintWriter zapis = new PrintWriter("level.txt");
        
            for(ArrayList <Organizm> initiative : organizmy)
         {
                    zapis.print(initiative.size()+String.format("%n"));
                   for(Organizm actual : initiative)
                   {
                      zapis.print(actual.getImie()+" "+actual.getLocation().x+" "+actual.getLocation().y+" "+actual.getWiek()+" "+actual.getSila()+String.format("%n"));
                   }
          }
           zapis.close();
    }
    
    public void wczytaj() throws SwiatRozmiarException
    {
               for(ArrayList list : organizmy)
                {
                     list.clear();
                }
               
               
                File file = new File("level.txt");
                Scanner scanner;
                
                try
               {
                     scanner = new Scanner(file);
                }
                 catch(FileNotFoundException ex)
                {
                      return;
                }
      
                
              for(int i=0;i<10;i++)
              {
            
                        int count = scanner.nextInt();
                         for(int j=0;j<count;j++)
                         {
                                   String name=scanner.next();
                                   Polozenie coords = new Polozenie(scanner.nextInt(),scanner.nextInt());
                                   Organizm newOrg = this.addOrganism(coords, name);
                                   newOrg.setWiek(scanner.nextInt());
                                             if(!"Czlowiek".equals(newOrg.getImie())) {
                                                    } else {
                                                      this.czlek=(Czlowiek) newOrg;
                                                        }
                                       newOrg.setSila(scanner.nextInt());
                                                       if(coords.x>=wielkosc.x || coords.y>=wielkosc.y)
                                                              {
                                                                  throw new SwiatRozmiarException();
                                                               }
                                         }
                       }
        this.rysujSwiat();
    }
    
    private Czlowiek czlek;
    /**
     *
     * @param czlekMove
     */
public void robTure(Polozenie ruchCzlowieka)
    {
        for(int i=organizmy.size()-1;i>=0;i--)
        {
            for(int j=0;j<organizmy.get(i).size();j++)
            {
                Organizm actual = organizmy.get(i).get(j);
                
                if(actual.czyZabija())continue;
                
                if("Czlowiek".equals(actual.getImie()))
                {
                    czlek.akcja(ruchCzlowieka);
                    czlek.setWiek(czlek.getWiek()+1);
                    continue;
                }
                actual.akcja();
                actual.pasyw(czlek);
                actual.setWiek(actual.getWiek()+1);
            }
        }
        zabijajOrg();
        rysujSwiat();
    }
    
    private void zabijajOrg()
    {
        for(int i=0;i<organizmy.size();i++)
        {
            for(int j=0;j<organizmy.get(i).size();j++)
            {
                Organizm actual = organizmy.get(i).get(j);
                if(actual.czyZabija())
                {
                    organizmy.get(i).remove(j);
                   
                }
            }
        }
    }
    
    public void rysujSwiat()
    {
       
        mainFrame.clearSimArea();
        
        organizmy.stream().forEach((organizm) -> {
                organizm.stream().forEach((wybrany) -> {
                       mainFrame.setFieldText(wybrany.getImie(), wybrany.getLocation().x, wybrany.getLocation().y);

                 });
        });
    }
    
    
    public Swiat(int x, int y)
    {
        super(x,y);
        mainFrame = new Rysowanie(x, y, this);
        tworzSwiat();
    }
    
}
