package dsa_theory.src.sorting;

public class QuickSortDemo {
    public static void main(String[] args) {
        // Quick Sort works on Divide and Conquer rule.
        // The array is divided (logically) into multiple sub-arrays (divide) and then combined at last to get the desired result (conquer).
        // Each sub-array is then treated as a separate array and performs the sorting.
        // A Pivot element is used for sorting. The pivot can be any element from the array (there may be slight logic changes based on what the pivot element is).
        // The sorting logic is that all the elements to the left of the pivot must be smaller than the pivot and all elements to the right of the pivot must be larger than the pivot.
        // A quickSortHelper method is used to divide the array into sub-arrays based on the pivot element.
        // The partition method is where the actual sorting logic runs.
        // Time complexity - O(n log n).

        int[] nums = {3,9,-8,-1,0,5};
        System.out.println("Before sorting: ");
        for(int num : nums) System.out.print(num + " ");
        System.out.println();

        quickSortHelper(nums, 0, nums.length - 1);

        System.out.println("After sorting (Quick Sort): ");
        for(int num : nums) System.out.print(num + " ");
    }

    public static void quickSortHelper(int[] nums, int low, int high){
        // After initializing the pivot the new sub-arrays will be:
        // 1. Elements from 0 to pivot - 1 and
        // 2. Elements from pivot + 1 to high (last element).
        // This divide process will continue till low is less than high.
        // low is the first element and high is the last element of the array.

        if(low < high){
            int pivot = partition(nums, low, high);

            quickSortHelper(nums, 0, pivot - 1);
            quickSortHelper(nums, pivot + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high){
        // For any element j in the array less than the pivot element, we will increment i and swap i and j.
        // After the entire loop is completed, we will swap the pivot with the element at i + 1.
        // Now the pivot element is exactly where it should be.
        // Finally, we return i + 1, which is the pivot element's index.

        int pivot = nums[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(nums[j] < pivot){
                i++;
                swap(nums, i , j);
            }
        }

        swap(nums, i + 1, high);
        return i + 1;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
