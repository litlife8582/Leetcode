class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int length=m+n;
        int arr[]=new int[length];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];
        }
        for(int i=0;i<length;i++) {
            for (int j = 0; j < length- i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        double median;
        if(length==0){
            median=arr[0];
        }
        else if(length==1){
            median=arr[0];
        }
        else if(length%2==0){
            int median1=length/2;
            int median2=(length/2)-1;
            median=(arr[median1]+arr[median2])/2.0;
            if(median<0) median=0;
        }
        else{
            median=Math.ceil(arr[(length/2)]);
        }
        return median;
    }
}
