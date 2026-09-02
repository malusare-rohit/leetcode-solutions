class Solution {
    public int jump(int[] nums) {
        int maxReach = nums[0];
        int jumpCnt = 1;
        int maxN = 0;
        int len = nums.length;

        if(len==1){
            return 0;
        }

        for(int i=0;i<len && maxReach<=len;i++){
            if(i>maxReach){
                jumpCnt++;
                maxReach=maxN;
                maxN=0;
            }
            maxN=Math.max(maxN, i+nums[i]);
        }

        return jumpCnt;
    }
}
