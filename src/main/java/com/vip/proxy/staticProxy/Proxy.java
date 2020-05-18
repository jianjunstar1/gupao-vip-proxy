package com.vip.proxy.staticProxy;

public class Proxy implements ISubject {
    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void love() {
        subject.love();
    }
}
