class Solution {

    public int longestStrChain(String[] words) {
        int n=words.length;
        Arrays.sort(words, (a,b)-> a.length()-b.length()); // sort the array according to the length side
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int ans=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(isPred(words[j],words[i])){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    ans=Math.max(ans,dp[i]);
                }
            }
        }
        return ans;
    }
        public boolean isPred(String prev, String curr){
            int N=prev.length();
            int M=curr.length();
            if(N>=M || M-N!=1)return false;
            int i=0;int j=0;
            while(i<N && j<M){
                if(prev.charAt(i)==curr.charAt(j)){
                    i++;

                }j++;
            }return i==N;
        }
        
    
}
