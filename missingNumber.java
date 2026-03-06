class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long sum=(long)n*(n+1)/2;
        int act=0;
        for(int i=0;i<arr.length;i++) {
            act=act+arr[i];
        }
        int num=(int) (sum-act);
        return num;
    }
}
