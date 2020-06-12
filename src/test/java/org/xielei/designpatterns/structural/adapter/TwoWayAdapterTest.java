package org.xielei.designpatterns.structural.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoWayAdapterTest {

    /**
     * 目标转适配者
     */
    @Test
    public void specificRequest() {
        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(new TargetRealize());
        twoWayAdapter.specificRequest();
    }

    /**
     * 适配者转目标
     */
    @Test
    public void request() {
        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(new AdapteeRealize());
        twoWayAdapter.request();
    }
}