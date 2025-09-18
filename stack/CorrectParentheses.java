package stack;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        CorrectParentheses correctParentheses = new CorrectParentheses();
        boolean isCorrect = correctParentheses.solution(str);
        System.out.println(isCorrect?"YES":"NO");
    }

    public boolean solution(String str){
        Stack<Character> stack = new Stack();
        boolean result = true;
        for(char ch: str.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                if (stack.isEmpty()) {
                    result = false;
                    break;
                }
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) result = false;
        return result;
    }
}
