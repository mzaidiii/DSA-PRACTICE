class Solution {
    public int evalRPN(String[] tokens) {
        Stack < Integer > stack = new Stack<>();
        for (int i =0 ; i < tokens.length ; i++){
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")|| tokens[i].equals("/")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push( calculate(temp1,temp2,tokens[i]));
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek() ;
    }

    public static int calculate(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num2 - num1;
            case "*" -> num1 * num2;
            case "/" -> num2 / num1;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }
}