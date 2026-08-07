class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Add current character
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Too many distinct characters
            while (map.size() > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                // If count becomes 0, remove it
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            // Current window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
