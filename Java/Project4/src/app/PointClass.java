package app;

import java.util.Scanner;


// Class
public class PointClass{
    private double x = 0;
    private double y = 0;
    Scanner input = new Scanner(System.in);

    // Constructors
    public void Point(){
        setX();
        setY();
    }

    // Getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    // Setters
    public void setX(){
        this.x = input.nextDouble();
    }
    public void setY(){
        this.y = input.nextDouble();
    }

    // To String
    public String pointToString(){
        return ("(" + this.x + ", " +this.y + ")");
    }
    
    // Others
    public double[] getXY(){
        double[] devolver = {x, y};
        return devolver;
    }
    
    public void setXY(){
        setX();
        setY();
    }

    // Distances
    public double distance(double x, double y){
        return Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2);
    }
    
    public double distance (PointClass point){
        return Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2);
    }

    public double distance(){
        return Math.pow(this.x, 2) + Math.pow(this.y, 2);
    }
}