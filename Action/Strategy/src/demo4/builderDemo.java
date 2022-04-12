package demo4;

public class builderDemo {
    public static void main(String[] args){
        User user = new User.UserBuilder("qwe",123)
                .number("132")
                .build();

        System.out.println(user.toString());

    }


}
