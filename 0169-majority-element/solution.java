
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        
        
            for(int num:nums){
                mp.put(num, mp.getOrDefault(num, 0) + 1);
                int majorityCount = nums.length / 2;
                for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                    if (entry.getValue() > majorityCount) {
                    return entry.getKey();
            }
                }
            }
        return 0;
    }
}
