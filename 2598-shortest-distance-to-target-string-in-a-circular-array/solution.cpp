class Solution {
public:
    int closestTarget(vector<string>& words, string target, int startIndex) {
        int mini=INT_MAX;
        int n=words.size();

       for(int i=0;i<words.size();i++){
        if(words[i]==target){
            int dist=abs(i-startIndex);
            int cirDist=min(dist,n-dist);
            mini=min(mini,cirDist);
            

        }
       }return (mini==INT_MAX)?-1:mini;
    }
};
