class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int right=0;
        int sum=0;
        int count=0;
        
        while(right<arr.length){
            sum+=arr[right];
            
            if(right-left+1==k){
                int avg=sum/k;
                if(avg>=threshold){
                    count++;
                }
                 sum -= arr[left];
                left++;
            }
            
            right++;
        }return count;
    }
}
