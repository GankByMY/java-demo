package org.xielei.designpatterns.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 包裹适配器测试类
 */
public class PackageAdapterTest {

    @Test
    public void getPackageName() {
        AbstractBag bag = new Wallet();
        PackageAdapter packageAdapter = new PackageAdapter(bag);
        System.out.println(packageAdapter.getPackageName());

        ColorYellow colorYellow = new ColorYellow();
        bag = new HandBag();
        bag.setBagColor(colorYellow);
        packageAdapter.setBag(bag);
        System.out.println(packageAdapter.getPackageName());
    }
}