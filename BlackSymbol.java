import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackSymbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackSymbol extends Actor
{
    /**
     * Act - do whatever the BlackSymbol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public BlackSymbol(double scaleFactor) {
        getImage().scale((int)(60/scaleFactor),(int)(60/scaleFactor));
    }
}
