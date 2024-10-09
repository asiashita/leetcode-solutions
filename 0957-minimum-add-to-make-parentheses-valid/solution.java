class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,add=0;
        for(var ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                }else if(open==0){
                    add++;
                }
            }
        }return open+add ;
    }
}
