class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null|| strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String start=strs[0];
        String last=strs[strs.length-1];
        int mini=Math.min(start.length(),last.length());
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < mini; i++) {
            if (start.charAt(i) == last.charAt(i)) {
                prefix.append(start.charAt(i));
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}
