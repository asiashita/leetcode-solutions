class Solution {
public:
    int M=1e9+7;
    int t[201][201][2];

    int solve(int oneLeft,int zeroLeft, bool last1, int limit){
        if(oneLeft ==0 && zeroLeft ==0){
            return 1;
        }
        if(t[oneLeft][zeroLeft][last1]!=-1){
            return t[oneLeft][zeroLeft][last1];
        }
        int result=0;
        if(last1==true){
            for(int i=1;i<=min(zeroLeft,limit);i++){
                result=(result+ solve(oneLeft,zeroLeft-i,false,limit))%M;
            }
        }else{
            for(int i=1;i<=min(oneLeft,limit);i++){
                result=(result+ solve(oneLeft-i,zeroLeft,true,limit))%M;
        }
    }return t[oneLeft][zeroLeft][last1]=result;
    }
    int numberOfStableArrays(int zero, int one, int limit) {
        memset(t,-1,sizeof(t));
        int start1=solve(one, zero,false,limit);
        int start0=solve(one, zero,true,limit);

        return (start1+start0)%M;
        
    }
};
