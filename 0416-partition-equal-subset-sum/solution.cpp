class Solution {
public:
    bool SubsetSum(int n,int k,vector<int>& nums){
        //base case 
        //if (k < 0) return false;
        vector<vector<bool>> dp(n,vector<bool>(k+1,false));
        for(int i=0;i<n;i++){
            //if target=0 then for all index the result will be true
            dp[i][0]=true;
        }//if there exists only 1 element int the array
        if (nums[0] <= k)dp[0][nums[0]]=true;
        //main logic
        for (int index=1;index<n;index++){
            for(int target=1;target<=k;target++){
                bool notTake= dp[index-1][target];
                bool Take=false;
                if(target>=nums[index])Take=dp[index-1][target-nums[index]];
                dp[index][target]=Take|| notTake;
            }

        }return dp[n-1][k]; 
    }
    bool canPartition(vector<int>& nums) {

        //check for totalSum/2 %2 =0 true else false
        int TotalSum=0;
        for(int i=0;i<nums.size();i++)TotalSum+=nums[i];
        if(TotalSum%2!=0)return false;
        int target=TotalSum/2;
        return SubsetSum(nums.size(),target,nums);
    }
};
