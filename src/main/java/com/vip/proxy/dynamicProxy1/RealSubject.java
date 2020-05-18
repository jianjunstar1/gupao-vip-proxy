package com.vip.proxy.dynamicProxy1;

public class RealSubject implements ISubject {

    @Override
    public void love() {
        System.out.println("My Love");
    }
}
