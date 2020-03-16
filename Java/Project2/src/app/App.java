package app;

public class App {
    public static void main(String[] args) {
        Date hoy = new Date(2020, 3, 2);
        System.out.println(hoy.getDay());
        System.out.println(hoy.getMonth());
        System.out.println(hoy.getYear());

        System.out.println(hoy.dateToString());
        hoy.setYear(2022);
        hoy.setMonth(11);
        hoy.setDay(12);

        System.out.println(hoy.dateToString());
        hoy.setDate(2, 3, 2020);
        System.out.println(hoy.dateToString());
    }
}