package com.vip.proxy.dynamicProxy;

public class Client$ {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();

        ProxyHandler$ proxyHandler = new ProxyHandler$();
        ISubject proxy = proxyHandler.getInstance(subject);

        proxy.love();
    }
}
