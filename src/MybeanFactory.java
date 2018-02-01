import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MybeanFactory {

    public static UserService CreateUserService(){
        //1.目标类
        UserService userService = new UserServiceImol();
        //2.切面类
        MyAspect myAspect = new MyAspect();
        //3.代理类
        //UserService.class().getClassLoader()等同于userService.getClass().getClassLoader()
        UserService proxyUserService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                myAspect.before();
                Object obj=method.invoke(userService,args);
                myAspect.after();
                return obj;
            }
        });
        return proxyUserService;
    }
}
