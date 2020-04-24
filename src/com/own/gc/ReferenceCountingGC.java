package com.own.gc;

import java.util.LinkedHashMap;

/**
 * test circular reference can not be recycled
 */
public class ReferenceCountingGC {

    Object instance = null;

    public static final int size = 1024* 1024;

  //  public static byte[] array = new byte[size * 2];

    public static void test(){
        ReferenceCountingGC a = new ReferenceCountingGC();
        ReferenceCountingGC b = new ReferenceCountingGC();
        a.instance = b;
        b.instance = a;

        a = null;
        b = null;

        System.gc();
    }

    public static void main(String[] args) {
        test();
        new LinkedHashMap<>();
    }
}
