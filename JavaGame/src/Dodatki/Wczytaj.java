/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dodatki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projektjava.Polozenie;
import projektjava.Swiat;
import projektjava.SwiatRozmiarException;

/**
 *
 * @author Laura
 */
public class Wczytaj implements ActionListener{
    

    Swiat Planeta;
    
    
    
        public Wczytaj(Swiat Planeta)
        {
  
            this.Planeta=Planeta;
        }
    
        
        
        
        @Override
        public void actionPerformed(ActionEvent event)
                {
       
        try {
            Planeta.wczytaj();
        } catch (SwiatRozmiarException ex) {
            Logger.getLogger(Wczytaj.class.getName()).log(Level.SEVERE, null, ex);
        }
                    Planeta.rysujSwiat();
                }
    
    
}
