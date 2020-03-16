package app;

public class App {
    public static void main(String[] args) {
        Ball tennisBall = new Ball(0, 0, 1, 0);
        System.out.println("This is a tennis ball");
        System.out.println("X: " + tennisBall.getX());
        System.out.println("Y: " + tennisBall.getY());
        System.out.println("X speed: " + tennisBall.getXStep());
        System.out.println("Y speed: " + tennisBall.getYStep());
        System.out.println();
        System.out.println("The tennis ball moves.");
        tennisBall.move();
        tennisBall.move();
        System.out.println("Now, the tennis ball is at x = " + tennisBall.getX() + " , y = " + tennisBall.getY());
        tennisBall.setXYStep(-1, 0);
        System.out.println("We kick smoothly the ball back to its origin. Its speed now is x-speed = " + tennisBall.getXStep() + "; y-speed = " + tennisBall.getYStep());
        tennisBall.move();
        tennisBall.move();
        System.out.println("It's again at position = {" + tennisBall.getXY()[0] + ", " + tennisBall.getXY()[1] + "}");
        System.out.println("We stop the ball");
        tennisBall.setXYStep(0, 0);
        System.out.println("The values of the different variables are:");
        System.out.println(tennisBall.getX() + " " + tennisBall.getY() + " " + tennisBall.getXY()[0] + " " + tennisBall.getXY()[1] + " " + tennisBall.getXStep() + " " + tennisBall.getYStep() + " " + tennisBall.getXYStep()[0] + " " + tennisBall.getXYStep()[1]);
    }
}