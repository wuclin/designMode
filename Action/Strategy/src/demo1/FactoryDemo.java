package demo1;

public class FactoryDemo {
    public static void main(String[] args){
        vehicleFactory vf = new vehicleFactory();

        vehicle smallCar = vf.getVehicle("small");
        smallCar.drive();

    }
}
