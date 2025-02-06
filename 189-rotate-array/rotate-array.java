class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int finalarr[] = new int[length];
        
        for (int i = 0; i < length; i++) {
            int newIndex = (i + k) % length;  // Calculate the correct new index after rotation
            finalarr[newIndex] = nums[i];
        }

        for (int i = 0; i < length; i++) {
            nums[i] = finalarr[i];
        }
    }
}
