# 第三周学习笔记

## 知识点

这周主要学习了递归。第8课讲的分治和回溯，本质上都是递归。而递归本质上相当于一种循环。

### 递归函数模板

```java
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

主要为四个部分：

1. Recursion terminator. 必不可少的递归终结条件（否则就成了无限递归）。
2. Process. 处理当前层逻辑。
3. Drill down. 下探到下一层。
4. Revert. 清理当前层。

### 分治代码模板

```java
private static int divide_conquer(Problem problem, ) {
  //recursion terminator
  if (problem == NULL) {
    int res = process_last_result();
    return res;
  }

  //prepare data
  subProblems = split_problem(problem)
  
  //conquer subproblems
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  //process and generate the final result
  result = process_result(res0, res1);

  //revert the current level states

  return result;
}
```

## 解题

用递归求解有关树的问题很方便。

其中105题，从前序与中序遍历序列构造二叉树，利用前序遍历和中序遍历结果来确定根节点，进而确认左右子树，从而递归地构造二叉树。思路很巧妙。

同样二叉树的最近公共祖先的题目，乍一看很复杂，但是用递归求解，只需要短短几行代码。