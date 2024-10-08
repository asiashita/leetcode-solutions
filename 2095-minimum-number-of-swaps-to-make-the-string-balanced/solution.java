class Solution {
    public int minSwaps(String s) {
        int open=0,unbalanced=0;
        for(var ch: s.toCharArray()){
            if(ch=='['){
                open++;
            }else{
                if(open>0){
                    open--;
                }else if(open==0){
                    unbalanced++;
                }
            }
        }return unbalanced/2 + unbalanced%2;
    }
}
