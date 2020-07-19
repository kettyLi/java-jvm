package com.own.oom;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstPoolOOM {

    public static void main(String[] args) {
        //List持有常量池引用，避免Full GC回收常量池
        List<String> list = new ArrayList<>();

        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }

    }
}
