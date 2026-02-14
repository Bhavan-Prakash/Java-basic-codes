abstract class Vehicle{
    public void start(){}

    public void stop(){}

    public void fuelType(){
        System.out.println("im a fuel type method from vehicle class");
    }
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("im a overriden start from car");
    }

    @Override
    public void stop(){
        System.out.println("im a overriden stop from car");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("im a overriden start from bike");
    }

    @Override
    public void stop(){
        System.out.println("im a overriden stop from bike");
    }
}

class ElectricScooter extends Vehicle{
    @Override
    public void start(){
        System.out.println("im a overriden start from electric scooter");
    }

    @Override
    public void stop(){
        System.out.println("im a overriden stop from electric scooter");
    }
}

public class Q16 {
    public static void main(String[] args) {
        Vehicle[] elec = {
                new Car(),
                new Bike(),
                new ElectricScooter(),
        };

        // Calling the non-overridden method outside the loop
        elec[0].fuelType(); // calling from Vehicle class
        System.out.println("---------------------");

        for(Vehicle e : elec){
            e.stop();
            e.start();
        }
    }
}
