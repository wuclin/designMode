import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class peopleInvo implements InvocationHandler {

    Object target;

    peopleInvo(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ready");
        Object res = method.invoke(target, args);
        System.out.println("done");
        return res;
    }
}
