package org.xielei.designpatterns.creational.factorymethod;

/**
 * ConcreteFactoryOne
 *
 * 具体工厂
 *
 * @author xielei
 * @date 2020/6/9
 **/
public class ConcreteFactoryOne implements AbstractFactory {

    /**
     * 实现了产品的生成方法
     *
     * @return Product
     */
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProductOne();
    }
}
