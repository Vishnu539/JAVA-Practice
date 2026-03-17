package dsa_theory.src.sorting;

public class MergeSortDemo {
    public static void main(String[] args) {
        // In Merge Sort, we sort the elements using Divide and Conquer approach.
        // Just like Quick Sort, which divides an array using Pivot element, Merge Sort divides an array based on the median or middle index value.
        // The array is recursively divided until it no longer can be divided.
        // Finally, all the individual elements (already sorted since there is only one value in every sub-array) are merged together to get the final sorted array.
        // Time complexity - O(n log n)

        int[] nums = {3,9,-8,-1,0,5};
        System.out.println("Before sorting: ");
        for(int num : nums) System.out.print(num + " ");
        System.out.println();

        mergeSortHelper(nums, 0, nums.length - 1);

        System.out.println("After sorting (Merge Sort): ");
        for(int num : nums) System.out.print(num + " ");
    }

    private static void mergeSortHelper(int[] nums, int left, int right) {
        // This method helps divided the array based on the mid index value.

        if(left < right){
            int mid = (left + right) / 2;

            mergeSortHelper(nums, left, mid);
            mergeSortHelper(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right){
        // The merging will be done using two arrays.
        // Two pointers i and j are used to compare elements in both the arrays.
        // Another pointer k is used to place the sorted element in its correct position in the main array.

        int n1 = mid + 1 - left;
        int n2 = right - mid;

        int[] lNums = new int[n1];
        int[] rNums = new int[n2];

        for(int i = 0; i < n1; i++) lNums[i] = nums[left + i];
        for(int i = 0; i < n2; i++) rNums[i] = nums[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2){
            if(lNums[i] < rNums[j]){
                nums[k] = lNums[i];
                i++;
            } else{
                nums[k] = rNums[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            nums[k] = lNums[i];
            i++;
            k++;
        }

        while(j < n2){
            nums[k] = rNums[j];
            j++;
            k++;
        }

    }
}
