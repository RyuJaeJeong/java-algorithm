package string;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        Password password = new Password();
        password.solution(i, line);
    }

    /**
     * 암호 풀기
     * @param i 4
     * @param line #****###**#####**#####**##**
     * @return cool
     */
    public void solution(int i, String line){
        String[] arr = new String[i];
        int index = 0;
        for (int j = 0; j < line.length(); j++) {
            if(j % 7 == 6) arr[index++] = line.substring(j-6, j+1);
        }
        for(String str: arr){
            String binStr = str.replaceAll("#", "1").replaceAll("[*]", "0");
            int bin = Integer.parseInt(binStr, 2);
            System.out.print((char) bin);
        }
        System.out.println();
    }
}
