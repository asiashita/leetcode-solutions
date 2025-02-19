import java.util.*;
class Solution {
    public String getHappyString(int n, int k) {
        List<String> N= new ArrayList();
        Queue<String>q= new LinkedList();
        q.offer("a");
        q.offer("b");
        q.offer("c");

        while(!q.isEmpty()){
            String first=q.poll();
            if(first.length()==n){
                N.add(first);
                continue;
            }char lastChar=first.charAt(first.length()-1);
            if(lastChar=='a'){
                q.offer(first+"b");
                q.offer(first+"c");
            }else if(lastChar=='b'){
                q.offer(first+"a");
                q.offer(first+"c");
            }else{q.offer(first+"a");
                q.offer(first+"b");
                }if(N.size()>=k) break;
            


        }if(N.size()<k){
            return "";
        }return N.get(k-1);
    }
}
