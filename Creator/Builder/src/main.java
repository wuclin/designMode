public class main {
    public static void main(String[] args){
        User user = new User.UserBuilder("q","we").build();
        System.out.println(user.toString());
    }
}
