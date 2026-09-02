class Solution {
    public int jump(int[] nums) {
        int len = nums.length;

        if (len == 1) {
            return 0;
        }

        int maxReach = 0;
        int maxN = 0;
        int jumpCnt = 0;

        for (int i = 0; i < len - 1; i++) {
            maxN = Math.max(maxN, i + nums[i]);

            if (i == maxReach) {
                jumpCnt++;
                maxReach = maxN;
            }
        }

        return jumpCnt;
    }
}