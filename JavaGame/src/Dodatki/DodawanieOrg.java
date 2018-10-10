/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dodatki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projektjava.Polozenie;
import projektjava.Swiat;

/**
 *
 * @author Laura
 */
public class DodawanieOrg implements ActionListener{
    
    private String imie;
    private int x;
    private int y;
    Swiat Planeta;
    
    
    
        public DodawanieOrg(int x, int y, Swiat Planeta, String imie)
        {
            this.imie=imie;
            this.x=x;
            this.y=y;
            this.Planeta=Planeta;
        }
    
        
        
        
        @Override
        public void actionPerformed(ActionEvent event)
                {
                    Planeta.addOrganism(new Polozenie(x,y),imie);
                    Planeta.rysujSwiat();
                }
    
    
}
