package app;

public class MovableCircle implements Movable{
    // Attributes
    public int radius;
    public MovablePoint center;

    // Constructors
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // toString
    public String toString(){
        return "Radius = " + radius + ", Center = [" + center.toString() + "]";
    }

    public void moveUp(){
        center.y++;
    }
    public void moveDown(){
        center.y--;
    }
    public void moveLeft(){
        center.x--;
    }
    public void moveRight(){
        center.x++;
    }
}