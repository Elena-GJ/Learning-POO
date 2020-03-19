package app;

public class App {
    public static void main(String[] args) {
        A a = new A(2);
        B b = new B(2, 4);
        A c = b;
        B d = (B) c;  // You need to case it when you go downside

        System.out.println(a.getNumber1());
        System.out.println(b.getNumber1());
        System.out.println(c.getNumber1());
        System.out.println(d.getNumber1());
    }
}