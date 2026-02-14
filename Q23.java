import java.util.Scanner;

public class Q23 {

    int average(int[] arr){
        int total = 0;
        for(int i = 0 ; i<5 ; i++){
            total += arr[i];
        }
        int avg = total/5;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i=0;
        do{
            System.out.println("Enter the marks of "+ (i+1) +("th student : \n") );
            arr[i] = sc.nextInt();
            i += 1;
        }while(i<5);

        System.out.println("makrs of the 5 students are as below : \n");
        for( int j =0 ; j<5 ; j++){
            System.out.print(arr[j] + ",");
        }
        Q23 obj = new Q23();
        System.out.println("the average of the marks is : "+ obj.average(arr));


    }
}
