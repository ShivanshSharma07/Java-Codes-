class Solution {
    String removeVowels(String s) {
         StringBuilder a = new StringBuilder();
         
        // code herei <>=
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
             if(c != 'e'&& c != 'i'&& c != 'a'&&c != 'u'&&c != 'o'){
                 a.append(c);
             }
            
        }
        return a.toString();
    }
}