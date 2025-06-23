package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        OnlyNumber onlyNumber = new OnlyNumber();
        String answer = onlyNumber.solution(line);
        System.out.println(Integer.parseInt(answer));
    }

    public String solution(String line){
        return line.replaceAll("[^0-9]", "");
    }

}
