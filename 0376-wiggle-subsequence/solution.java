class Solution {

    private int[][][] dp;

    public int wiggleMaxLength(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }

        int n = nums.length;
         dp = new int[n][n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }


        int increasing = solve(nums, 1, 0, 0);

        int decreasing = solve(nums, 1, 0, 1);

       return 1 + Math.max(increasing, decreasing);
    }


    private int solve(int[] nums, int index, int prevIndex, int direction) {

       
        if (index == nums.length) {
            return 0;
        }
        if (dp[index][prevIndex][direction] != -1) {
            return dp[index][prevIndex][direction];
        }


        int take = 0;

        if (direction == 0 &&
            nums[index] > nums[prevIndex]) {

            take = 1 + solve(
                nums,
                index + 1,
                index,
                1
            );
        }

        if (direction == 1 &&
            nums[index] < nums[prevIndex]) {


            take = 1 + solve(
                nums,
                index + 1,
                index,
                0
            );
        }



        int skip = solve(
            nums,
            index + 1,
            prevIndex,
            direction
        );



        int answer = Math.max(take, skip);

        dp[index][prevIndex][direction] = answer;

        return answer;
    }
}
