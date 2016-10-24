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

    @Test
    public void HashSetTest(){
        Set<String> words = new HashSet<String>();
        long totalTime = 0;
        Scanner in = new Scanner(System.in);  //debug will be hang at this place
        while(in.hasNext()){
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for(int i=1; i<=20; i++){
            System.out.println(iter.next());
        }
        System.out.println("...");
        System.out.println(words.size() + "distinct words. " + totalTime + "millionseconds.");
    }





}
