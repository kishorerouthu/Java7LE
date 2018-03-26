package com.java7;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Kishore Routhu on 24/10/17 5:53 PM.
 */
public class StreamTest {

    public static void main(String[] args) {
        Set<PrefabDetails> set = new HashSet<>();
        set.add(new PrefabDetails("test1"));
        set.add(new PrefabDetails("test2"));

        String dependent = set.stream().map(prefabDetails -> prefabDetails.getName()).collect(Collectors.joining(","));
        System.out.println("Dependent ["+ dependent + "]" );
    }
}

class PrefabDetails {

    private String name;

    public PrefabDetails(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
