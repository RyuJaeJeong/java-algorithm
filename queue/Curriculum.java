package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mustLearned = sc.nextLine();
        String list = sc.nextLine();
        Curriculum cur = new Curriculum();
        System.out.println(cur.solution(mustLearned, list));
    }

    /**
     * list에 mustLearned 에있는 과목 순서대로 들었는지 체크해서 YES/NO 판단
     * @param mustLearned
     * @param list
     * @return YES/NO
     */
    public String solution(String mustLearned, String list){
        Queue<Character> queue = new LinkedList<>();
        String result = "";
        for(char course: list.toCharArray()){
            if(mustLearned.contains(course+"")){
                result += course + "";
            }
        }
        return result.equals(mustLearned)?"YES":"NO";
    }
}
