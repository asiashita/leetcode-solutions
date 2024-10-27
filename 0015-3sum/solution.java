class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*Set<List<Integer>> st = new HashSet<>();
        for(int p1=0;p1<nums.length;p1++){
            for(int p2=p1+1;p2<nums.length;p2++){
                for(int p3=p2+1;p3<nums.length;p3++){
                    if(nums[p1]+nums[p2]+nums[p3]==0){
                        List<Integer> temp = Arrays.asList(nums[p1], nums[p2], nums[p3]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }List<List<Integer>> ans = new ArrayList<>(st);
        return ans;*/
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        
        for(int p1=0;p1<nums.length;p1++){
            int p2=p1+1,p3=nums.length-1;
            if(p1>0 && nums[p1]==nums[p1-1])continue;
            while(p2<p3){
                int sum=nums[p1]+nums[p2]+nums[p3];
                if(sum<0){
                    p2++;
                    
                }
                else if(sum>0){
                    p3--;
                }else{
                    List<Integer> temp= Arrays.asList(nums[p1],nums[p2],nums[p3]);
                    ans.add(temp);
                    p2++;
                    p3--;
                    while (p2< p3 && nums[p2] == nums[p2 - 1]) p2++;
                    while (p2 < p3 && nums[p3] == nums[p3 + 1]) p3--;
                    
                }
            }
        }return ans;
    }
}
