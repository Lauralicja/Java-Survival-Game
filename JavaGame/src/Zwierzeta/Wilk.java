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
public class Wilk extends Zwierze {
    
    
    public Wilk(Polozenie kordy, SwiatDodawanie Farma) {
        super(kordy, Farma);
        this.imie="Wilk";
        this.inicjatywa=5;
        
        this.sila=9;
    }
    
}
