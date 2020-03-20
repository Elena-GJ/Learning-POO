package app;

public class Rectangle extends Shape{
    // Attribute
    protected double width = 1.0;
    protected double length = 1.0;

    // Constructors
    public Rectangle(){}
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return width * 2 + length * 2;
    }

    // Setters
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    // toString
    @Override
    public String toString(){
        return ("Rectangle[Shape[color = " + super.getColor() + ", filled = " + super.isFilled() + "], width = " +
        width + ", length = " + length + "]");
    }
}