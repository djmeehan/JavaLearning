package com.djm.javalearning;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {


    private HashMapExample example = new HashMapExample();
    private HashMap hmap;


    @Before
    public void setUp() {
        hmap = example.generateHashMap();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldGenerateValidHashMap() {
        assertThat(hmap, instanceOf(HashMap.class));
    }

    @Test
    public void shouldHaveSizeFive() {
        Assert.assertEquals(5, hmap.size());
    }

    @Test
    public void displayContentsOfHashMap() {

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
    }

    @Test
    public void getValuesWithKey() {
        System.out.println("Value at index 2 is: " + hmap.get(2));
    }

    @Test
    public void removeElementFromHashMap() {

        displayContentsOfHashMap();
        hmap.remove(2);
        displayContentsOfHashMap();
        Assert.assertEquals(4, hmap.size());
    }


    @Test
    public void sortedHashMap(){
        TreeMap<Integer, String> tmap = new TreeMap<>();

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();

        }

    }

}
