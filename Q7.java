
class Test{
    public Test(){
        System.out.println("test constructor");
    }
}

class Test2 extends Test{
    public Test2(){
        super();
        System.out.println("Test2 constructor");
    }

}

public class Q7 {
    public static void main(String[] args){
        Test2 obj = new Test2();
    }
}
