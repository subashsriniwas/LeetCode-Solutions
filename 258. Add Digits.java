class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;                    // 8;  11;  2
            while (num > 0) {
                sum += num % 10;      // 8;   11;   2
                num /= 10;              // 3;   0
            }
            num = sum;                  //2
        }
        return num;                 //2
    }
}
