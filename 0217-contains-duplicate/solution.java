class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs= new HashSet();
        for(int e:nums){
            hs.add(e);
        }return hs.size()<nums.length;
            
    }
}
