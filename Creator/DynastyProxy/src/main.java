public class main {
    public static void main(String[] args){
        people man = (people) peopleProxyFactory.getProxy(new man());
        people woman = (people) peopleProxyFactory.getProxy((new woman()));
        //这里只能转成接口的类型，
        man.eat();
        woman.eat();
    }
}
