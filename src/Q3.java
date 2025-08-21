//Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
import java.util.Scanner;

class second{
    int [] arr = new int[5];
    int no,second;
    public void getArray(){
        System.out.println("enter the array elements :");
        Scanner in = new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
    }

    public void find(){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>no){
                no=+arr[i];
            }
        }
        System.out.println("largest number is : " + no);
    }

    public void second_large(){
        for (int i = 0;i< arr.length;i++){
            if(arr[i]>second && arr[i] != no){
                second =+ arr[i];
            }
        }
        System.out.println("second largest number is : " + second);
    }
}
public class Q3 {
    public static void main(String[] args) {
        second cla = new second();
        cla.getArray();
        cla.find();
        cla.second_large();
    }
}
