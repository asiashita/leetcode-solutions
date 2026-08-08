class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int maxL = 0;

        int fruit1 = -1;
        int fruit2 = -1;

        int count1 = 0;
        int count2 = 0;

        for (int right = 0; right < fruits.length; right++) {

            if (fruits[right] == fruit1) {
                count1++;
            }
            else if (fruits[right] == fruit2) {
                count2++;
            }
            else {
                // Third fruit type
                while (count1 > 0 && count2 > 0) {

                    if (fruits[left] == fruit1) {
                        count1--;
                    } 
                    else {
                        count2--;
                    }

                    left++;
                }

                // Replace the fruit type whose count became 0
                if (count1 == 0) {
                    fruit1 = fruits[right];
                    count1 = 1;
                } 
                else {
                    fruit2 = fruits[right];
                    count2 = 1;
                }
            }

            maxL = Math.max(maxL, right - left + 1);
        }

        return maxL;
    }
}
