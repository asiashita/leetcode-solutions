class Solution {
public:
    bool isPalindrome(int x) {
        int temp=x;
        long long rev=0;
        while(x>0){
            int l=x%10;
            x=x/10;
            rev=rev*10+l;
        }
        if(temp==rev)return true;
        else return false;
    }
};
