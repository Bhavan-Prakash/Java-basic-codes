import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String st = sc.nextLine();

        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel found: " + ch);
            }
        }

        sc.close();
    }
}
