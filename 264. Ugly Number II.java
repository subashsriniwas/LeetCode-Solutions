class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        
        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(ugly[p2] * 2, Math.min(ugly[p3] * 3, ugly[p5] * 5));
            ugly[i] = nextUgly;
            
            if (nextUgly == ugly[p2] * 2) p2++;
            if (nextUgly == ugly[p3] * 3) p3++;
            if (nextUgly == ugly[p5] * 5) p5++;
        }
        return ugly[n - 1];
    }
}
