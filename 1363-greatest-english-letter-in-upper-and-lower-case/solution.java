
class Solution {
    public String greatestLetter(String s) 
    {
        char ch='z';
        char CH='Z';
        for(int i=26;i>0;i--){
            if(s.indexOf(ch)!=-1 && s.indexOf(CH)!=-1){
                return ""+CH;
            }else{
                ch--;
                CH--;
            }        
        }
        return "";
    }
}
