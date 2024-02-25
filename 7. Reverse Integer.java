class Solution {
    public int reverse(int x) {

        final int min = -2147483648;
        final int max = 2147483647;

        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            
            if (rev > max/10 || (rev == max/10 && digit > 7)) {
                return 0;
            }
            if (rev < min/10 || (rev == min/10 && digit < -8)) {
                return 0;
            }

            rev =  rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }
}
