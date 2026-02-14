//import java.util.Scanner;
//import java.util.Set;
//
//public class Q11 {
//    public static void main(String[] args) {
//        System.out.println("enter the String : ");
//        Scanner sc = new Scanner(System.in);
//        String sr = sc.nextLine();
//
//        String reversed = "";
//
//        for (int i = sr.length()-1 ; i>=0; i--){
//            reversed += sr.charAt(i);
//            //System.out.println();
//        }
//
//        System.out.println("reversed string is : " + reversed);
//    }
//}



import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String sr = sc.nextLine();

        String reversed = new StringBuilder(sr).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
