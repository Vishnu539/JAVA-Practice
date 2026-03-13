public class SearchingDemo {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50};
        for(int num : nums) System.out.print(num + " ");
        int target = 40;
        System.out.println();

        int linear = linearSearchDemo(nums, target); // takes O(n) time
        int binary = binarySearchDemo(nums, target); // takes O(log n) time

        System.out.println(linear);
        System.out.println(binary);
    }

    static int linearSearchDemo(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return i;
        }

        return -1;
    }

    static int binarySearchDemo(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}