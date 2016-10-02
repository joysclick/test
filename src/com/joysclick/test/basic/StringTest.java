package com.joysclick.test.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by joysclick on 2016/10/2.
 */
public class StringTest {

    @Test
    public void HelloWorld(){
        System.out.println("Hello World!");
    }

    @Test
    public void TestSplit(){
        String s = "This is Split Test";
        String[] ls = s.split(" ");
        Assert.assertEquals(ls.length, 4, "Verify the string is split to 4 items");
    }

}
