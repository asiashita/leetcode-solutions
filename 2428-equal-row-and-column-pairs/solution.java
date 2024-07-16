class Solution {
    public int equalPairs(int[][] grid) {
        int i,j,count=0;
        int n=grid.length;
        
        //comparision
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                boolean isEqual=true;
                for(int k=0;k<n;k++){
                    if(grid[i][k]!=grid[k][j]){
                        isEqual=false;
                        break;
                    }
                }if(isEqual){
                    count++;
                }
            }
        }
        return count;
        
    }
}
