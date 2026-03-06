class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        HashSet<Integer> num=new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            num.add(arr[i]);
        }
       ArrayList<Integer> arr1=new ArrayList<>();
        for(int n:num) {
            arr1.add(n);
        }
        Collections.sort(arr1);
        if(arr1.size()>=2) {
            return arr1.get(arr1.size()-2);
        }
        return -1;
    }
}
