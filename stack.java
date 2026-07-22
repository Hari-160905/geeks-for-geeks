class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++) {
            q.add(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--) {
            s.push(sandwiches[i]);
        }
       
            int count=0;
            int size=q.size();
            while(!q.isEmpty() && count<size) {
                 if(count>=size) { 
             break;
              }
                int n=q.poll();
                if(n==s.peek()) {
                    s.pop();
                    count=0;
                } else {
                    q.add(n);
                    count++;
                }
            }
           
        return q.size();
    }
}
