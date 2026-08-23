import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int fqLimit = nums.length/2;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            if(map.get(nums[i])>fqLimit){
                    result=nums[i];
                    break;
            }
        }
        return result;
    }
}