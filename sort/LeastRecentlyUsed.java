package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LeastRecentlyUsed {

    public static void main(String[] args) throws IOException {
        LeastRecentlyUsed lru = new LeastRecentlyUsed();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int S = Integer.parseInt(temp[0]);
        int N = Integer.parseInt(temp[1]);
        String taskList = br.readLine();
        lru.solution2(S, N, taskList);
    }

    /**
     * 마지막 작업 후, 캐시 메모리의 상태를 가장 최근에 사용된 작업 부터 차례로 출력합니다.
     * @param S 캐시의 크기
     * @param N 작업의 개수 
     * @param taskList 작업 목록 " " 로 구분됨
     */
    public void solution(int S, int N, String taskList){
        StringTokenizer st = new StringTokenizer(taskList);
        Map<String, Integer> taskMap = new HashMap<>();
        List<String> cacheMemory = new ArrayList<>();
        while(st.hasMoreTokens()){
            String task = st.nextToken();
            if(isHit(task, taskMap)){
                int idx = getIndex(task, cacheMemory);
                cacheMemory.remove(idx);
                cacheMemory.add(0, task);
            }else{
                cacheMemory.add(0, task);
            }
        }

        for (int i = 0; i < S; i++) {
            System.out.print(cacheMemory.get(i));
            if(i != S-1){
                System.out.print(" ");
            }
        }
    }

    public boolean isHit(String task, Map<String, Integer> taskMap){
        int cnt = taskMap.getOrDefault(task, 0);
        if(cnt == 0){
            taskMap.put(task, 1);
        }
        return (cnt == 0)?false:true;
    }

    public int getIndex(String task, List<String> cacheMemory){
        int idx = 0;
        for (int i = 0; i < cacheMemory.size(); i++) {
            if(cacheMemory.get(i).equals(task)){
                idx = i;
            }
        }
        return idx;
    }

    public int getIndex(String task, String[] cacheMemory){
        int idx = 0;
        for (int i = 0; i < cacheMemory.length; i++) {
            if(cacheMemory[i].equals(task)){
                idx = i;
                break;
            }
        }
        return idx;
    }

    public void solution2(int S, int N, String taskList){
        StringTokenizer st = new StringTokenizer(taskList);
        Map<String, Integer> taskMap = new HashMap<>();
        String[] cacheMemory = new String[S];
        while(st.hasMoreTokens()){
            String task = st.nextToken();
            boolean isHit = isHit(task, taskMap);
            if(isHit){
                int idx = getIndex(task, cacheMemory);
                for (int i = idx; i > 0; i--) {
                    cacheMemory[i] = cacheMemory[i-1];
                }
            }else{
                for (int i = S-1; i > 0; i--) {
                    cacheMemory[i] = cacheMemory[i-1];
                }
            }
            cacheMemory[0] = task;
        }

        for(String task: cacheMemory){
            System.out.printf("%s ", task);
        }

    }

}
