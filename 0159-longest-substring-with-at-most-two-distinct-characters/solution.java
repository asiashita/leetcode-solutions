class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int left=0; int maxL=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            //put in the map
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>2){
                char chLeft=s.charAt(left);
                map.put(chLeft,map.get(chLeft)-1);
                if(map.get(chLeft)==0){
                    map.remove(chLeft);
                }left++;
            }
            maxL=Math.max(maxL,right-left+1);
        }return maxL;
    }
}
