class Solution {
    public String maskPII(String s) {
                s = s.toLowerCase();
            
        
        if (s.contains("@")){
        int x=s.indexOf("@");//8
        char first=s.charAt(0);
        char last=s.charAt(x-1);
        String masked= first+ "*****"+ last+ s.substring(x);
        return masked;
        }
        
        else{
            StringBuilder digit=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    digit.append(s.charAt(i));//"1234567890"
                }
            }
            int n=digit.length();//n=10
            String lastFour= digit.substring(n-4);//"7890"
            int country= n-10;//0
            if(country==0) return "***"+"-"+"***"+"-"+lastFour;
            else if(country==1) return "+*"+"-"+"***"+"-"+"***"+"-"+lastFour;
           else  if(country==2) return "+**"+"-"+"***"+"-"+"***"+"-"+lastFour;
            else return "+***"+"-"+"***"+"-"+"***"+"-"+lastFour;
            
        }
    }
}
