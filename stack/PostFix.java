package stack;

import java.util.Scanner;
import java.util.Stack;

public class PostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostFix postFix = new PostFix();
        String expression = sc.nextLine();
        System.out.println(postFix.cal(expression));

    }

    /**
     * 후위식 연산을 수행 하여 값을 출력함.
     * 후위식 연산? 32+ > 3 + 2
     * 324+* > 3 * (2 + 4)
     * @param expression 식
     * @return 계산값
     */
    public int cal(String expression){
        Stack<Integer> stack = new Stack<>();
        for(char ch: expression.toCharArray()){
            if(ch == '+'){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1+num2);
            }else if(ch == '-'){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2-num1);
            }else if(ch == '*'){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1*num2);
            }else if(ch == '/'){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2/num1);
            }else{
                stack.push(Integer.parseInt(ch + ""));
            }
        }
        return stack.pop();
    }

    public int cal2(String expression){
        Stack<Integer> stack = new Stack<>();
        for(char ch: expression.toCharArray()){
            if(Character.isDigit(ch)) stack.push(ch - 48);
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(ch == '+') stack.push(lt+rt);
                else if(ch == '-') stack.push(lt-rt);
                else if(ch == '*') stack.push(lt*rt);
                else if(ch == '/') stack.push(lt/rt);
            }

        }
        return stack.pop();
    }
}
