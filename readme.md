
# HashMap vs with ArrayMap SparseMap 
https://www.jianshu.com/p/25ccfe46faf5

### SparseMap
源码比较简单，不做具体分析了。

1. 删除的时候不移动 array， 仅仅把key的value重置为固定对象。在读后者存的时机，去移动数组
2. key 是从小到大进行排序的，在put方法中，通过 ContainerHelpers#binarySearch搜索index，单元测试中包含了对补码，反码和源码研究。

#### Question:
1. SparseArray 支持一边遍历一边删除吗？

支持，只要key指定在array中存在就会删除，remove方法返回值是void。

适用场景：
数据量不大（千以内）
空间比时间重要
需要使用Map，且key为int类型。

2. 计算 ～1
// 0000 0000 0000 0000 0000 0000 0000 0001 // origin
// 1111 1111 1111 1111 1111 1111 1111 1110 // 补码， 高位为 1
// 1111 1111 1111 1111 1111 1111 1111 1101 // 反码 = 补码 - 1
// 0000 0000 0000 0000 0000 0000 0000 0010 => //原码 -2

某个数值的按位非操作，可以简单的理解为该值取负值后减1。 => -1-1 = -2