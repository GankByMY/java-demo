package org.xielei.designpatterns.structural.bridge;

/**
 * ColorYellow
 * 黄色包包（具体实现化）
 *
 * @author xielei
 * @date 2020/6/15
 **/
public class ColorYellow implements BagColor {

    @Override
    public String getColor() {
        return "yellow";
    }
}
