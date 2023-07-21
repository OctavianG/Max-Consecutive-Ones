public class Main {

    // Time complexity O(n)
    // Space complexity O(1)
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1) {
            return nums[0] == 1 ? 1 : 0;
        }

        int count = 0;
        int maxCount = 0;
        boolean start = false;

        for (int i = 0; i < nums.length; i++) {

            // first occurrence of 1
            // if 1 is found - start == true
            if (nums[i] == 1 && !start) {
                start = true;
            }

            // while element is 1 count it
            // maxCount is the maximum number of consecutive 1 found
            //if the element != 1 - it means that the consecutive 1 has ended
            // reset count and set start - false
            if (start && nums[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
                start = false;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums));


    }
}