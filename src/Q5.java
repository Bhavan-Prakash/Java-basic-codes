import java.util.Scanner;


abstract class shape{
    public abstract void area();
}

class circle{

    public void area(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius of circle : "  );
        int r = in.nextInt();

        System.out.println("the area of circle is  : " + (2*3.14*r*r) );
    }

}


public class Q5 {

    public static void main(String[] args){
        circle obj = new circle();
        obj.area();
    }

}
