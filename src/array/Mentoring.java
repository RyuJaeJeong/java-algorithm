package array;

import java.util.*;

public class Mentoring {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        int [][] arr = new int[M][N+1];
        for (int i = 0; i < M; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Mentoring mentoring = new Mentoring();
        int available = mentoring.solution2(N, M, arr);
        System.out.println(available);
    }

    /**
     * 학생 등수배열을 받아 멘토 조합을 반환
     * [input]
     * 4, 3
     * 3 4 1 2
     * 4 3 2 1
     * 3 1 4 2
     *
     * [output]
     * 3
     * @param N 학생 수
     * @param M 시험 횟수
     * @param arr 등수배열
     * @return 가능한 멘토 조합
     */
    public int solution(int N, int M, int[][] arr){
        HashMap<Integer, int[]> metoringCase = new HashMap<>();
        for (int i = 1; i < N; i++) {
            int[] temp = Arrays.copyOfRange(arr[0], i+1, N+1);
            metoringCase.put(arr[0][i], temp);
        }

        for (int i = 1; i < M; i++) {
            for (int j = 1; j <= N; j++) {
                int[] metoringAvailable = metoringCase.getOrDefault(arr[i][j], null);
                if(metoringAvailable == null) continue;
                int[] metoringNotAvailable = Arrays.copyOfRange(arr[i], 1, j);
                if(metoringNotAvailable != null && 0 < metoringNotAvailable.length){
                    for (int k = 0; k < metoringNotAvailable.length; k++) {
                        int notAvailable = metoringNotAvailable[k];
                        for (int l = 0; l < metoringAvailable.length; l++) {
                            if(metoringAvailable[l] == notAvailable) metoringAvailable[l] = 0;
                        }
                    }
                }
            }
        }

        Set<Integer> integers = metoringCase.keySet();
        int answer = 0;
        for (Integer mentor : integers) {
            int[] mentee = metoringCase.getOrDefault(mentor, null);
            if(mentee != null){
                for (int i : mentee) {
                    if(i != 0) answer++;
                }
            }
        }

        return answer;
    }

    /**
     * 강사 풀의
     */
    public int solution2(int N, int M, int[][] arr){
        int answer = 0;
        for (int i = 1; i <= N; i++) {          //가능한 조합 1 ~ N번 학생 '이'
            for (int j = 1; j <= N; j++) {      //가능한 조합 1 ~ N번 학생 '과'
                if(i == j) continue;
                int cnt = 0;
                for (int k = 0; k < M; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 1; l < N+1; l++) {
                        if(arr[k][l] == i) pi = l;
                        if(arr[k][l] == j) pj = l;
                    }
                    if(pi < pj) cnt ++;
                }
                if(cnt == M) answer++;
            }
        }
        return answer;
    }

}
