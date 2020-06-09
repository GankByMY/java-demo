package org.xielei.designpatterns.creational.factorymethod;

/**
 * ConcreteFactoryTwo
 *
 * 具体工厂
 *
 * @author xielei
 * @date 2020/6/9
 **/
public class ConcreteFactoryTwo implements AbstractFactory {

    /**
     * 实现了产品的生成方法
     *
     * @return Product
     */
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProductTwo();
    }
}
