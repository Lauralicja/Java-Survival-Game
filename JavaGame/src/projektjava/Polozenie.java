/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektjava;

import java.io.Serializable;

/**
 *
 * @author Laura
 */
public class Polozenie implements Serializable {
    public int x;
    
    public int y;
    
    static Polozenie zeroPolozenie()
    {
        return new Polozenie(0,0);
    }
    
    public Polozenie(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public boolean czyToSamo(Polozenie c)
    {
        if(this.x==c.x && this.y==c.y)return true;
        return false;
    }
 
    
    public boolean czyObszar(Polozenie c){
        
        
           if(c.x == this.x+1 && c.y==this.y || 
                c.x == this.x-1 && c.y==this.y || 
                c.x == this.x && c.y==this.y+1 || 
                c.x == this.x && c.y==this.y -1 ||
                c.x == this.x+1 && c.y==this.y+1 ||
                c.x == this.x+1 && c.y==this.y-1 ||
                c.x == this.x-1 && c.y==this.y+1 || 
                c.x == this.x-1 && c.y==this.y-1)
                return true;
           else return false;
    }

    
}
