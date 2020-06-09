package org.xielei.designpatterns.creational.abstractfactory;

/**
 * AnimalHorse
 *
 * 具体生成
 *
 * @author xielei
 * @date 2020/6/9
 **/
public class AnimalHorse implements Animal {

    /**
     * 具体方法
     */
    @Override
    public void show() {
        System.out.println("生成 horse");
    }
}
