package com.own.gc;

public class Allocation {

    private static final int _1MB = 1024 * 1024;

    /**
     * vm connfig
     *      -verbose:gc -XX:+PrintGCDetails -Xms20m -Xmx20m -Xmn10m -XX:SurvivorRatio=8 -XX:+UseSerialGC -XX:PretenureSizeThreshold=3145728
     */
    public static void test(){
        Byte[] allocation1, allocation2, allocation3, allocation4;

       /* allocation1 = new Byte[2 * _1MB];
        allocation2 = new Byte[2 * _1MB];
        allocation3 = new Byte[2 * _1MB];*/
        allocation4 = new Byte[6 * _1MB];

    }

    /**
     * -verbose:gc -XX:+PrintGCDetails -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     */
    public static void testMaxTenuringThreshold(){
        Byte[] allocation1, allocation2, allocation3, allocation4;

        allocation1 = new Byte[_1MB/4];
        allocation2 = new Byte[4 * _1MB];
       /* allocation3 = new Byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new Byte[4 * _1MB];*/
    }

    public static void main(String[] args) {
        testMaxTenuringThreshold();
    }

}
