class Solution {
    
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        if (n==1)return nums[0];
        int p1=nums[0];
        int p2=0;
        for(int i=1;i<n;i++){
            int pick=nums[i];if(i>1)pick+=p2;
            int notpick=0+p1;
            int curri=Math.max(pick,notpick);
            p2=p1;
            p1=curri;
        }return p1;


    }
    
}
