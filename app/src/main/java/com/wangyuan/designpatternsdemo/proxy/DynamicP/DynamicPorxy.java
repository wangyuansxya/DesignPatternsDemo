package com.wangyuan.designpatternsdemo.proxy.DynamicP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wangyuan on 2017/9/4.
 * 1.代理对象,不需要实现接口
 * 2.代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)
 * .动态代理也叫做:JDK代理,接口代理
 *
 * JDK中生成代理对象的API
 * 代理类所在包:java.lang.reflect.Proxy
 *
 * 目标对象实现的接口的类型,使用泛型方式确认类型
 *
 * 使用了反射机制，对性能会造成影响
 */

public class DynamicPorxy {

    private Object target;

    public DynamicPorxy(Object target) {
        this.target = target;
    }

    ////给目标对象生成代理对象给目标对象生成代理对象
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Object value = method.invoke(target, args);

                        return value;
                    }
                });
    }

}
