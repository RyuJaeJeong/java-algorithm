package hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ClassBoss {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String choosen = br.readLine();
        ClassBoss boss = new ClassBoss();
        System.out.println(boss.solution(N, choosen));
    }

    /**
     * 당선된 사람 반환
     * @param N 투표인수
     * @param choosen 투표결과
     * @return 당선된 사람
     */
    public char solution(int N, String choosen){
        Map<Character, Integer> choosenMap = new HashMap<>();
        for (char person: choosen.toCharArray()){
            choosenMap.put(person, choosenMap.getOrDefault(person, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char answer = ' ';
        for (char person: choosenMap.keySet()){
            int cnt = choosenMap.get(person);
            if(cnt > max){
                max = cnt;
                answer = person;
            }
        }
//        System.out.println(choosenMap.size());
//        System.out.println(choosenMap.remove('C'));
//        System.out.println(choosenMap.containsKey('F'));
        return answer;
    }
}
