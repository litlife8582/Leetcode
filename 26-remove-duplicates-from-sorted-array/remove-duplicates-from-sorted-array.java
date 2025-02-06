public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // No elements to process
        }

        int k = 1; // Pointer for the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the last unique element
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Place it at the next unique position
                k++; // Increment the unique count
            }
        }

        return k; // Return the number of unique elements
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + k1 + ", nums: " + Arrays.toString(Arrays.copyOf(nums1, k1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output: " + k2 + ", nums: " + Arrays.toString(Arrays.copyOf(nums2, k2)));
    }
}
