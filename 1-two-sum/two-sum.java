class Solution {
    public int[] twoSum(int[] nums, int target) {
        Scanner sc=new Scanner(System.in);
        int[] farr=new int[2];
    
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i==j)
                {
                    continue;
                }
                if(nums[i]+nums[j]==target)
                {
                    flag++;
                    farr[0]=i;
                    farr[1]=j;
                    break;
                }
            }
        }
        if(flag==0)
            {
                System.out.println("Not found");
            }
        return farr;
    }
}
