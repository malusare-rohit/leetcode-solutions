class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int multiple=k;;multiple+=k){
            boolean found=false;

            for(int n : nums){
                if(n==multiple){
                    found=true;
                    break;
                }
            }

            if(!found){
                return multiple;
            }
            found=false;
        }
    }
}