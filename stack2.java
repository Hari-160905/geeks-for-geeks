class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++) {
           if(operations[i].equals("C")) { 
            s.pop();
        } else if(operations[i].equals("+"))  {
            int n=s.pop();
            int n1=n+s.peek();
            s.push(n);
            s.push(n1);
        }  else if(operations[i].equals("D"))  {
              s.push(2*s.peek());
        } else {
            s.push(Integer.valueOf(operations[i]));
        }
        }
           int sum=0;
           while(!s.isEmpty()) {
            sum=sum+s.pop();
           }
        return sum;
    }
}
