#jvm配置参数
   
## 栈
***
    -Xss128k   设置栈大小

## 方法区
***
     -XX:PermSize=10M 最小方法区
     -XX:MaxPermSize=10M  最大方法区

## GC输出
    -verbose:gc 用于查看Java垃圾收集的结果
    
    -XX:+PrintGCTimeStamps 输出GC的时间戳（以基准时间的形式）
    
    -XX:+PrintGCDateStamps 输出GC的时间戳（以日期的形式，如 2013-05-04T21:53:59.234+0800）
    
    -XX:+PrintHeapAtGC 在进行GC的前后打印出堆的信息
    
    -XX:+PrintGCApplicationStoppedTime // 输出GC造成应用暂停的时间
  
    -Xloggc:../logs/gc.log 日志文件的输出路径

##堆

###新生代
***
    -XX:SurvivorRatio  Eden与Survivor 区的比例
    
###老年代
***    
    -XX:PretenureSizeThreshold  晋升老年代对象年龄


 