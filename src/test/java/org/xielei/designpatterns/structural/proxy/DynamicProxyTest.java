package org.xielei.designpatterns.structural.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    @Test
    public void dynamicProxyTest(){
        Subject subject = new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(subject);
        Subject subjectProxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), dynamicProxy);
        subjectProxy.execute();
    }

}