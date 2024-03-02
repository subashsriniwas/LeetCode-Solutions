class Solution {
    public String intToRoman(int num) {            //  58
        int[] integers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5 , 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();        // 

        for (int i=0; i<integers.length; i++) {             //
            while (num >= integers[i]) {                    //50, 8, 3, 2, 1
                sb.append(roman[i]);                    //sb = L V I I I 
                num -= integers[i];                 // num = 58-50=8; 3; 2; 1
            }
        }
        return sb.toString();
    }
}