class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n1=grid.length;
        int n2=grid[0].length;
        int n=k%(n1*n2);
        int[] grid1=new int[n1*n2];
        for(int i=0;i<n1;i++) 
        {
            for(int j=0;j<n2;j++) {
                int num=((i*n2)+(n+j))%grid1.length;
              grid1[num]= grid[i][j];
            }
        }
        List<List<Integer>> num1=new ArrayList<>();
        int x=0;
        for(int i=0;i<n1;i++) {
            List<Integer> num2=new ArrayList<>();
            for(int j=0;j<n2;j++) {
             num2.add(grid1[x]);
             x++;
            }
            num1.add(num2);
        }
        return num1;
    }
}
