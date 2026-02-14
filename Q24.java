class Employee_1{
    String name;
    int salary;

    public Employee_1(String name,int salary ){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }

}

class Manager_1 extends Employee_1{
    int bonus;
    int finall;

    public Manager_1(int salary,String name, int bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        finall = salary + bonus;
        return finall;
    }
}

public class Q24 {
    public static void main(String[] args){
        Manager_1 obj = new Manager_1(200,"bh",20);
        System.out.println("the final salary is : " + obj.getSalary());

    }
}
