public class 할_일_목록 {

    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
    }

    public String[] solution(String[] todo_list, boolean[] finished) {
        int loopSize = todo_list.length;
        String answerStr = "";
        for(int i=0; i<loopSize; i++){
            boolean finishedDivi = finished[i];
            if(!finishedDivi) answerStr += todo_list[i] + ",";
        }

        String[] answer = answerStr.split(",");
        return answer;
    }
}
