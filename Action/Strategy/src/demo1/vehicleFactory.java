package demo1;

public class vehicleFactory {
    public vehicle getVehicle(String vehicleType){
        if (vehicleType == null)
            return null;
        if (vehicleType.equalsIgnoreCase("small"))
            return new smallCar();
        else if (vehicleType.equalsIgnoreCase("middle"))
            return new middleCar();
        else if (vehicleType.equalsIgnoreCase("great"))
            return new greatCar();

        return null;
    }
}
