package org.xielei.designpatterns.structural.adapter;

/**
 * TargetRealize
 * 目标接口实现
 *
 * @author xielei
 * @date 2020/6/12
 **/
public class TargetRealize  implements Target{

    /**
     * 目标方法实现
     */
    @Override
    public void request() {
        System.out.println("targetRealize request");
    }
}
