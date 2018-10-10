/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dodatki;
import projektjava.Polozenie;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import projektjava.Swiat;
import projektjava.Czlowiek;
/**
 *
 * @author Laura
 */
public class Rysowanie extends JFrame{
    
    private Swiat Planeta;
    private Czlowiek czlek;
    private final Miejsce poleGry; 
    
    
    public Swiat getPlaneta()
    {
        return Planeta;
    }
    
 
    
    public Czlowiek getHuman()
    {
        return czlek;
    }
    
    
    
   
    
    public Rysowanie(int x, int y, Swiat Planeta)
    {
        super("Laura Żuchowska 165101");
        this.Planeta=Planeta;
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setLayout(new FlowLayout());
        
             Klawisze escExit = new Klawisze();
             addKeyListener(escExit);
        
              poleGry = new Miejsce(x, y, Planeta);
              add(poleGry);
        
        poleGry.setBackground(new Color(255,255,255));
        poleGry.setLocation(0, 100);
        poleGry.setPreferredSize(new Dimension(1000,1000));
	setVisible(true);
    }
    

    
    public void setFieldText(String text, int x, int y)
    {
        poleGry.setFieldText(text, x, y);
    }
    
    public void clearSimArea()
    {
        poleGry.clearArea();
    }
}
