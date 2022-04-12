package demo2;

public class FactoryProduct {
    public static AbstractFactory getFactory(String FactoryName){
        if (FactoryName == null)
            return null;
        if (FactoryName.equalsIgnoreCase("fruit"))
            return new fruitFactory();
        else if (FactoryName.equalsIgnoreCase("color"))
            return new colorFactory();

        return null;
    }
}
