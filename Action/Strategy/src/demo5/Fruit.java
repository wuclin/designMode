package demo5;

import java.io.Serializable;

public class Fruit implements Cloneable, Serializable {
    String name;
    String weight;

    public Fruit(String name, String weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
