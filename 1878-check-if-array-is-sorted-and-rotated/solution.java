class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int countb=0;
        for(int i=0;i<n;i++){
            //sorted array is already provided
            if (nums[i]>nums[(i+1)%n]){
                countb++;
            }
        }return countb<=1;
    }
}

