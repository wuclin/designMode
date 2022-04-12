package demo2;

public class fruitFactory extends AbstractFactory {
    @Override
    public color getColor(String color) {
        return null;
    }

    @Override
    public fruit getFruit(String fruit) {
        if (fruit == null)
            return null;
        if (fruit.equalsIgnoreCase("apple"))
            return new apple();
        else if (fruit.equalsIgnoreCase("banana"))
            return new banana();

        return null;
    }
}
