package app;

abstract class Shape{
    // Attributes
    protected String color = "RED";
    protected boolean filled = true;

    // Constructors
    public Shape(){}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    // Getters
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    abstract double getArea();
    abstract double getPerimeter();

    // Setters
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    // toString
    @ Override
    public String toString(){
        return ("Shape[color = " + color + ", filled = " + filled + "]");
    }
}