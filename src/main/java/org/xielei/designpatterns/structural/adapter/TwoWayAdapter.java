package org.xielei.designpatterns.structural.adapter;

/**
 * TwoWayAdapter
 * 双向适配器
 *
 * @author xielei
 * @date 2020/6/12
 **/
public class TwoWayAdapter implements Adaptee, Target{

    /**
     * 适配者
     */
    private Adaptee adaptee;

    /**
     * 目标
     */
    private Target target;

    TwoWayAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    TwoWayAdapter(Target target) {
        this.target = target;
    }


    /**
     * 目标转适配者
     */
    @Override
    public void specificRequest() {
        target.request();
    }

    /**
     * 适配者转目标
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
