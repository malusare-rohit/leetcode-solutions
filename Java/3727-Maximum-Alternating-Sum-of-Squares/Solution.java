class Solution {
    public long maxAlternatingSum(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i] = -1*nums[i];
            }
        }

        Arrays.sort(nums);
        long result=0;
        int i=0;
        int j=nums.length-1;
        boolean toggle = true;


        while(i<=j){
            if(toggle){
                result+=nums[j]*nums[j];
                j--;
            }else{
                result-=nums[i]*nums[i];
                i++;
            }

            toggle = toggle?false:true;
        }

        return result;
    }
}