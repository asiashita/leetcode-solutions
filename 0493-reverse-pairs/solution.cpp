class Solution {
public:
    
    void merge(vector<int>& num,int low,int mid,int high){
        vector<int>temp;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(num[left]<=num[right]){
                temp.push_back(num[left]);
                left++;
            }else{
                temp.push_back(num[right]);
                right++;
            }
        }while(left<=mid){
            temp.push_back(num[left]);
            left++;
        }
        while(right<=high){
            temp.push_back(num[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            num[i]=temp[i-low];
        }

    }//
    int countPair(vector<int> &num, int low, int mid, int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && num[i]>(long long)2*num[right]){
                right++;
            }count+=right-(mid+1);
        }return count;
    }
    int mergeSort(vector<int> & num, int low,int high){
        int count=0;
        if(low>=high)return count;
        int mid=(low+high)/2;
        count+=mergeSort(num,low,mid);
        count+=mergeSort(num,mid+1,high);
        count+=countPair(num,low,mid,high);
        merge(num,low,mid,high);
        return count;

    }
    int reversePairs(vector<int>& nums) {
        return mergeSort(nums,0,nums.size()-1);
        //return count;

        
    }
};
