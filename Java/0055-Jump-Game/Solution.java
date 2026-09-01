class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
            if(i+nums[i]>maxReach){
                maxReach=i+nums[i];
            }

            if(nums[i]==0 && maxReach==i){
                break;
            }
            if(maxReach>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}