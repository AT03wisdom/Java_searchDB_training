package searchIntArray;

import java.util.Arrays;

public class BinarySearch {
    // 二分探索法-1
    public static void binarySearchIntIndex(int searchingNum, int[] nums) {
        int[] cuttableNums = nums;
        boolean hasValue = false;
        while (cuttableNums.length > 0) {
            int halfIndex = cuttableNums.length/2;
            if (cuttableNums[halfIndex] == searchingNum) {
                hasValue = true;
                break;
            } else if (cuttableNums[halfIndex] < searchingNum) {
                cuttableNums = Arrays.copyOfRange(cuttableNums, halfIndex, cuttableNums.length);
            } else {
                cuttableNums = Arrays.copyOfRange(cuttableNums, 0, halfIndex);
            }
            // System.out.println(Arrays.toString(cuttableNums)); // 配列カット経過観察用
        }
        if (hasValue) {
            System.out.printf("Your Int Array has a value %d.\n", searchingNum);
        } else {
            System.out.printf("Your Int Array does not have a value %d.\n", searchingNum);
        }
    }

    // 二分探索法-2
    // GPT said - O(logn)
    public static void binarySearchIntLowerBound(int minimumInput, int[] nums) {
        Arrays.sort(nums); // Ensure the array is sorted
        int low = 0;
        int high = nums.length - 1;
        int minimumContaining = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= minimumInput) {
                minimumContaining = nums[mid];
                high = mid - 1; // Look for a smaller valid number
            } else {
                low = mid + 1;
            }
        }

        if (minimumContaining != -1) {
            System.out.printf(
                "Your Int Array has a value %d, which is the lowest value over %d.\n",
                minimumContaining, minimumInput
            );
        } else {
            System.out.printf(
                "Your Int Array does not have a value which is the lowest value over %d. Returned %d.\n",
                minimumInput, minimumContaining
            );
        }
    }

    /* // My - deprecated 
    // slicing overheadが生じる - O(nlogn)

    // 二分探索法（指定の番号minimumInput以上の、配列に含まれる最低の数）
    public static void binarySearchIntLowerBound(int minimumInput, int[] nums) {
        int[] cuttableNums = nums;
        int minimumContaining = -1; // 負の数ははあり得ない
        while (cuttableNums.length > 0) {
            int halfIndex = cuttableNums.length/2;
            if (cuttableNums.length == 1) {
                if (cuttableNums[0]>minimumInput) minimumContaining = cuttableNums[0];
                break;
            } else if (cuttableNums[halfIndex-1] == minimumInput) {
                minimumContaining = minimumInput;
                break;
            } else if (cuttableNums[halfIndex-1] < minimumInput) {
                cuttableNums = Arrays.copyOfRange(cuttableNums, halfIndex, cuttableNums.length);
            } else {
                cuttableNums = Arrays.copyOfRange(cuttableNums, 0, halfIndex);
            }
            System.out.println(Arrays.toString(cuttableNums)); // 配列カット経過観察用
        }
        if (minimumInput<=minimumContaining) {
            System.out.printf("Your Int Array has a value %d, which is the lowest value over %d.\n", minimumContaining, minimumInput);
        } else {
            System.out.printf("Your Int Array does not have a value which is the lowest value over %d. Returned %d.\n", minimumInput, minimumContaining);
        }
    }

    */
}
