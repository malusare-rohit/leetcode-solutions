class Solution {
    public int firstStableIndex(int[] nums, int k) {

        Stack<Integer> stack = new Stack<>();
        stack.push(nums[nums.length-1]);

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<=stack.peek()){
                stack.push(nums[i]);
            }
        }

        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length && !stack.isEmpty();i++){
            max=Math.max(max,nums[i]);
            if(max-stack.peek()<=k){
                return i;
            }
            if(nums[i]==stack.peek()){
                stack.pop();
            }
        }

        return -1;
    }
}