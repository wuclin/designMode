/**
 * User类的构造方法是私有的，调用者不能直接创建User对象
 * User类的属性是不可变的，所有的属性都加了final修饰符，对外只提供getters方法
 * Builder模式使用了链式调用，可读性高
 * Builder的内部类构造方法中只接收必传的参数，必传的参数使用了final修饰符
 * Builder是非线程安全的，所以如果要在Builder内部类中检查参数的合法性，必须在对象创建完成之后再检查
 * public User build() {
 *   User user = new user(this);
 *   if (user.getAge() > 120) {
 *     throw new IllegalStateException(“Age out of range”); // 线程安全
 *   }
 *   return user;
 * }
 * 下面的代码是非线程安全的
 * public User build() {
 *   if (age > 120) {
 *     throw new IllegalStateException(“Age out of range”); // 非线程安全
 *   }
 *   return new User(this);
 */
public class User {


    private final String firstName;     // 必传参数
    private final String lastName;      // 必传参数
    private final int age;              // 可选参数
    private final String phone;         // 可选参数
    private final String address;       // 可选参数

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
