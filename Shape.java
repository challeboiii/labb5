
/**
 * Baseclass for Triangle, Square, Circle
 *
 * @author 
 * @version 
 */
public abstract class Shape extends Point
{
    // instance variables - replace the example below with your own
    private String color;
    private boolean isVisible;
    
    /**
     * Constructor for objects of class Shape
     */
    public Shape(double xPosition,double yPosition,String color,boolean isVisible)
    {
        super(xPosition, yPosition);
        this.color = color;
        this.isVisible = isVisible;
    }
    
    /**
     * Erase the picture from the screen.
     */
    public void erase() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

    public String getColor() {
        return color;
    }
    
    public boolean isVisible() {
        return isVisible;
    }
    
    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        isVisible = true;
        draw();
    }

    /**
     * Make this square invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible() {
        erase();
        isVisible = false;
    }
    
    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }
    
    /**
     * Move the figure by (deltaX,deltaY) pixels.
     */
    public void move(double deltaX,double deltaY) {
        erase();
        super.move(deltaX, deltaY);
        draw();
    }
}
