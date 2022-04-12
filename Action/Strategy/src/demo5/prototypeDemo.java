package demo5;
//这里虽然是浅拷贝，但是克隆出来的对象和原来的对象不是同一个对象
public class prototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fruit f1 = new Fruit("apple", "123");
        Fruit f1clone = (Fruit) f1.clone();
        System.out.println(f1.toString());
        System.out.println(f1clone.toString());
    }
}
