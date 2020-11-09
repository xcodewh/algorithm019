/**
 * [26] Remove Duplicates from Sorted Array
 * 
 * Given a sorted array nums, remove the duplicates in-place 
 * such that each element appears only once and returns the new length.
 * 
 * Do not allocate extra space for another array, you must do this 
 * by modifying the input array in-place with O(1) extra memory.
 * 
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2 ) return nums.length;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}