public class Problem1 {

    /*
    This sorts three numbers that represent different colors. It has three pointers for the start, middle, and end.
    These pointers are used to format the numbers to the 0, 1, 2 or red, yellow, green order.
    Also, it takes one pass only!
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        if (nums != null && nums.length != 0) { // added in case null or empty list is inputed
            int low = 0, middle = 0, high = nums.length - 1;
            while (middle <= high) {            // while numbers have not all been checked
                if (nums[middle] == 0) {        // if 0, both low and mid pointers proceed up index
                    swap(nums, low, middle);
                    low++;
                    middle++;
                } else if (nums[middle] == 1) { // if 1, mid pointer proceeds up index
                    middle++;
                } else {                        // if 2, high pointer goes down index
                    swap(nums, middle, high);
                    high--;
                }
            }
        }
    }

    // swaps numbers at the indexes of firstNum and secondNum
    private static void swap(int[] nums, int firstNum, int secondNum) {
        int temp = nums[firstNum];
        nums[firstNum] = nums[secondNum];
        nums[secondNum] = temp;
    }
}
