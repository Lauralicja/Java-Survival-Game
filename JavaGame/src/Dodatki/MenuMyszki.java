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
public class MenuMyszki extends JPopupMenu {
    
     public int dlugoscMenu;
    
    JMenuItem[] Menu;
    
    public MenuMyszki(int x, int y, Swiat Planeta)
    {
        this.dlugoscMenu = 10;
        
        Menu = new JMenuItem[dlugoscMenu];
        Menu[0] = new JMenuItem("Antylopa");
        Menu[1] = new JMenuItem("Lis");
        Menu[2] = new JMenuItem("Owca");
        Menu[3] = new JMenuItem("Zolw");
        Menu[4] = new JMenuItem("Wilk");
        Menu[5] = new JMenuItem("Trawa");
        Menu[6] = new JMenuItem("Mleczyk");
        Menu[7] = new JMenuItem("Jagodka");
        Menu[8] = new JMenuItem("Guarana");
        Menu[9] = new JMenuItem("Barszcz");
        for(int i=0;i<dlugoscMenu;i++)
        {
            add(Menu[i]);
            Menu[i].addActionListener(new DodawanieOrg(x,y,Planeta,Menu[i].getText()));
        }
    }
    
    
}
