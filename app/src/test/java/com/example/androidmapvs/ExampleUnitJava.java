package com.example.androidmapvs;

import org.junit.Test;

public class ExampleUnitJava {

    @Test
    public void ls_test() {
        System.out.println(~0);
        System.out.println(1 >> 1);
        System.out.println(1 >>> 1);

        // ～1
        // 0000 0000 0000 0000 0000 0000 0000 0001 // origin
        // 1111 1111 1111 1111 1111 1111 1111 1110 // 补码， 高位为 1
        // 1111 1111 1111 1111 1111 1111 1111 1101 // 反码 = 补码 - 1
        // 0000 0000 0000 0000 0000 0000 0000 0010 => //原码 -2

        System.out.println(~1);    // -2
        System.out.println(~-1);   // 0

    }

    @Test
    public void binary_search_test() {
        final int[] ints = {5, 3, 6, 2, 1};

        final int i = ContainerHelpers.binarySearch(ints, ints.length, 4);
        System.out.println(i);
//        Utils.suspend();
    }
}
