class Solution {
    public int trap(int[] height) {

        int[] minBar = new int[height.length];
        int max = 0;
        int result=0;

        for(int i=0;i<height.length;i++){
            max = Math.max(max, height[i]);
            minBar[i]=max; 
        }

        max=0;
        
        for(int i=height.length-1;i>=0;i--){
            max = Math.max(max, height[i]);
            minBar[i]=Math.min(max, minBar[i]); 
        }

        for(int i=0;i<height.length;i++){
            result += minBar[i]-height[i];
        }

        return result;
    }
}