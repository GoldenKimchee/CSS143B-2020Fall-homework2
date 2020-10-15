public class Problem2 {

    /*
    This takes a sorted integer array as a parameter. It will have the first items of the list to be
    unique numbers that are sorted. The rest of the numbers after will be content that is ignored by
    the tests. It will return the length of the sorted array (amount of unique numbers).
     */

    public static int remove(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int compare = nums[0];
        int length = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != compare) {
                nums[length] = nums[i];
                compare = nums[i];
                length++;
            }
        }
        return length;
    }
}