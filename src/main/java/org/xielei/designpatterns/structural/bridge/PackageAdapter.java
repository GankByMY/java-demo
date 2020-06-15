package org.xielei.designpatterns.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * PackageAdapter
 * 包裹适配器
 *
 * @author xielei
 * @date 2020/6/15
 **/
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PackageAdapter implements PackageTarget {

    private AbstractBag bag;

    /**
     * 获取包裹名
     * @return 包裹名
     */
    @Override
    public String getPackageName() {
        System.out.println("进入包裹适配器");
        return bag.getName();
    }
}
