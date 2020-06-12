package org.xielei.designpatterns.structural.proxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * DynamicProxy
 * 动态代理
 * @author xielei
 * @date 2020/6/11
 **/
@NoArgsConstructor
@AllArgsConstructor
public class DynamicProxy implements InvocationHandler {

    /**
     * 代理对象
     */
    private Object object;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preInvoke(method);
        method.invoke(object, args);
        postInvoke(method);
        return null;
    }

    private void preInvoke(Method method) {
        System.out.println("Before invoke :"  + method.getName());
    }

    private void postInvoke(Method method) {
        System.out.println("After invoke :"  + method.getName());
    }
}
