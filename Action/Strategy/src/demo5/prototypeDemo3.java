package demo5;

/**
 *序列化实现深拷贝
 */
public class prototypeDemo3 {
    public static void main(String[] args) throws Exception {
        Fruit apple = new Fruit("apple", "123");
        User2 user = new User2();
        user.setName("qwe"); user.setFruit(apple);
        User2 userClone = (User2) user.deepClone();
        System.out.println(user.toString());
        System.out.println(userClone.toString());
    }
}
