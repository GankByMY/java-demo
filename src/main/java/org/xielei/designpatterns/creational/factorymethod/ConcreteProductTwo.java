package org.xielei.designpatterns.creational.factorymethod;

/**
 * ConcreteProductTwo
 *
 * 具体产品
 *
 * @author xielei
 * @date 2020/6/9
 **/
public class ConcreteProductTwo implements Product{

    /**
     * 实现抽象产品中的抽象方法
     */
    @Override
    public void show() {
        System.out.println("产品2显示...");
    }
}
