package org.xielei.designpatterns.structural.proxy;

/**
 * RealSubject
 * 真实主题
 *
 * @author xielei
 * @date 2020/6/10
 **/
public class RealSubject implements Subject {

    /**
     * 具体执行方法
     */
    @Override
    public void execute() {
        System.out.println("执行真实主题的实际方法");
    }
}
