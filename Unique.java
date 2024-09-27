import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int[] Accept(int num){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public int removeDuplicates(int[] nums) {
        int[] expectedNums=Arrays.stream(nums).distinct().toArray();
        return nums.length;
    }
    public int[] Expected(int[] nums) {
        int[] result=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            boolean isUnique=true;
            for(int j=i;j<nums.length;j++){
                if(result[j]==nums[i]){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                result[index++]=nums[i];
            }
        } 
        return result;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int num=sc.nextInt();
        int[] nums=s.Accept(num);
        int k=s.removeDuplicates(nums);
        int[] expectedNums=s.Expected(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(expectedNums));
    }
}
