class Employee2{
    public String name;
    public int id;
    public double salary;

    public double calculateBonus(){
        double bonus = 0.1 * salary;
        System.out.println("my bonus is " + bonus);
        return bonus;
    }
}

class manager2 extends Employee2{
    @Override
    public double calculateBonus(){
        double bonus = 0.2 * salary;
        System.out.println("manager bonus is " + bonus);
        return bonus;
    }
}

class developer2 extends Employee2{
    @Override
    public double calculateBonus(){
        double bonus = 0.3 * salary;
        System.out.println("developer bonus is " + bonus);
        return bonus;
    }
}

public class Q18 {
    public static void main(String[] args) {
        Employee2[] emp = {
                new Employee2(),
                new manager2(),
                new developer2()
        };

        for(Employee2 e : emp){
            e.calculateBonus();
        }
    }
}
