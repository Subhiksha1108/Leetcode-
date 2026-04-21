class Solution {

    public int longestArithmetic(int[] nums) {

        int n = nums.length;
        int maxLength = 0;

        int startIndex = 0;
        int prevDiff = nums[1] - nums[0];

        for (int i = 1; i < n - 1; i++) {

            int currentDiff = nums[i + 1] - nums[i];

            if (currentDiff == prevDiff) {

                maxLength = Math.max(maxLength, i - startIndex + 2);

            } else {

                int originalValue = nums[i + 1];
                int j = i + 1;

                nums[j] = nums[i] + prevDiff;

                while (j < n && nums[j] - nums[j - 1] == prevDiff) {
                    maxLength = Math.max(maxLength, j - startIndex + 1);
                    j++;
                }

                nums[i + 1] = originalValue;

                startIndex = i;
                prevDiff = currentDiff;
            }
        }

        startIndex = n - 1;
        prevDiff = nums[n - 1] - nums[n - 2];

        for (int i = n - 2; i > 0; i--) {

            int currentDiff = nums[i] - nums[i - 1];

            if (currentDiff == prevDiff) {

                maxLength = Math.max(maxLength, startIndex - i + 2);

            } else {

                int originalValue = nums[i - 1];
                int j = i - 1;

                nums[j] = nums[i] - prevDiff;

                while (j >= 0 && nums[j + 1] - nums[j] == prevDiff) {
                    maxLength = Math.max(maxLength, startIndex - j + 1);
                    j--;
                }

                nums[i - 1] = originalValue;

                startIndex = i;
                prevDiff = currentDiff;
            }
        }

        return maxLength;
    }
}