public class Program5 {
    //Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("num1=" +a);
        System.out.println("num2=" +b);

        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("num1=" +a);
        System.out.println("num2=" +b);


    }
}

