# 第六周学习笔记

这周主要学习动态规划。

### 动态规划的关键点

* 动态规划和递归或者分治没有根本上的区别（关键看有无最优的子结构）

* 共性：找到重复子问题

* 差异性：最优子结构、中途可以淘汰次优解

### 例题解题步骤

1. 最优子结构 opt[n] = best_of(opt[n-1],opt[n-2],...)

2. 储存中间状态: opt[i]

3. 递推公式（美其名曰：状态转移方程或者DP方程）

    Fib: opt[i] = opt[n-1] + opt[n-2]

    二维路径：opt[i,j] = opt[i+1,j] + opt[i][j+1] (且判断a[i,j]是否空地)


### 两种方法

方法一：先分治，再记忆化搜索

方法二：自底向上（for循环）-> 动态规划终极形态

---

### 递归代码模板

```java
// Java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```

### 分治代码模板

```java
private static int divide_conquer(Problem problem, ) {
  
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}
```

动态规划定义（wiki）：https://en.wikipedia.org/wiki/Dynamic_programming

MIT 动态规划课程最短路径算法:https://www.bilibili.com/video/av53233912?from=search&seid=2847395688604491997

三角形最小路径和高票回答： https://leetcode.com/problems/triangle/discuss/38735/Python-easy-to-understand-solutions-(top-down-bottom-up)

### 实战题目：

* [不同路径](https://leetcode-cn.com/problems/unique-paths/)（Facebook、亚马逊、微软在半年内面试中考过）

* [不同路径 II](https://leetcode-cn.com/problems/unique-paths-ii/) （谷歌、美团、微软在半年内面试中考过）

* [最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/)（字节跳动、谷歌、亚马逊在半年内面试中考过）

* 爬楼梯（阿里巴巴、腾讯、字节跳动在半年内面试常考）

* 三角形最小路径和（亚马逊、苹果、字节跳动在半年内面试考过）

* 最大子序和（亚马逊、字节跳动在半年内面试常考）

* 乘积最大子数组（亚马逊、字节跳动、谷歌在半年内面试中考过）

* 零钱兑换（亚马逊在半年内面试中常考）

* 打家劫舍（字节跳动、谷歌、亚马逊在半年内面试中考过）
* 打家劫舍 II （字节跳动在半年内面试中考过）
* 买卖股票的最佳时机（亚马逊、字节跳动、Facebook 在半年内面试中常考）
* 买卖股票的最佳时机 II （亚马逊、字节跳动、微软在半年内面试中考过）
* 买卖股票的最佳时机 III （字节跳动在半年内面试中考过）
* 最佳买卖股票时机含冷冻期（谷歌、亚马逊在半年内面试中考过）
* 买卖股票的最佳时机 IV （谷歌、亚马逊、字节跳动在半年内面试中考过）
* 买卖股票的最佳时机含手续费
* 股票问题系列通解

### 高级 DP 实战题目
* 完全平方数（亚马逊、谷歌在半年内面试中考过）
* 编辑距离 （重点）
* 跳跃游戏（亚马逊在半年内面试中考过）
* 跳跃游戏 II （亚马逊、华为字节跳动在半年内面试中考过）
* 不同路径（Facebook、亚马逊、微软在半年内面试中考过）
* 不同路径 II （谷歌、美团、微软在半年内面试中考过）
* 不同路径 III （谷歌在半年内面试中考过）
* 零钱兑换（亚马逊在半年内面试中常考）
* 零钱兑换 II （亚马逊、字节跳动在半年内面试中考过）

### 本周作业

#### 中等

* 最小路径和（亚马逊、高盛集团、谷歌在半年内面试中考过）
* 解码方法（亚马逊、Facebook、字节跳动在半年内面试中考过）
* 最大正方形（华为、谷歌、字节跳动在半年内面试中考过）
* 任务调度器（Facebook 在半年内面试中常考）
* 回文子串（Facebook、苹果、字节跳动在半年内面试中考过）

#### 困难

* 最长有效括号（字节跳动、亚马逊、微软在半年内面试中考过）
* 编辑距离（字节跳动、亚马逊、谷歌在半年内面试中考过）
* 矩形区域不超过 K 的最大数值和（谷歌在半年内面试中考过）
* 青蛙过河（亚马逊、苹果、字节跳动在半年内面试中考过）
* 分割数组的最大值（谷歌、亚马逊、Facebook 在半年内面试中考过）
* 学生出勤记录 II （谷歌在半年内面试中考过）
* 最小覆盖子串（Facebook 在半年内面试中常考）
* 戳气球（亚马逊在半年内面试中考过）