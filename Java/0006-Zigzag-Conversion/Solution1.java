class Solution {
    public String convert(String s, int numRows) {

        if(numRows==1){
            return s;
        }

        Map<Integer, StringBuilder> map = new HashMap<>();
        int rowNo = 1;
        int l = s.length();
        boolean increment = true;

        for(int i=0;i<l;i++){
            if(map.containsKey(rowNo)){
                map.put(rowNo, map.get(rowNo).append(s.charAt(i)));
            }else{
                map.put(rowNo, new StringBuilder());
                map.put(rowNo, map.get(rowNo).append(s.charAt(i)));
            }

            if(rowNo==numRows){
                increment=false;
            }

            if(rowNo==1){
                increment=true;
            }
            
            rowNo = increment?rowNo+1:rowNo-1;
        }

        StringBuilder result = new StringBuilder();

        for(int i=1;i<=numRows;i++){
            if(map.get(i)!=null){
                result.append(map.get(i));
            }  
        }

        return result.toString();
    }
}