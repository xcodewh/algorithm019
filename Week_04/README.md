# 第四周学习笔记

使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

## 思路

假设给定的数组为nums，有序部分为升序，mid为二分查找的分割位置。如果 nums[left] > nums[mid]，表示旋转位置在左半部分，反之则在右半部分。

与常规二分查找不同的是，mid元素在常规二分查找中会被检查是否与所要查找的元素匹配，在把数组砍半的时候不用再包含mid，即 left = mid + 1 或者 right = mid - 1。但是这里在寻找数组旋转位置的时候，mid还要被考虑进去。

## 代码

```java
    public int search(int[] nums) {
        int left = 0, right = nums.length -1, mid;
        if (right < 1) return -1;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (left == right -1) { //This is where the array is rotated
                if ((nums[left] > nums[right])) {
                    return left;
                } else {
                    return -1;
                }
            } else if (nums[left] > nums[mid]) { //The rotate position is on the left
                right = mid;
            } else { //The rotate position is on the right
                left = mid;
            }
        }
        return -1;
    }
```

