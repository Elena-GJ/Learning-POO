package app;

// Test of the PointClass

public class App {
   public static void main(String[] args) {
      /*
       * PointClass point1 = new PointClass(); System.out.println(point1.getX());
       * System.out.println(point1.getY()); point1.setX(); point1.setY();
       * System.out.println(point1.pointToString()); point1.setXY();
       * System.out.println(point1.getXY()); PointClass point2 = new PointClass();
       * 
       * // The println is supposed not to be necessary
       * System.out.println(point1.distance(point2));
       */
      // Test new classes
      /* Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
      System.out.println(m1);
      m1.moveLeft();
      System.out.println(m1);

      Movable m2 = new MovableCircle(1, 2, 3, 4, 20); // upcast
      System.out.println(m2);
      m2.moveRight();
      System.out.println(m2); */

      MovableRectangle r1 = new MovableRectangle(3, 2, 4, 6, 2, 1);
      System.out.println(r1);
      r1.moveLeft();
      System.out.println(r1);
   }
}