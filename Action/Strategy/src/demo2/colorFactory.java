package demo2;

public class colorFactory extends AbstractFactory{
    @Override
    public color getColor(String color) {
        if(color == null)
            return null;
        if (color.equalsIgnoreCase("red"))
            return new red();
        else if (color.equalsIgnoreCase("green"))
            return new green();

        return null;
    }

    @Override
    public fruit getFruit(String fruit) {
        return null;
    }
}
