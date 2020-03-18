package app;

public class App {
    public static void main(String[] args) {
        A a = new A(2);
        B b = new B(2, 4);
        A c = b;
        // B d = c;  // You loose propperties here, they are not stored

        System.out.println(a.getNumber1());
        System.out.println(b.getNumber2());
        System.out.println(c.getNumber1());
        // System.out.println(d.getNumber2());
    }
}