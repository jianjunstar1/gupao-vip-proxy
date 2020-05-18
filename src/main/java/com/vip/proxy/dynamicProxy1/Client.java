package com.vip.proxy.dynamicProxy1;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();

        ProxyHandler handler = new ProxyHandler();
        ISubject proxy = handler.getInstance(subject);

        proxy.love();
    }
}
