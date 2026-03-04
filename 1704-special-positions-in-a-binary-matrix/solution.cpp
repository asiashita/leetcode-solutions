class Solution {
public:
    int numSpecial(vector<vector<int>>& mat) {
        int m=mat.size();
        int n=mat[0].size();
        vector<int>ro(m,0);
        vector<int>col(n,0);
        for(int row=0;row<m;row++){
            for(int column=0;column<n;column++){
                if(mat[row][column]==1){
                    ro[row]++;
                    col[column]++;
                }
            }
        }int result=0;
         for(int row=0;row<m;row++){
            for(int column=0;column<n;column++){
                if(mat[row][column]==1){
                    if(ro[row]==1 && col[column]==1){result++;}
                }
            }
        }return result;

    }

};
