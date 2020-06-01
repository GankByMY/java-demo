package org.xielei.qrcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QRCodeUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void decode() {
        //        File file = new File("/home/xielei/Project/maven-project/src/main/java/org/xielei/qrcode/qrcode.jpg");
        try {
            String decode = QRCodeUtil.decode("src/main/java/org/xielei/qrcode/qrcode.jpg");
            System.out.println(decode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDecode() {
        System.out.println("testDecode");
    }
}