class Solution {
    public int[] largestSubarray(int[] nums, int k) {
        int start=0;
        for(int i=0;i<nums.length-k+1;i++){
            if(nums[i]>nums[start]){
                start=i;
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]= nums[i+start];
        }return res;
    }
}
