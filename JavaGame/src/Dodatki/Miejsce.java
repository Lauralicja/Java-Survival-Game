/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dodatki;

import java.awt.GridLayout;
import javax.swing.JPanel;
import projektjava.Swiat;

/**
 *
 * @author Laura
 */
public class Miejsce extends JPanel {
    
    
    private Tlo[][] przestrzen;
    private final int sizeX;
    private final int sizeY;
    
    public Miejsce(int xBeg, int yBeg, Swiat Planeta)
    {
        sizeX=xBeg;
        sizeY=yBeg;
        setLayout(new GridLayout(xBeg,yBeg,5,5));
        this.przestrzen= new Tlo[xBeg][yBeg];
        
        for(int y=0;y<sizeY;y++)
        {
            for(int x=0;x<sizeX;x++)
            {
                przestrzen[x][y]=new Tlo(x,y,Planeta);
                add(przestrzen[x][y]);
            }
        }
    }
    
    
    public void setFieldText(String text, int x, int y)
    {
        przestrzen[x][y].setText(text);
    }
    
    
    public void clearArea()
    {
        for(int i=0;i<sizeY;i++)
        {
            for(int j=0;j<sizeX;j++)
            {
                przestrzen[j][i].clearField();
            }
        }
    }
    
}
