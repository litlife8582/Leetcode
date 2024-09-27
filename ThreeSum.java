import java.util.*;
class ThreeSum {
    int nums[]=null;
    public int[] Accpet(int num){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        return nums;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> table=new ArrayList<>();
        List<List<Integer>> triplets=new ArrayList<>();
        int a,b,c;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        a=nums[i];
                        b=nums[j];
                        c=nums[k];
                        table.add(a);
                        table.add(b);
                        table.add(c);
                        if(!triplets.contains(table)){
                            triplets.add(Arrays.asList(a,b,c));
                        }
                    }
                }
            }
        }
    return triplets;
    }
}