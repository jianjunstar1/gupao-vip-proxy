package com.vip.proxy.staticProxy;

public class RealSubject implements ISubject {

    @Override
    public void love() {
        System.out.println("Love");
    }
}
