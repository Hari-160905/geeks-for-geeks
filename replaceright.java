class Solution {
    public int[] replaceElements(int[] arr) {
      int arr1[]=new int[arr.length];
      int i=0;
      while(i<arr.length-1) {
        int max=Integer.MIN_VALUE;
        for(int j=i+1;j<arr.length;j++) {
         if(arr[j]>max) max=arr[j];
        }
        arr1[i]=max;
        i++;
      }       
      arr1[i]=-1;
      return arr1;
    }
}
