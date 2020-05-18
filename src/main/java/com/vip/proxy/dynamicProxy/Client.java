package com.vip.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        ProxyHandler handler = new ProxyHandler(subject);

        ISubject proxy = (ISubject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{ISubject.class}, handler);
        proxy.love();

        ISubject proxy_1 = (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy_1.love();
    }
}
