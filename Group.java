import java.util.*;
/**
* Write a description of class Group here.
*
* @author 
* @version 
*/
public class Group extends Point
{
    // instance variables - replace the example below with your own
    private double scaleFactor;
    private ArrayList<Point> objects;
    
    /**
     * Constructor
     */
    public Group(double dx, double dy){
        super(dx, dy);
        objects = new ArrayList<Point>();
    }
    
    /**
     * Adds a copy of the the item
     * @param item to be added to group
     */
    public void add(Point item){
        Point copy = (Point)item.clone();
        objects.add(copy);
    }
    
    /**
     * Draws all Shapes within the Group
     */
    public void draw(){
        for(Point item : objects){
            item.draw();
        }
    }
    
    /**
     * Removes all Shapes of the Group from the screen
     */
    public void erase(){
        for(Point item : objects){
            item.erase();
        }
    }
    
    /**
     * Moves all Shapes in the Group a set amount in x- and y-axis
     */
    public void move(double x, double y){
        if (getXposition() == 0) {
            super.move(x,y);        
            for(Point item : objects) {
                item.move(x + getXposition(),y + getYposition());
            }
        }
        else {
            super.move(x,y);
            for(Point item : objects){
                item.move(x,y);
            }
        }
    }
    
    public void resize(double scaleFactor){
        for(Point item : objects){
            item.resize(scaleFactor);
        }
    }
    
    /**
     * try-catch statement was not used as CloneNotSupportedException gave a
     * "never thrown in body of corresponding try statement"
     */
    public Group clone(){
        Group copy = (Group)super.clone();
        copy.objects = (ArrayList<Point>)objects.clone();
        for(int i = 0; i < objects.size(); i++){
            copy.objects.set(i, objects.get(i).clone());
        }
        return copy;
    }
}