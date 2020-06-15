package org.xielei.designpatterns.structural.bridge;

/**
 * Wallet
 *
 * @author xielei
 * @date 2020/6/15
 **/
public class Wallet extends AbstractBag {

    @Override
    public String getName() {
        return bagColor.getColor().concat(" wallet");
    }
}
