class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.age=age;
        this.name=name;
    }

    public void getDetails(){
        System.out.println("the name of the user is : " + name);
        System.out.println("the age is : " + age);
    }
}

class Student extends Person{
    int rollno;

    public Student(String name, int age, int rollno){
        super(name, age);
        this.rollno = rollno;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("the roll no is : " + rollno);
    }
}

class teacher extends Person{
    String subject;

    public teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void getDetails() {
        System.out.println("teacher subject is : "+subject);
    }
}

public class Q25 {
    public static void main(String[] args){
        Student obj = new Student("bha" , 12,132);
        teacher obj2 = new teacher("bh",13,"science");
        obj.getDetails();
        obj2.getDetails();
    }
}
