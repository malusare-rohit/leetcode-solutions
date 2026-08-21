class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=0;
        int cnt=0;
        int num=nums[0];
        for(int i=0;i<nums.length;i++){
            if(num==nums[i]){
                cnt++;
            }
            if(num!=nums[i]){
                num=nums[i];
                cnt=1;
            }
            if(cnt>2){
                continue;
            }
            if(idx!=i){
                nums[idx]=nums[i];
            }
            idx++;
        }
        return idx;
    }
}