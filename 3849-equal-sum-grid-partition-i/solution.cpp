class Solution {
public:
    bool canPartitionGrid(vector<vector<int>>& grid) {
        int m=grid.size();
        int n=grid[0].size();
        long long total=0;
        vector<long long>SumRow(m,0);
        vector<long long>SumCol(n,0);

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total+=grid[i][j];
                SumRow[i]+=grid[i][j];
                SumCol[j]+=grid[i][j];
                
            }
        }

        //horizontal split
        long long upper=0;
        for(int i=0;i<m-1;i++){
            upper+=SumRow[i];
            if(upper==total-upper){
                return true;
            }
        }
        //vertical split
        long long left=0;
        for(int i=0;i<n-1;i++){
            left+=SumCol[i];
            if(left==total-left){
                return true;
            }
        }return false;
    }
};
