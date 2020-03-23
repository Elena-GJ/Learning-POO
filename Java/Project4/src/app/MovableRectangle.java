package app;

public class MovableRectangle implements Movable{
    // Attributes
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    // Constructor
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }

    // toString
    @Override
    public String toString(){
        return ("bottomRight = [x = " + bottomRight.x + ", y = " + bottomRight.y +
        "], topLeft = [x = " + topLeft.x + ", y = " + topLeft.y + "], xSpeed = " +
        bottomRight.xSpeed + ", ySpeed = " + bottomRight.ySpeed);
    }

    // Other methods
    public void moveUp(){
        bottomRight.moveUp();
        topLeft.moveUp();
    }
    public void moveDown(){
        bottomRight.moveDown();
        topLeft.moveDown();
    }
    public void moveRight(){
        bottomRight.moveRight();
        topLeft.moveRight();
    }
    public void moveLeft(){
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }
}