
# HashMap vs with ArrayMap SparseMap 
https://www.jianshu.com/p/25ccfe46faf5

### SparseMap
源码比较简单，不做具体分析了。

1. 删除的时候不移动 array， 仅仅把key的value重置为固定对象。在读后者存的时机，去移动数组

适用场景：
数据量不大（千以内）
空间比时间重要
需要使用Map，且key为int类型。