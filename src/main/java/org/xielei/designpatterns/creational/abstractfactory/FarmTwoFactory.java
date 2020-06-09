package org.xielei.designpatterns.creational.abstractfactory;

/**
 * FarmOne
 * 具体工厂
 * @author xielei
 * @date 2020/6/9
 **/
public class FarmTwoFactory implements FarmAbstractFactory {

    @Override
    public Animal newAnimal() {
        System.out.println("farm-two 生成 animal");
        return new AnimalCattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("farm-two 生成 plant");
        return new PlantFruitage();
    }
}
