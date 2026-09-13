class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int unique = 0;

        for(int n : nums){
            if(map.containsKey(n)){
                map.remove(n);
            }else{
                map.put(n,1);
            }
        }


        return map.keySet().iterator().next();
}
}