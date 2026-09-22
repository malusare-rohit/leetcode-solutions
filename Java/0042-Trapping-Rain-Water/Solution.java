class Solution {
    public int trap(int[] height) {

        int[] prefMax = new int[height.length];
        int[] suffMax = new int[height.length];
        int max = 0;
        int result=0;

        for(int i=0;i<height.length;i++){
            max = Math.max(max, height[i]);
            prefMax[i]=max; 
        }

        max=0;
        
        for(int i=height.length-1;i>=0;i--){
            max = Math.max(max, height[i]);
            suffMax[i]=max; 
        }

        for(int i=0;i<height.length;i++){
            result+=Math.min(prefMax[i], suffMax[i])-height[i];
        }

        return result;
    }
}