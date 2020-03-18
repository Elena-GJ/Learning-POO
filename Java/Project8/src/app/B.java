package app;

public class B extends A {
    private int number2;

    public B(int number1, int number2) {
        super(number1);
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }
}