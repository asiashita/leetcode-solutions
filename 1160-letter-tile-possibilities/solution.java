class Solution {
    
    private int findSeq(int[] freq){
        int ans=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                freq[i]--;
                ans+=1+findSeq(freq);
                freq[i]++;
            }
        }return ans;
    }

    public int numTilePossibilities(String tiles) {
        
        int[] freq=new int[26];
        for(char c: tiles.toCharArray()){
            freq[c-'A']++;
        }return findSeq(freq);
        
    }
}
