package com.vip.proxy.dynamicProxy;

public class RealSubject implements ISubject {

    @Override
    public void love() {
        System.out.println("Love");
    }
}
