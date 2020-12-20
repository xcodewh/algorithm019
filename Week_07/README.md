# 第七周学习笔记

## Trie树

### 基本性质：

1. 结点本身不存完整单词

2. 从根节点到某一节点，路径上经过的字符连接起来，为该节点对应的字符串

3. 每个节点的所有子节点路径代表的字符都不相同

### 核心思想：

* Trie树的核心思想是空间换时间

* 利用字符串的公共前缀来降低查询时间的开销以达到提高效率的目的

## 并查集 （Disjoint Set）

### 适用场景：

* 组团、配对问题

* Group or not？

### 基本操作：

* makeSet(s): 建立一个新的并查集，其中包含s个单元素集合

* unionSet(x, y): 把元素x和元素y所在的集合合并，要求x和y所在的集合不相交，如果相交则不合并

* find(x): 找到元素x所在的集合的代表，该操作也可以用于判断两个元素是否位于同一个集合，只要将它们各自的代表比较一下就可以了

## 初级搜索：

1. 朴素搜索

2. 优化方式：不重复（Fibonacci)、剪枝（生成括号问题）

3. 搜索方向：

    * DFS：depth first search 深度优先搜索

    * BFS：breadth first search 广度优先搜索

## 高级搜索：

双向搜索、启发式搜索

## 启发式搜索（Heuristic Search (A*)）

估价函数

启发式函数：h(n)，它用来评价哪些节点最有希望是我们要找的节点，h(n)会返回一个非负实数，也可以认为是节点n的目标节点路径的估计成本。

启发式函数是一种告知搜索方向的方法。它提供了一种明智的方法来猜测哪个邻居节点会导向一个目标。

## 题目

### Trie树

* 二叉树的层次遍历
* 实现 Trie (前缀树)
* 单词搜索 II 

### 并查集

* 朋友圈（亚马逊、Facebook、字节跳动在半年内面试中考过）
* 岛屿数量（近半年内，亚马逊在面试中考查此题达到 361 次）
* 被围绕的区域（亚马逊、eBay、谷歌在半年内面试中考过）

### 剪枝

* 爬楼梯（阿里巴巴、腾讯、字节跳动在半年内面试常考）
* 括号生成（亚马逊、Facebook、字节跳动在半年内面试中考过）
* N 皇后（亚马逊、苹果、字节跳动在半年内面试中考过）
* 有效的数独（亚马逊、苹果、微软在半年内面试中考过）
* 解数独（亚马逊、华为、微软在半年内面试中考过）

### 双向BFS
* 单词接龙（亚马逊、Facebook、谷歌在半年内面试中考过）
* 最小基因变化（谷歌、Twitter、腾讯在半年内面试中考过）

### 启发式搜索

* 二进制矩阵中的最短路径（亚马逊、字节跳动、Facebook 在半年内面试中考过）
* 滑动谜题（微软、谷歌、Facebook 在半年内面试中考过）
* 解数独（微软、华为、亚马逊在半年内面试中考过）

### 本周作业

#### 简单

* 爬楼梯（阿里巴巴、腾讯、字节跳动在半年内面试常考）

#### 中等

* 实现 Trie (前缀树) （亚马逊、微软、谷歌在半年内面试中考过）
* 朋友圈（亚马逊、Facebook、字节跳动在半年内面试中考过）
* 岛屿数量（近半年内，亚马逊在面试中考查此题达到 361 次）
* 被围绕的区域（亚马逊、eBay、谷歌在半年内面试中考过）
* 有效的数独（亚马逊、苹果、微软在半年内面试中考过）
* 括号生成（亚马逊、Facebook、字节跳动在半年内面试中考过）
* 单词接龙（亚马逊、Facebook、谷歌在半年内面试中考过）
* 最小基因变化（谷歌、Twitter、腾讯在半年内面试中考过）

#### 困难

* 单词搜索 II （亚马逊、微软、苹果在半年内面试中考过）
* N 皇后（亚马逊、苹果、字节跳动在半年内面试中考过）
* 解数独（亚马逊、华为、微软在半年内面试中考过）

---

## 链接

* AlphaZero Explained： https://nikcheerla.github.io/deeplearningschool/2018/01/01/AlphaZero-Explained/

* 棋类复杂度： https://en.wikipedia.org/wiki/Game_complexity

* 相似度测量方法: https://dataaspirant.com/five-most-popular-similarity-measures-implementation-in-python/

* 二进制矩阵中的最短路径的 A* 解法: https://leetcode.com/problems/shortest-path-in-binary-matrix/discuss/313347/A*-search-in-Python

* 8 puzzles 解法比较: https://zxi.mytechroad.com/blog/searching/8-puzzles-bidirectional-astar-vs-bidirectional-bfs/

* 维基百科：平衡树： https://en.wikipedia.org/wiki/Self-balancing_binary_search_tree