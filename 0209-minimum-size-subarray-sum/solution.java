class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length=Integer.MAX_VALUE;int sum=0;int j=0;
        for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
                while(sum>=target){
                    
                    length=Math.min(length,i-j+1);
                    sum=sum-nums[j];
                    j++;
                    
                }
            }
        if(length==Integer.MAX_VALUE) return 0;
         return length;
    }
}
