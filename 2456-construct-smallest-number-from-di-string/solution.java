import java.util.Stack;
class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        Stack<Integer> st= new Stack();
        StringBuilder result= new StringBuilder();

        for(int i=1;i<=n+1;i++){
            st.push(i);
            if(i==n+1||pattern.charAt(i-1)=='I'){
                while(!st.isEmpty()){
                result.append(st.pop());}
            }

        }return result.toString();


    }
}
