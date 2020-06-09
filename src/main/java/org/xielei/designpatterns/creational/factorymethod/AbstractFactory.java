package org.xielei.designpatterns.creational.factorymethod;

/**
 * AbstractFactory
 *
 * 抽象工厂
 *
 * @author xielei
 * @date 2020/6/9
 **/
public interface AbstractFactory {

    /**
     * 提供产品的生产方法
     *
     * @return Product
     */
    Product newProduct();
}
