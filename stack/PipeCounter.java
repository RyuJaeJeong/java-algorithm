package stack;

import java.util.Scanner;
import java.util.Stack;

public class PipeCounter {


    public static void main(String[] args) {
        PipeCounter counter = new PipeCounter();
        String expression = new Scanner(System.in).nextLine();
        int answer = counter.solution(expression);
        System.out.println(answer);
    }

    public int solution(String expression){
        int answer = 0;
        char LEFT = '(';
        char[] temp = new char[expression.length()];
        int idx = 0;
        Stack<Character> stack = new Stack<>();
        for(char ch: expression.toCharArray()){
            if(ch == LEFT){
                temp[idx] = ch;
                stack.push(ch);
            }else{
                stack.pop();
                if(temp[idx-1]==LEFT){
                    answer += stack.size();
                }else{
                    answer += 1;
                }
            }
            idx++;
        }
        return answer;
    }
}
