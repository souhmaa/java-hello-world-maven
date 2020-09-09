package com.myorganization.app;

import org.junit.Assert;
import org.junit.Test;

public class ATest {

    @Test
    public void t1() {
        A a = new A();
        boolean result = a.a(8);
        Assert.assertTrue(result);
    }

    @Test
    public void t2() {
        A a = new A();
        boolean result = a.a(1);
        Assert.assertFalse(result);
    }

}
