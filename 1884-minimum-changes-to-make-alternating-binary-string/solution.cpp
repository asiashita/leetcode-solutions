class Solution {
public:
    int minOperations(string s) {
        int Start0=0;
        
        for(int i=0;i<s.size();i++){
            if(i%2==0){//even index
                if(s[i]=='1'){
                    Start0++;
                }
            }else{
                if(s[i]=='0'){
                    Start0++;
                }
            }
        }int Start1=s.size()-Start0;
        return min(Start0,Start1);
    }
};
