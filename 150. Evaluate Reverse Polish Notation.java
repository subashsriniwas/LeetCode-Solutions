class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<> ();

        for (String num : tokens) {
            if (num.equals("+")) {
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(b+a);
            }
            else if (num.equals("-")) {
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(b-a);
            }
            else if (num.equals("*")) {
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(b*a);
            }
            else if (num.equals("/")) {
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(b/a);
            }
            else {
                stack.push(Integer.parseInt(num));
            }
        }
        return stack.peek();
    } 
}