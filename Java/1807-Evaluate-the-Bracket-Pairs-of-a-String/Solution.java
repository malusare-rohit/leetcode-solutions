class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        for(int i=0; i<s.length();i++){
            String key = "";
            if(s.charAt(i) == '('){
                i++;
                while(s.charAt(i)!=')'){
                    key+=s.charAt(i);
                    i++;
                }
                if(map.get(key)!=null){
                    sb.append(map.get(key));
                }else{
                    sb.append("?");
                }
                
                continue;
            }

            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}