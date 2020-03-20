package app;

public class MovablePoint implements Movable{
    // Attributes
    int x, y, xSpeed, ySpeed;  // You can take variables of the same package!

    // Constructors
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // toString
    public String toString(){
        return "x = " + x + ", y = " + y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }

    public void moveRight(){
        x++;
    }

    public void moveLeft(){
        x--;
    }
}