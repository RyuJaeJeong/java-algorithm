package stack;

import java.util.Scanner;
import java.util.Stack;

public class CraneGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CraneGame craneGame = new CraneGame();
        int length = sc.nextInt();
        int [][] grid = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        length = sc.nextInt();
        int [] moves = new int[length];
        for (int i = 0; i < length; i++) {
            moves[i] = sc.nextInt();
        }
        int size = craneGame.solution(moves, grid);
        System.out.println(size);
    }

    /**
     *
     * @param moves 인형움직이는 좌표
     * @param grid 격자형
     * @return
     */
    public int solution(int[] moves, int[][] grid){
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int position: moves){
            for (int i = 0; i < grid.length; i++) {
                int doll = grid[i][position-1];
                if(doll==0) continue;
                else{
                    if(!stack.isEmpty()){
                        if(stack.get(stack.size()-1) == doll){
                            stack.pop();
                            result+=2;
                        }else{
                            stack.push(doll);
                        }
                    }else{
                        stack.push(doll);
                    }
                    grid[i][position-1] = 0;
                    break;
                }
            }
        }
        return result;
    }
}
