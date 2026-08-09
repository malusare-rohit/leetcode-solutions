class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueRange=0;
        for(int i=1;i<nums.length;i++){
            if(nums[uniqueRange]!=nums[i]){
                uniqueRange++;
                nums[uniqueRange]=nums[i];
            }
        }
        return uniqueRange+1;
    }
}