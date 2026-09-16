class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int sum = 0;
        
        candies[0]=1;

        for(int i=1;i<ratings.length;i++){
            candies[i]=1;
            if(ratings[i-1]==ratings[i]){
                continue;
            }

            if(ratings[i-1]<ratings[i]){
                candies[i] = candies[i-1]+1;
            }
        }

        for(int i=ratings.length-2;i>=0;i--){

            if(ratings[i]==ratings[i+1]){
                continue;
            }

            if(ratings[i]>ratings[i+1]){
                if(candies[i]<=candies[i+1]){
                    candies[i] = candies[i+1]+1;
                }
            }
        }

        for(int n : candies){
            sum+=n;
        }

        return sum;
    }
}