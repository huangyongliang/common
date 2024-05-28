package com.hyl.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hyl
 * @version V1
 * @since 2024-05-21 17:18
 */
public class Test {
    private static final Set<String> set = new HashSet<>();
    {
        System.out.println("test1");
        set.add("house1");
        set.add("house2");
    }
    static {
        System.out.println("test2");
        set.add("house3");
        set.add("house4");
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}
