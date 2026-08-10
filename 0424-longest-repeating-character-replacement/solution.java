class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxi = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            int length = right - left + 1;

            int replacements = length - maxFreq;

            while (replacements > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;

                length = right - left + 1;
                replacements = length - maxFreq;
            }

            maxi = Math.max(maxi, right - left + 1);
        }

        return maxi;
    }
}
