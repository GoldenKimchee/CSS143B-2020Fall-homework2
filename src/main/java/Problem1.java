public class Problem1 {

    /*
    This sorts three numbers that represent different colors. It has three pointers for the start, middle, and end.
    These pointers are used to format the numbers to the right position. Also, it takes one pass only!
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int low = 0, middle = 0, high = nums.length - 1;
        while (middle <= high) {
            if (nums[middle] == 0) {
                swap(nums, low, middle);
                low++;
                middle++;
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                swap(nums, middle, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int firstNum, int secondNum) {
        int temp = nums[firstNum];
        nums[firstNum] = nums[secondNum];
        nums[secondNum] = temp;
    }
}
