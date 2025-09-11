class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum=0;int maxi=INT_MIN;//kadane's algo
        for(int i=0;i<nums.size();i++){
            if(sum<0)sum=0;
            sum+=nums[i];
            maxi=max(maxi,sum);
            
            
        }//if(maxi<0)return 0; for all negative integers in the array return 0(not mentioned in the question) 
        return maxi;
    }
};

