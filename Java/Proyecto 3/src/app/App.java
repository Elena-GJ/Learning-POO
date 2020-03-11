package app;

public class App {
    public static void main(String[] args) throws Exception {
        Time time1 = new Time();
        System.out.println(time1.hourString());
        time1.setHour();
        System.out.println(time1.hourString());
        System.out.println(time1.getSecond());
        time1.nextSecond();
        System.out.println(time1.hourString());
    }
}