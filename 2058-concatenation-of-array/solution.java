class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        int res[]=new int[a.size()];
        for(int j=0;j<a.size();j++){
            res[j]=a.get(j);
        }

        return res;
    }
}
