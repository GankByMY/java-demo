package org.xielei.designpatterns.creational.builder;

/**
 * Decorator
 *
 * 建造者（抽象）
 *
 * @author xielei
 * @date 2020/6/10
 **/
public abstract class Decorator {

    protected Room room = new Room();

    /**
     * 构建墙体
     */
    abstract void buildWall();

    /**
     * 构建TV
     */
    abstract void buildTV();

    /**
     * 构建沙发
     */
    abstract void buildSofa();

    public Room getRoom() {
        System.out.println("room: " + room.toString());
        return room;
    }
}
