package org.xielei.designpatterns.creational.abstractfactory;

/**
 * PlantFruitage
 * 具体生成
 * @author xielei
 * @date 2020/6/9
 **/
public class PlantVegetables implements Plant {

    /**
     * 具体方法
     */
    @Override
    public void show() {
        System.out.println("生成 vegetables");
    }
}
