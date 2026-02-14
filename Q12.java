import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        int result = 1;

        for(int i = 1 ; i<=st.length()-1 ; i++){
            char ch = st.charAt(i);


            for(int j = 0; j<=st.length()-1 ; j++){
                if(i == j){

                }else{
                    if(ch == st.charAt(j)) {
                        result++;
                    }else{
                        System.out.println(st.charAt(i) + " repeats " + result + " times ");
                    }
                }
            }
            result = result-result;
        }
    }
}
