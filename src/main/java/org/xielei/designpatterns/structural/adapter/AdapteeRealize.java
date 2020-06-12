package org.xielei.designpatterns.structural.adapter;

/**
 * AdapteeRealize
 * 适配者实现
 *
 * @author xielei
 * @date 2020/6/12
 **/
public class AdapteeRealize implements Adaptee {

    /**
     * 适配方法实现
     */
    @Override
    public void specificRequest() {
        System.out.println("AdapteeRealize specificRequest...");
    }
}
