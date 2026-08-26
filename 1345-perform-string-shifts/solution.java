class Solution {
    public String stringShift(String s, int[][] shift) {
        int n=s.length();
        int netShift=0;
        for(int i=0;i<shift.length;i++){
            int dir=shift[i][0];
            int amt=shift[i][1];
            if(dir==0){
                netShift-=amt;
            }else{
                netShift+=amt;
            }
        }
        netShift=netShift%n;
        if(netShift<0) netShift+=n;
        String part1 = s.substring(n - netShift);
        String part2 = s.substring(0, n - netShift);

        return part1 + part2;

    }
}
