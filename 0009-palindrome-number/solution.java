class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(x>0){
           int l=x%10;
            x=x/10;
            rev=rev*10+l;
        }
        if(rev==temp)return true;
        else{
            return false;
        }
        


    }
}
