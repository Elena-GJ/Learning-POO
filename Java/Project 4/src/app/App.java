package app;

// Test of the PointClass

public class App{
     public static void main(String []args){
        PointClass point1 = new PointClass();
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        point1.setX();
        point1.setY();
        System.out.println(point1.pointToString());
        point1.setXY();
        System.out.println(point1.getXY());
        PointClass point2 = new PointClass();

        // The println is supposed not to be necessary
        System.out.println(point1.distance(point2));
     }
}