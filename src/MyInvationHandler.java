import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvationHandler implements InvocationHandler {
    private Object obj;

    public  MyInvationHandler(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect aspect=new MyAspect();
        aspect.before();
        Object result = method.invoke(obj,args);
        aspect.after();
        return result;
    }
}
