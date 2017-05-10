import greenfoot.*;

/**
 * Write a description of class Sechszehn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sechszehn extends Zahl
{
    /**
     * Act - do whatever the Sechszehn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("w"))
      {
          moveUp();
          neuPuk();
        }
        else
        if(Greenfoot.isKeyDown("s"))
        {
            moveDown();
            neuPuk();
        }
        else
        if(Greenfoot.isKeyDown("d"))
        {
            moveRight();
            neuPuk();
        }
        else
        if(Greenfoot.isKeyDown("a"))
        {
            moveLeft();
            neuPuk();
        }
    }
    public void moveUp()
    {
            
                if(canMove(getX(), getY() - 1) == true)
                {
                    setLocation(getX(), getY() - 1);
                }
            
    }
    public void moveLeft()
    {
        if(canMove(getX() - 1, getY()) == true)
        { 
            setLocation(getX() - 1, getY());
        }
    }

    public void moveRight()
    {
        if(canMove(getX() + 1, getY())  == true)
        {    
            setLocation(getX() + 1, getY());
        }
    }

    public void moveDown()
    {
        if(canMove(getX(), getY() + 1) == true)
        {
            setLocation(getX(), getY() + 1);
        }
    }
}
