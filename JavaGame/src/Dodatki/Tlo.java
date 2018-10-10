/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dodatki;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import projektjava.Swiat;

/**
 *
 * @author Laura
 */
public class Tlo extends JPanel {
    
    private JLabel text;
  //  private JFrame text;
    
    public Tlo(int x, int y, Swiat Planeta)
    {
        Myszka rigtMouseMenu = new Myszka(x,y,Planeta);
        addMouseListener(rigtMouseMenu);
        setBackground(Color.white);
        
        text=new JLabel();
        add(text);
    }
    
    
    public void clearField()
    {
        text.setText("");
        setBackground(Color.white);
    }
    
    
    public void setText(String newText)
    {
        text.setText(newText);
        if(newText=="Czlowiek")setBackground(Color.magenta);
        if(newText=="Barszcz")setBackground(Color.black);
        if(newText=="Guarana")setBackground(Color.blue);
        if(newText=="Mleczyk")setBackground(Color.yellow);
        if(newText=="Trawa")setBackground(Color.green);
        if(newText=="Jagodka")setBackground(Color.DARK_GRAY);
        if(newText=="Antylopa")setBackground(Color.pink);
        if(newText=="Lis")setBackground(Color.orange);
        if(newText=="Owca")setBackground(Color.LIGHT_GRAY);
        if(newText=="Wilk")setBackground(Color.gray);
        if(newText=="Zolw")setBackground(Color.cyan);
     
        
    }
    
    
    
}
