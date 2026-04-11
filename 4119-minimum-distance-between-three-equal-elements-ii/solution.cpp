class Solution {
public:
    int minimumDistance(vector<int>& nums) {
        unordered_map<int,vector<int>>mpp;//{}
        int ans=INT_MAX;//ans=infi

        for(int i=0;i<nums.size();i++){
            mpp[nums[i]].push_back(i);//[1:{0,2,3},2{1}]
            if(mpp[nums[i]].size()>=3){
                int sz=mpp[nums[i]].size();//3
                int i1=mpp[nums[i]][sz-3];//[1][0]=0
                int i2=mpp[nums[i]][sz-2];//[1][1]=2
                int i3=mpp[nums[i]][sz-1];//[1][2]=3
                //j-i+k-j+k-i=2*(k-i)
                int dist=2*(i3-i1);//2*(3-0)=6
                ans=min(ans,dist);


            }

        }
        return (ans==INT_MAX)?-1:ans;
    }
};
