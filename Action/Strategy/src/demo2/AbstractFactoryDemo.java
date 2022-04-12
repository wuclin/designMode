package demo2;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        AbstractFactory colorAf = FactoryProduct.getFactory("color");
        color r = colorAf.getColor("red");
        r.putColor();
    }
}
