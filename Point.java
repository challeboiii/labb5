import java.util.*;
/**
 * Abstract class Point - write a description of the class here
 *
 * @author 
 * @version 
 */
public abstract class Point implements Cloneable
{
    // instance variables - replace the example below with your own
    private double xPosition;
    private double yPosition;
    
    public Point(double xPosition, double yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    
    public double getXposition() {
        return xPosition;
    }
    
    public double getYposition() {
        return yPosition;
    }
    
    /**
     * Move the figure by (deltaX,deltaY) pixels.
     */
    public void move(double deltaX,double deltaY) {
        xPosition += deltaX;
        yPosition += deltaY;
    }
    
    /**
     * Move the figure to position (x,y).
     */
    public void moveTo(double x, double y) {
        move(x-xPosition,y-yPosition);
    }
    
    /**
     * Abstract function of draw
     */
    public abstract void draw();
    
    /**
     * Abstract function of resize
     */
    public abstract void resize(double scaleFactor);
    
    /**
     * Abstract function of erase
     */
    public abstract void erase();
    
    public Point clone(){
        try {
            Point copy = (Point)super.clone();
            return copy;
        }
        catch(CloneNotSupportedException e){
            throw new InternalError();
        }
    }
}
