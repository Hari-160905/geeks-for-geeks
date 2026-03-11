class Solution {
    public int appendCharacters(String s, String t) {
      int sind=0;
       int tind=0;
       while(sind<s.length() && tind<t.length()) {
        if(s.charAt(sind)==t.charAt(tind)) {
            tind++;
        }
        sind++;
       }
       return t.length()-tind;   
    }
}
