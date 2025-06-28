class Solution {
public:
    int rob(vector<int>& nums) {
        vector<int>temp1,temp2;
        if(nums.size()==1)return nums[0];
        for(int i=0;i<nums.size();i++){
            if(i!=0)temp1.push_back(nums[i]);
            if(i!=nums.size()-1)temp2.push_back(nums[i]);
        }return max(RobOld(temp1),RobOld(temp2));
    }
    int RobOld(vector<int>& num){
        int n=num.size();
        int p1=0;
        int p2=0;
        for(int i=0;i<n;i++){
            int temp=p1;
            p1=max(p1,p2+num[i]);
            p2=temp;
        }return p1;
    }
};
