class Solution {
public:
    int minAddToMakeValid(string s) {
        int open_paren_needed=0;
        int stack_size=0;
        for(char &ch:s){
            if(ch=='('){
                stack_size++;
            }else if(stack_size>0){
                stack_size--;
            }else{
                open_paren_needed++;
            }
        }return open_paren_needed+stack_size;

    }
};
