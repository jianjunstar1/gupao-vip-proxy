package com.vip.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);

        proxy.love();
    }
}
