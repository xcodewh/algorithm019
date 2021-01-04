# 第九周学习笔记

## 动态规划 (Dynamic Programming)

1. “Simplifying a complicated problem by breaking it down into
simpler sub-problems”
(in a recursive manner)
2. Divide & Conquer + Optimal substructure
分治 + 最优子结构
3. 顺推形式： 动态递推

### DP 顺推模板

```
function DP():
    dp = [][] # ⼆维情况
    for i = 0 .. M {
        for j = 0 .. N {
            dp[i][j] = _Function(dp[i’][j’]…)
        }
    }
    return dp[M][N];
```

### 关键点

动态规划 和 递归或者分治 没有根本上的区别（关键看有无最优的子结构）

拥有共性：找到重复子问题

差异性：最优子结构、中途可以淘汰次优解

## 字符串

### 遍历字符串

```java
String x = "abbc";
for (int i = 0; i < x.size(); ++i) {
    char ch = x.charAt(i);
}
for ch in x.toCharArray() {
    System.out.println(ch);
}

```

### 字符串匹配算法

1. 暴力法
2. Rabin-Karp 算法
3. KMP 算法