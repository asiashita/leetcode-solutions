class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
        int n=s.length();
        vector<int> DA(n,0);

        for(auto &query:shifts){
            int start=query[0];
            int end=query[1];
            int dir=query[2];
            int x;
            if(dir==0)
                x=-1;
            else{
                x=1;

            }
            DA[start]+=x;
            if(end+1<n){
                DA[end+1]-=x;
            }
        }
        for(int i=1;i<n;i++){
            DA[i]+=DA[i-1];
        }
        for(int i=0;i<n;i++){
            int shift=DA[i]%26;
            if(shift<0){
                shift+=26;
            }
            s[i]=(((s[i]-'a')+shift)%26)+'a';

        }
        return s;
    }
};
