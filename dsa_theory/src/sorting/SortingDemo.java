package dsa_theory.src.sorting;

public class SortingDemo {
    public static void main(String[] args) {
        int[] nums = {6,5,2,8,9,4};
        for(int num : nums) System.out.print(num + " ");
        System.out.println();

        bubbleSort(nums);
        System.out.println("Bubble Sort:");
        for(int num : nums) System.out.print(num + " ");
        System.out.println();

        selectionSort(nums);
        System.out.println("Selection Sort:");
        for(int num : nums) System.out.print(num + " ");
        System.out.println();

        insertionSort(nums);
        System.out.println("Insertion Sort:");
        for(int num : nums) System.out.print(num + " ");
        System.out.println();
    }

    static void bubbleSort(int[] nums){
        // simplest implementation but takes the worst time complexity
        // compares and swaps elements multiple times until all the elements in the array are sorted
        // time complexity - O(n^2)
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    static void selectionSort(int[] nums){
        // A slightly better version of Bubble Sort
        // Instead of swapping elements in the inner loop (like in Bubble Sort), here we swap them in the outer loop
        // The time complexity is still the same, O(n^2), but the swapping logic a slightly efficient
        // Approach - we select either the smallest or the largest element in the array, and place it in its appropriate position
        // The entire array will be divided into parts - sorted section and unsorted section
        // In the next iteration, the second smallest or the second largest will be selected and swapped with the corresponding elements
        // This process repeats until all the elements in the array are sorted

        int n = nums.length;
        int minIdx = -1;

        for(int i = 0; i < n - 1; i++){
            minIdx = i;

            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[minIdx]) minIdx = j;
            }

            swap(nums, minIdx, i);
        }

    }

    static void insertionSort(int[] nums){
        // A much better sorting technique than Bubble Sort and Selection Sort
        // Does not implement swapping, rather it "inserts" elements into their appropriate positions
        // Time complexity - O(n^2)

        int n = nums.length;

        for(int i = 1; i < n; i++){
            int temp = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > temp){
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = temp;
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
