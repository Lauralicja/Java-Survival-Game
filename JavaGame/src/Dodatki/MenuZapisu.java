/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dodatki;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import projektjava.Swiat;

/**
 *
 * @author Laura
 */
public class MenuZapisu extends JPopupMenu {
    
     public int dlugoscMenu;
    
    JMenuItem[] Menu;
    
    public MenuZapisu(int x, int y, Swiat Planeta)
    {
        this.dlugoscMenu = 2;
        
        Menu = new JMenuItem[dlugoscMenu];
        Menu[0] = new JMenuItem("Zapisz");
        Menu[1] = new JMenuItem("Wczytaj");
       
     
            add(Menu[0]);
            Menu[0].addActionListener(new Zapis(Planeta));
            add(Menu[1]);
            Menu[1].addActionListener(new Wczytaj(Planeta));
        
    }
    
    
}
