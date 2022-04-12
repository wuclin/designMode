package demo5;

public class User implements Cloneable{
    String name;
    Fruit fruit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", fruit=" + fruit +
                '}';
    }

    public User clone() throws CloneNotSupportedException{
        User user = (User) super.clone();
        user.fruit = (Fruit) fruit.clone();
        return user;
    }
}
