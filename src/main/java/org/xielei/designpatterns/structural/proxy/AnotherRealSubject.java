package org.xielei.designpatterns.structural.proxy;

/**
 * AnotherRealSubject
 * 另一个具体主题
 * @author xielei
 * @date 2020/6/10
 **/
public class AnotherRealSubject implements Subject {

    @Override
    public void execute() {
        System.out.println("执行另一个真实主题的实际方法...");
    }
}
