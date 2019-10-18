import java.awt.*;
import static java.lang.Math.*;   // Simplifies the call to the round method in draw.
/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 
 */
public class Square extends Shape{
    private double size;

    /**
     * Create a new square at default position with default color.
     */
    public Square(double xPosition,double yPosition,String color,boolean isVisible,double size) {
        super(xPosition, yPosition, color, isVisible);
        this.size = size;
    }
    
    /**
     * Draw the square with current specifications on screen.
     */
    public void draw() {
        if(isVisible()) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this,getColor(),
                new Rectangle(
                    (int)round(getXposition()),
                    (int)round(getYposition()),
                    (int)round(size),
                    (int)round(size)));
            canvas.wait(10);
        }
    }

    /**
     * Change the size proportionally according to scale factor.
     */
    public void resize(double scaleFactor) {
        erase();
        size *= scaleFactor;
        moveTo((getXposition())*scaleFactor, (getYposition())*scaleFactor);
        draw();
    }
}
