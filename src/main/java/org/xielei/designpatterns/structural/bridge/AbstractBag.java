package org.xielei.designpatterns.structural.bridge;

import lombok.Setter;

/**
 * Bag
 * 抽象包包（抽象化）
 *
 * @author xielei
 * @date 2020/6/15
 **/
@Setter
abstract class AbstractBag {

    protected BagColor bagColor = () -> "default black";

    /**
     * 获取包包名字
     * @return 包包名字
     */
    public abstract String getName();
}
