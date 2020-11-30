/**
 * This class uses the binary search to find the rotate position in a rotated sorted array (in ascending order).
 * 
 * This is related to problem [33] Search in Rotated Sorted Array
 */
class MyBinarySearch {
    public int search(int[] nums) {
        int left = 0, right = nums.length -1, mid;
        if (right < 2) return 0;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (left == right -1) { //This is where the array is rotated
                return left;
            } else if (nums[left] > nums[mid]) { //The rotate position is on the left
                right = mid;
            } else { //The rotate position is on the right
                left = mid;
            }
        }
        return 0;
    }
}