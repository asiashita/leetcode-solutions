class Solution {
    public boolean Check(int sq,int currentSum,int num){
        if(sq==0){
            return num==currentSum;
        }return Check(sq/10,sq%10+currentSum,num)||
        Check(sq/100,sq%100+currentSum,num)||
        Check(sq/1000,sq%1000+currentSum,num)||
        Check(sq/10000,sq%10000+currentSum,num);
    }


    public int punishmentNumber(int n) {
        int result=0;
        for(int num=1;num<=n;num++){
            int sq=num*num;
            if (Check(sq,0,num)){
                result+=sq;
            }
        }return result;
    }
}
