class Solution {
    public String convert(String s, int numRows) {

        if(numRows==1){
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];
        int rowNo = 0;
        boolean increment = true;

        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }

        for(int i=0;i<s.length();i++){

            sb[rowNo].append(s.charAt(i));

            if(rowNo==numRows-1){
                increment=false;
            }

            if(rowNo==0){
                increment=true;
            }
            
            rowNo = increment?rowNo+1:rowNo-1;
        }

        StringBuilder result = new StringBuilder();

        for(int i=0;i<numRows;i++){
                result.append(sb[i]);
        }

        return result.toString();
    }
}