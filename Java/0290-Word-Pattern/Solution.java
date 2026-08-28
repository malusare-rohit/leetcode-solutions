class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.trim().split(" ");

        if(pattern.length()!=strArr.length){
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for(int i=0;i<strArr.length;i++){
            char ch = pattern.charAt(i);
            String word = strArr[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }else{
                if(usedWords.contains(word)){
                    return false;
                }
                    map.put(ch,word);
                    usedWords.add(word);
            }
        }

        return true;
    }
}