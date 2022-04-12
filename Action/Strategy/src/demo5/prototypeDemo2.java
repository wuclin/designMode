package demo5;

/**
 * 这里克隆类没有实现Cloneable接口的话会报CloneNotSupportedException
 */
public class prototypeDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fruit apple = new Fruit("apple", "123");
        User user = new User();
        user.setName("qwe"); user.setFruit(apple);
         User userClone = (User) user.clone();
        System.out.println(user.toString());
        System.out.println(userClone.toString());
    }
}
