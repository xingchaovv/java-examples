package java_base_lang.dynamic.proxy.user_proxy;

import java.lang.reflect.Proxy;

/**
 * @example 动态代理实现：User 类例子
 */
public class Main {

    public static void main(String[] args) {
        User chao = new User();
        chao.sayDefaultMsg();
        chao.sayFor(" Future0");

        SayInterface chaoProxy = (SayInterface) Proxy.newProxyInstance(
            SayInterface.class.getClassLoader(), new Class[] {SayInterface.class}, new SayInvocationHandler(chao)
        );
        chaoProxy.sayDefaultMsg();
        chaoProxy.sayFor(" Future1");
    }
}
