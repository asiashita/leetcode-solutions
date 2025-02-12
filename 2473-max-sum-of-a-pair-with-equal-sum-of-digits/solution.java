class Solution {
    public int getSum(int nums){
        int sum=0;
        while(nums>0){
            sum+=nums%10;
            nums/=10;
        }
        return sum;
    } 

     public int maximumSum(int[] nums) {
        int n = nums.length;
        int result = -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int digitSum = getSum(nums[i]);
            
            if (map.containsKey(digitSum)) {
                result = Math.max(result, nums[i] + map.get(digitSum));
            }
            
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), nums[i]));
        }
        
        return result;
    }
}
