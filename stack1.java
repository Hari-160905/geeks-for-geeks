class Solution {
    public int maxDepth(String s) {
        // Stack<Character> st=new Stack<>();
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(') {
                // st.push('(');
                count++;
            }
           if(s.charAt(i)==')') {
                // st.pop();
                count--;
                // if(st.isEmpty()) count=0;
            }
            if(count> max) max=count;
        }
        return max;
    }
}
