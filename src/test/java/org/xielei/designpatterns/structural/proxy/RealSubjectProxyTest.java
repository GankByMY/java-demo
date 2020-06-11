package org.xielei.designpatterns.structural.proxy;

import org.junit.Test;

public class RealSubjectProxyTest {

    @Test
    public void realSubject() {
        Subject proxy = new RealSubjectProxy();
        proxy.execute();
    }

    @Test
    public void anotherRealSubject() {
        Subject proxy = new RealSubjectProxy(new AnotherRealSubject());
        proxy.execute();
    }
}