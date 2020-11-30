# 作业提交格式

```
#学号: G20200343150113
#姓名:Ceci
#班级:19期
#语言:Java
#作业链接:https://github.com/xcodewh/algorithm019/tree/main/Week_04
#总结链接:https://github.com/xcodewh/algorithm019/blob/main/Week_04/README.md
```

# Binary Search

```java
// Java
public int binarySearch(int[] array, int target) {
    int left = 0, right = array.length - 1, mid;
    while (left <= right) {
        mid = (right - left) / 2 + left;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return -1;
}
```