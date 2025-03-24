import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문장_속_단어 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        문장_속_단어 wordCatcher = new 문장_속_단어();
        String solution = wordCatcher.anotherSolution(sentence);
        System.out.println(solution);
    }

    /**
     * most long length word return
     * @param sentence sentence length < 100 contain
     * @return
     */
    public String solution(String sentence){
        String returnWord = "";
        String[] words = sentence.split(" ");
        for(String word : words){
            if(word.length() > returnWord.length()){
                returnWord = word;
            }
        }
        return returnWord;
    }
    
    public String anotherSolution(String sentence){
        String returnWord = "";
        StringTokenizer st = new StringTokenizer(sentence, " ");
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            if(word.length() > returnWord.length()){
                returnWord = word;
            }
        }
        return returnWord;
    }

}
