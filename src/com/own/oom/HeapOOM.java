package com.own.oom;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    static class OOMObject{
    }

    /**
     *
     * VM options配置 -verbose:gc -Xms:20M -Xmx:20M -Xmn:10 -XX:+PrintGCDetails -XX:SurvivorRatio=8
     *  -verbose:gc 用于查看Java垃圾收集的结果
     * -Xms：20M 初始化堆内存大小
     * -Xmn：20M 堆内存最大值
     * -Xmn：10M 新生代内存设置
     * -XX:+PrintGcDetails 用于打印GC的日志信息
     * -XX:SurvivorRation=8
     * -XX:+HeapDumpOnOutOfMemoryError 保存堆快照文件
     * @param args
     */
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true){
            list.add(new OOMObject());
        }
    }
}
