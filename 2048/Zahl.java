import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Zahl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zahl extends Actor
{
    /**
     * Act - do whatever the Zahl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.setSpeed(15);
    }   

    public boolean canMove(int x, int y)
    {
        ArrayList<m> hndrns = (ArrayList<m>)getWorld().getObjectsAt(x,y, m.class);
        if(hndrns.size() != 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public void neuPuk()
    {
        double x = Math.random();
        if(x < 0.2)
        {
               Zwei Zwei = new Zwei();
            getWorld().addObject(Zwei, Greenfoot.getRandomNumber(4) , Greenfoot.getRandomNumber(4));
        }
        else if(x < 0.3 && x > 0.2)
        {
            Vier Vier = new Vier();
            getWorld().addObject(Vier, Greenfoot.getRandomNumber(4) , Greenfoot.getRandomNumber(4));
        }

    }
                                  
    }
}
