package org.xielei.designpatterns.creational.builder;

/**
 * ProjectManager
 *
 * 项目经理（指挥者）
 *
 * @author xielei
 * @date 2020/6/10
 **/
public class ProjectManager {

    private Decorator decoratorBuilder;

    /**
     * 构建建造者
     * @param decoratorBuilder
     */
    public ProjectManager(Decorator decoratorBuilder) {
        this.decoratorBuilder = decoratorBuilder;
    }

    /**
     * 组装产品
     * @return
     */
    public Room buildRoom() {
        decoratorBuilder.buildWall();
        decoratorBuilder.buildTV();
        decoratorBuilder.buildSofa();
        System.out.println("ProjectManager 组装产品...");
        return decoratorBuilder.getRoom();
    }
}
