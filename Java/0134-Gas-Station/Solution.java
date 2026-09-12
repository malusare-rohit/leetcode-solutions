class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        for(int i=0;i<gas.length;i++){

            if(gas[i]==cost[i]){
                if(gas.length==1){
                    return 0;
                }
                continue;
            }

            int totalGas = gas[i];
            int idx = i;
            
            while(totalGas>=cost[idx]){

                totalGas -= cost[idx];
                idx++;

                if(idx==gas.length){
                    idx=0;
                }

                totalGas += gas[idx];

                if(idx==i){
                    return idx;
                }
            }
        }
        return -1;
    }
}