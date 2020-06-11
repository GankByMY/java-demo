package org.xielei.designpatterns.structural.proxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Proxy
 * 代理类
 * @author xielei
 * @date 2020/6/10
 **/
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RealSubjectProxy implements Subject{

    private Subject realSubject;

    /*public RealSubjectProxy(Subject subject) {
        this.realSubject = subject;
    }*/

    /**
     * 代理方法执行
     */
    @Override
    public void execute() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        preExecute();
        realSubject.execute();
        postExecute();
    }

    /**
     * 预处理
     */
    private void preExecute() {
        System.out.println("执行被代理主题方法前的预处理");
    }

    /**
     * 后续处理
     */
    private void postExecute() {
        System.out.println("执行被代理主题方法后的后续处理");
    }
}
