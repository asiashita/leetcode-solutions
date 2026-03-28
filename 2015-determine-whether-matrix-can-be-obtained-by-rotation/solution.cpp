class Solution {
public:
    void rotate(vector<vector<int>>&mat){
        //transpose
        for(int i=0;i<mat.size();i++){
            for(int j=i+1;j<mat.size();j++){
                swap(mat[i][j],mat[j][i]);
            }
        }for(int i=0;i<mat.size();i++){//reverse
            reverse(mat[i].begin(),mat[i].end());

        }

    }
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        for(int k=0;k<4;k++){
            if(mat==target)return true;
            rotate(mat);


        }return false;
    }
};
