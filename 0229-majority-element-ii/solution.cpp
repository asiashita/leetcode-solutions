class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int n=nums.size();
        vector<int>a;
        unordered_map<int,int>mpp;
        //count occurence of each element
        for(int num:nums){
            mpp[num]++;
        }
        //iterate through the map
        for(auto& pair: mpp){
            if(pair.second>floor(n/3.0)){
                a.push_back(pair.first);
            }
        }return a;
    }
};
