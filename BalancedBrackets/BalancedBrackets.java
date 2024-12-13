package BalancedBrackets;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}";
            if( isBalanced(exp)){
                System.out.println(exp + "has Balnced Brackets");
            }else{
                System.out.println(exp + "has Balnced Brackets");
            }
    }

    public static boolean isBalanced(String exp){
        Stack<Character> stack = new Stack<>();
        for(char ch: exp.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '[' ) 
            {
                stack.push(ch); 
            } 
            else {
                if ( ! stack.empty() &&  (( stack.peek() == '(' && ch == ')') || ( stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch== ']')))
                {
                    stack.pop();
                }
                else {
                    return  false;
                }
            }
        }
        return stack.empty();
    } 

}
