class Solution {
    public int commonFactors(int a, int b) {
        if (a <= 1 && b <= 1) { return 1; }
        int count = 0;
        int size = Math.min(a, b);
        for (int i=1; i<=size; i++) {
            if (a%i == 0  && b%i == 0) {
                count++;
            }
        }
        return count;
    }
}