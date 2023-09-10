package test;

public class ExchangeDemo {
    public static void main(String[] args) {
        int x=1000;
        int y=10;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x="+x+" y="+y);
    }

}
