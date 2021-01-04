package java_base_lang.dynamic.proxy.user_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SayInvocationHandler implements InvocationHandler {

    private Object proxied;

    public SayInvocationHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("proxy: %s, method: %s\n", proxy.getClass(), method);
        if (args != null) {
            for (Object arg : args) {
                System.out.println("arg: " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}
