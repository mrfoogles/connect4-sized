import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedSymbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedSymbol extends Actor
{
    /**
     * Act - do whatever the RedSymbol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public RedSymbol(double scaleFactor) {
        getImage().scale((int)(60/scaleFactor),(int)(60/scaleFactor));
    }
}
