import java.util.Arrays;

/**
 * This class uses the binary search to find the rotate position in a rotated sorted array (in ascending order).
 * 
 * This is related to problem [33] Search in Rotated Sorted Array
 */
class MyBinarySearch {
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

    public static void main(String[] args) throws Exception {
        int[] nums = {4,5,6,7,0,1,2};
        MyBinarySearch mySearch = new MyBinarySearch();
        int pos = mySearch.search(nums);
        System.out.println(Arrays.toString(nums)); 
        System.out.println(pos);
    }
}