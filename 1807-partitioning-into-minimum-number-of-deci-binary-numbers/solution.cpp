class Solution {
public:
    int minPartitions(string n) {
        int count=0;
        while(true){
            bool change=false;
            for(char &ch:n){
                if(ch!='0'){
                    ch--;//subtract ascii by 1 
                    change=true;
                }
            }
                if(!change)break;
                count++;

            
        }return count;
    }
};
