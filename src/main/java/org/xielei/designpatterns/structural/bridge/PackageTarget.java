package org.xielei.designpatterns.structural.bridge;

/**
 * Package
 * 适配目标接口
 *
 * @author xielei
 * @date 2020/6/15
 **/
public interface PackageTarget {

    /**
     * 获取适配目标包名
     * @return 包名
     */
    String getPackageName();
}
