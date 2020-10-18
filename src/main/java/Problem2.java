public class Problem2 {

    /*
    This takes a sorted integer array as a parameter. It will have the first items of the list to be
    unique numbers that are sorted. The rest of the numbers after will be content that is ignored by
    the tests. It will return the length of the sorted array (amount of unique numbers).
     */

    public static int remove(int[] nums) {
        if (nums == null || nums.length == 0) { // added in case null or empty list is inputed
            return 0;
        }
        // this only works since it is a sorted array!
        int compare = nums[0];
        int length = 1;                         // keeps track where to put the next unique number

        for (int i = 0; i < nums.length; i++) { // goes through the whole list
            if (nums[i] != compare) {           // if the next number is unique
                nums[length] = nums[i];         // unique number set to spot next to the other unique numbers
                compare = nums[i];              // resets what number to compare with
                length++;                       // resets where to put next unique number
            }
        }
        return length;
    }
}