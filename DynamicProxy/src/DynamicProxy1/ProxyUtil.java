package DynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    /*方法的作用：给一个对象创建代理
    *
    * 形参：被代理的对象
    *
    * 返回值：创建的代理
    *
    * */
    public static Star creatProxy(BigStar bigStar){

        Star star = (Star) Proxy.newProxyInstance(
                //参数一：用于指定用哪个类加载器，去加载生成的代理类
                ProxyUtil.class.getClassLoader(),
                //参数二：指定接口，这些接口用于指定生成的代理包含哪些方法
                new Class[]{Star.class},
                //参数三：用来指定所生成的代理对象做什么事情
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sing".equals(method.getName())){
                            System.out.println("收钱");
                        }else if ("dance".equals(method.getName())){
                            System.out.println("tiaowushouqian");
                        }

                        return method.invoke(bigStar, args);
                    }
                }
        );

        return star;
    }
}
