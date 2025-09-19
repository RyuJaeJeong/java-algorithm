package stack;

import java.util.Scanner;
import java.util.Stack;

public class OnlyOutsideParentheses {

    public static void main(String[] args) {
        OnlyOutsideParentheses outsideParentheses = new OnlyOutsideParentheses();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = outsideParentheses.solution2(str);
        System.out.println(result);
    }

    public String solution(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == '(') stack.push(ch);
            else if(ch == ')') stack.pop();
            else{
                if(stack.isEmpty()) sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String solution2(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == ')') while(stack.pop() != '(');
            else stack.push(ch);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }

}
