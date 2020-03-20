package app;

public class App {
    public static void main(String[] args) throws Exception {
        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea()); // Returns the value of getArea defined at the rectangle class
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        Rectangle s4 = (Rectangle) s3;  // The conversion was necessary: shape didn't had getLength()
        System.out.println(s4.getLength());

        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
    }
}