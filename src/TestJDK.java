import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestJDK {
    @Test
    public void demo1(){
        UserService userServiceProxy = MybeanFactory.CreateUserService();
        userServiceProxy.addUser();
        userServiceProxy.deleteUser();
        userServiceProxy.updateUser();

//         UserService userService = new UserServiceImol();
//         MyInvationHandler myInvationHandler = new MyInvationHandler(userService);
//         UserService proxy = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(),userService.getClass().getInterfaces(),myInvationHandler);
//         proxy.addUser();
//         proxy.deleteUser();
//         proxy.updateUser();
    }
}
