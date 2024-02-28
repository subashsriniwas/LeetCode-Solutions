import java.util.Stack;

class Solution {
    public int calculate(String s) {

        if (s == null || s.length() == 0) { return 0; }

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int sign = 1; 
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } 
            else if (c == '+') {
                result += num * sign;
                num = 0;
                sign = 1;
            } 
            else if (c == '-') {
                result += num * sign;
                num = 0;
                sign = -1;
            } 
            else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }
            else if (c == ')') {
                result += num * sign;
                num = 0;
                result *= stack.pop(); 
                result += stack.pop(); 
            }
        }
        result += num * sign; 
        return result;
    }
}
