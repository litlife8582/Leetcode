class Solution {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        int finalNums[]=new int[length];
        int index=0;
        for(int i=0;i<length;i++){
            if(nums[i]!=val){
                finalNums[index]=nums[i];
                index++;
            }
            
        }
        for(int i=0;i<index;i++){
            nums[i]=finalNums[i];
        }
        return index;
    }
}