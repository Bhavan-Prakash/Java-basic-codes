abstract class book{
    public abstract void title();
    public abstract void author();
    public abstract void price();
}

class library extends book{
    public void title(){
        System.out.println("book title");
    };

    public void author(){
        System.out.println("book author");
    };

    public void price(){
        System.out.println("book price");
    };
}

public class Q8 {
    public static void main(String[] args){
        library obj = new library();

        obj.title();
        obj.author();
        obj.price();
    }
}
