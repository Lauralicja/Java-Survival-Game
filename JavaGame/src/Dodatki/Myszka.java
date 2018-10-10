/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dodatki;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import projektjava.Swiat;

/**
 *
 * @author Laura
 */
public class Myszka extends MouseAdapter{
    
    private int x;
    private int y;
    private Swiat Planeta;
    
    public Myszka(int x, int y, Swiat Planeta)
    {
        this.Planeta=Planeta;
        this.x=x;
        this.y=y;
    }
    
    @Override
    public void mouseClicked(MouseEvent event)
    {
        if(MouseEvent.BUTTON3==event.getButton())
        {
            MenuMyszki menu=new MenuMyszki(x,y,Planeta);
            menu.show(event.getComponent(),event.getX(),event.getY());
        }
         if(MouseEvent.BUTTON1==event.getButton())
        {
            MenuZapisu menu=new MenuZapisu(x,y,Planeta);
            menu.show(event.getComponent(),event.getX(),event.getY());
        }
        
    }
    
}
