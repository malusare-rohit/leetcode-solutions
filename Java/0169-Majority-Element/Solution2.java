class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement=nums[0];
        int cnt=0;

        for(int i : nums){
            if(i == majorityElement){
                cnt++;
            }else{
                cnt--;
                if(cnt==0){
                majorityElement=i;
                cnt++;
                }
            } 
        }

        return majorityElement;
    }
}