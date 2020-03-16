package app;

public class Ball{
    // Variables
    private double x;
    private double y;
    private double xStep;
    private double yStep;
    private double[] xy = {this.x, this.y};
    private double[] xyStep = {this.xStep, this.yStep};

    // Constructors
    public Ball (double x, double y, double xStep, double yStep){
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    // Getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getXStep(){
        return xStep;
    }
    public double getYStep(){
        return yStep;
    }
    public double[] getXY(){
        return xy;
    }
    public double[] getXYStep(){
        return xyStep;
    }

    // Setters
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXStep(double xStep){
        this.xStep = xStep;
    }
    public void setYStep(double yStep){
        this.yStep = yStep;
    }
    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }
    public void setXYStep(double xStep, double yStep){
        setXStep(xStep);
        setYStep(yStep);
    }

    // String method
    public String ballToString(){
        return String.format("Ball@(%2d, %2d), Speed = (%2d, %2d)", x, y, xStep, yStep);
    }

    // Other methods
    public Ball move(){
        x += xStep;
        y += yStep;
        return this;
    }
}