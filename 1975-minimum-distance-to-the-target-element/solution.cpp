class Solution {
public:
    int getMinDistance(vector<int>& nums, int target, int start) {
        int x=0;
        int mini=INT_MAX;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target){
                x=(abs(i-start));
                mini=min(mini,x);
                
            }
        }return mini;
    }
};
