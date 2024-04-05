
public class Solution5{
    public static double findMedian(int[] nums) {
        int length = nums.length;
        
        if (length == 0) {
            return 0; // Return 0 for an empty array (can be adjusted based on requirements)
        }
        
        if (length % 2 == 0) {
            // Array has even number of elements, return the average of two middle elements
            int mid1 = nums[length / 2 - 1];
            int mid2 = nums[length / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            // Array has odd number of elements, return the middle element
            return nums[length / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Median: " + findMedian(nums));
    }
}
