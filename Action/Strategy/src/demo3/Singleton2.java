package demo3;

public class Singleton2 {
    private volatile static Singleton2 instance;
    private Singleton2(){};

    public static Singleton2 getSingleton(){
        if (instance == null){
            synchronized (Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
