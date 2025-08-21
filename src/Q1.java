//Without using any temporary variable, swap two numbers.


public class Q1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = b+a;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}