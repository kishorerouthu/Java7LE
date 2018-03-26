package com.java7.mislleaneous;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Kishore Routhu on 20/11/17 8:47 PM.
 */
public class TreeSetTest {

    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet();
        set.add(3);
        set.add((int) 3.0);
        set.add(2);
        set.add(2);
        set.add(new Integer(2));
        set.add(Integer.parseInt("2"));

        System.out.println(set);
    }
}
