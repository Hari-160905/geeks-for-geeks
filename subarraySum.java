class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> num=new ArrayList<>();
       int i = 0,sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            while (sum > target && i < j) {
                sum =sum - arr[i];
                i++;
            }
              if(sum==target) {
                 num.add(i+1);
                 num.add(j+1);
                 return num;
              }
        }
        num.add(-1);
        return num;
    }
}
