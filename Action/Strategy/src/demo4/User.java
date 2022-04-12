package demo4;

public class User {
    private final String name;
    private final int age;
    private final String address;
    private final String number;

    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
        this.number = userBuilder.number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public static class UserBuilder{
        private final String name;
        private final int age;
        private String address;
        private String number;

        public UserBuilder(String name, int age){
            this.name = name;
            this.age = age;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder number(String number){
            this.number = number;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
