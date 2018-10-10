/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dodatki;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projektjava.Polozenie;
import projektjava.SwiatRozmiarException;


/**
 *
 * @author Laura
 */
public class Klawisze implements KeyListener{
    
    
    
    @Override
    public void keyPressed(KeyEvent event)
    {
        Rysowanie matka=(Rysowanie)event.getSource();
        
        switch (event.getKeyCode())
        {
            case KeyEvent.VK_ESCAPE:
                matka.dispose();
                return;
                
            case KeyEvent.VK_UP:
                matka.getPlaneta().robTure(new Polozenie(0,-1));
                break;
                
            case KeyEvent.VK_DOWN:
                matka.getPlaneta().robTure(new Polozenie(0,1));
                break;
                
            case KeyEvent.VK_LEFT:
                matka.getPlaneta().robTure(new Polozenie(-1,0));
                break;
                
            case KeyEvent.VK_RIGHT:
                matka.getPlaneta().robTure(new Polozenie(1,0));
                break;
                
            case KeyEvent.VK_SPACE:
                matka.getPlaneta().robTure(new Polozenie(0,0));
                break;
                
            
        }
    }
    
    
    
    @Override
    public void keyReleased(KeyEvent event)
    {
        
    }
    
    @Override
    public void keyTyped(KeyEvent event)
    {
        
    }
    
    
}
