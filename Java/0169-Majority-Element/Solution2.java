class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement=nums[0];
        int cnt=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==majorityElement){
                cnt++;
                continue;
            }

            cnt--;

            if(cnt==0){
                majorityElement=nums[i];
                cnt=1;
            }
        }

        return majorityElement;
    }
}