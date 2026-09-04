class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int len = nums.length;
        int[] rightMin = new int[len];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=len-1;i>=0;i--){
            min=Math.min(min, nums[i]);
            rightMin[i]=min;
        }

        for(int i=0;i<=len-1;i++){
            max=Math.max(max,nums[i]);
            if(max-rightMin[i]<=k){
                return i;
            }
        }

        return -1;
    }
}