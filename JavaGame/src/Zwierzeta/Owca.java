/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zwierzeta;

import java.awt.Color;
import projektjava.Polozenie;
import projektjava.SwiatDodawanie;
import projektjava.Zwierze;

/**
 *
 * @author Laura
 */
public class Owca extends Zwierze{
    
     public Owca(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
        this.imie="Owca";
        this.inicjatywa=4;
      
        this.sila=4;
    }
    
}
