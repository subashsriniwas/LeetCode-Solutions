class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            char currentChar = s.charAt(left);

            while (left <= right && s.charAt(left) == currentChar) {
                left++;
            }
            while (left <= right && s.charAt(right) == currentChar) {
                right--;
            }
        }
        return Math.max((right-left) + 1, 0);
    }
}
