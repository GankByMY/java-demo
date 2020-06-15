package org.xielei.designpatterns.structural.bridge;

import org.junit.Test;

public class AbstractBagTest {

    @Test
    public void getName() {
        AbstractBag abstractBag = new Wallet();
        System.out.println(abstractBag.getName());

        abstractBag = new HandBag();
        System.out.println(abstractBag.getName());
    }

    @Test
    public void setBagColor() {
        BagColor bagColor = new ColorGreen();
        AbstractBag abstractBag = new Wallet();
        abstractBag.setBagColor(bagColor);
        System.out.println(abstractBag.getName());
    }
}