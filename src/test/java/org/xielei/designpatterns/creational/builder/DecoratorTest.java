package org.xielei.designpatterns.creational.builder;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void getRoom() {
        // 具体装修者
        Decorator decorator = new ConcreteDecoratorOne();
        // 指挥者构建
        ProjectManager projectManager = new ProjectManager(decorator);
        // 指挥者组装
        Room decorateOne = projectManager.buildRoom();

        System.out.println("最后生成的 room one:" + decorateOne);

        System.out.println("------------------------");

        decorator = new ConcreteDecoratorTwo();

        projectManager = new ProjectManager(decorator);

        Room decorateTwo = projectManager.buildRoom();

        System.out.println("最后生成的 room two:" + decorateTwo);
    }
}