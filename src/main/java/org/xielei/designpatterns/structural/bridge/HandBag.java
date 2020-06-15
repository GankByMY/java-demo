package org.xielei.designpatterns.structural.bridge;

/**
 * HandBag
 * 手提包（
 *
 * @author xielei
 * @date 2020/6/15
 **/
public class HandBag extends AbstractBag {

    @Override
    public String getName() {
        return bagColor.getColor().concat(" handBag");
    }
}
