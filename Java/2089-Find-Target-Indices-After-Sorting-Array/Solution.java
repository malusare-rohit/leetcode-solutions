class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int prev = 0;
        int cnt = 0;
        List<Integer> list = new ArrayList<>();

        for(int n : nums){
            if(n<target){
                prev++;
            }
            if(n==target){
                cnt++;
            }
        }

        while(cnt>0){
            list.add(prev);
            prev++;
            cnt--;
        }

        return list;
    }
}