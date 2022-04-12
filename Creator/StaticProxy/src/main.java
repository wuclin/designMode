public class main {
    public static void main(String[] args){
        people man = new manProxy(new man());
        man.eat();
    }
}
