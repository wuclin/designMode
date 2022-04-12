public class manProxy implements people{

    final man man;

    manProxy(man man){
        this.man = man;
    }
    @Override
    public void eat() {
        System.out.println("ready");
        man.eat();
        System.out.println("done");
    }
}
