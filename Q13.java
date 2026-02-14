class Rectangle{
    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getBreadth(){
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        int area = length * breadth;
        System.out.println("the area of the rectangle is " + area);
        return 0;
    }
}


public class Q13 {
    public static void main(String[] args) {

        Rectangle rct = new Rectangle();

        rct.setLength(10);
        rct.setBreadth(10);
        rct.area();


    }
}
