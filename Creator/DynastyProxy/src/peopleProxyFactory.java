import java.lang.reflect.Proxy;

public class peopleProxyFactory {
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new peopleInvo(target));
    }
}
