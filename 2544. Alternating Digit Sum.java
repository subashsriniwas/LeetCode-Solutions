class Solution {
    public int alternateDigitSum(int n) {

        String num = Integer.toString(n);

        int result = 0;

        for (int i=0; i<num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            if (i%2 == 0) { result += digit; } 
            else { result += -digit; }
        }

        return result;
    }
}