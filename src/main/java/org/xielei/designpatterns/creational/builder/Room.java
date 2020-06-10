package org.xielei.designpatterns.creational.builder;

import lombok.Setter;
import lombok.ToString;

/**
 * Room
 *
 * 房间（产品）
 *
 * @author xielei
 * @date 2020/6/10
 **/
@Setter
@ToString
public class Room {

    /**
     * 墙
     */
    private String wall;

    /**
     * 电视
     */
    private String TV;

    /**
     * 沙发
     */
    private String sofa;

    public void show() {
        System.out.println("room show -> wall:" + wall + " tv:" + TV + " sofa:" + sofa );
    }
}
