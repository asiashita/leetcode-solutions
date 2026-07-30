class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int sqSum=0;
        while(n>0){
            int r=n%10;
             n=n/10;
            digitSum+=r;
            sqSum+=r*r;
        }if(sqSum-digitSum>=50)return true;
        else return false;
    }
}
