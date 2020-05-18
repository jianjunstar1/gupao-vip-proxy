package com.vip.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler$ implements InvocationHandler {
    private ISubject target;

    public ISubject getInstance(ISubject target) {
        this.target = target;

        Class clazz = target.getClass();
        return (ISubject)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = method.invoke(target, args);
        return object;
    }
}
