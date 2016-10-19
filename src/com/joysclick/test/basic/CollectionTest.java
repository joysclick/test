package com.joysclick.test.basic;

import org.testng.annotations.Test;
import java.util.*;

/**
 * Created by joysclick on 2016/10/17.
 */
public class CollectionTest {

    @Test
    public void LinkedListTest(){
        List<String> staff = new LinkedList<String>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Car");
        Iterator iter = staff.iterator();
        String first = iter.next().toString();
        String second = iter.next().toString();
        iter.remove();

    }





}
