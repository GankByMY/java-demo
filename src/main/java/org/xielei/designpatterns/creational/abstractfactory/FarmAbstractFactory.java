package org.xielei.designpatterns.creational.abstractfactory;

/**
 * Farm
 *
 * 抽象农场（工厂）
 *
 * @author xielei
 * @date 2020/6/9
 **/
public interface FarmAbstractFactory {

    /**
     * 抽象生成动物方法
     * @return Animal
     */
    Animal newAnimal();

    /**
     * 抽象生成植物方法
     * @return
     */
    Plant newPlant();

}
