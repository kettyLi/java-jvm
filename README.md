#jvm配置参数
   
## 栈
***
    -Xss128k   设置栈大小

## 方法区
***
     -XX:PermSize=10M 最小方法区
     -XX:MaxPermSize=10M  最大方法区
     
     PermGen space(永久代)指方法区。从JDK1.7开始移除永久代。
     JDK1.7中，存储在永久代的部分数据就已经转移到了Java Heap或者是 Native Heap。
     但永久代仍存在于JDK1.7中，并没完全移除，譬如符号引用(Symbols)转移到了native heap；
     字面量(interned strings)转移到了java heap；类的静态变量(class statics)转移到了java heap。
     JDK 1.8 中已经不存在永久代
## 元空间
***
    元空间的本质和永久代类似，都是对JVM规范中方法区的实现。
    不过元空间与永久代之间最大的区别在于：元空间并不在虚拟机中，而是使用本地内存。
    因此，默认情况下，元空间的大小仅受本地内存限制，但可以通过以下参数来指定元空间的大小。
    
    -XX:MetaspaceSize，初始空间大小
    -XX:MaxMetaspaceSize，最大空间，默认是没有限制的
    
  ##堆
  
  ***
    初始化堆：-Xms20M
    最大堆：-Xmx20M 
    新生代：-Xmn10M
    
    
   ###新生代
    ***
        -XX:SurvivorRatio  Eden与Survivor 区的比例
        
   ###老年代
    ***    
        -XX:PretenureSizeThreshold=1024*1024  对象大小超过指定值直接进入老年代
        -XX:MaxTenuringThreshold=15     对象年龄超过15岁晋升到老年代
        -XX:HandlePromotionFailure=false  是否允许分配担保失败
            Unrecognized VM option 'HandlePromotionFailur=true' Did you mean '(+/-)PromotionFailureALot'? 


## GC输出
    -verbose:gc 用于查看Java垃圾收集的结果
    
    -XX:+PrintGCDetails  虚拟机在发生垃圾收集行为时打印内存回收日志，并且在进程退出的时候输出当前内存各区域的分配情 况
    
    -XX:+PrintGCTimeStamps 输出GC的时间戳（以基准时间的形式）
    
    -XX:+PrintGCDateStamps 输出GC的时间戳（以日期的形式，如 2013-05-04T21:53:59.234+0800）
    
    -XX:+PrintHeapAtGC 在进行GC的前后打印出堆的信息
    
    -XX:+PrintGCApplicationStoppedTime  输出GC造成应用暂停的时间
  
    -Xloggc:../logs/gc.log 日志文件的输出路径
    
    -XX:+HeapDumpOnOutOfMemoryError 虚拟机在出现内存溢出异常时Dump出当前的内存堆转储快照


##GC 配置
    java -XX:+PrintCommandLineFlags -version  查看jvm使用的垃圾收集器 
    -XX:UseSerialGC     Serial + Serial Old 收集器
    
    
    
##其他
- - -
[markdown基本语法](https://www.jianshu.com/p/191d1e21f7ed/)
    