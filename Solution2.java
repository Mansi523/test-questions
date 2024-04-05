
public class Solution2  {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 6, 6, 7};
        int target = 2;
        int firstOccurrenceIndex = findFirstOccurrence(arr, target);
        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of " + target + " is at index " + firstOccurrenceIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
