package queue;

import java.util.*;

class Patient implements Comparable<Patient> {
    private int position;
    private int point;

    public Patient(int position, int point) {
        this.position = position;
        this.point = point;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


    @Override
    public int compareTo(Patient o) {
        int point1 = o.getPoint();
        if(getPoint() > point1) return 1;
        else if (getPoint() == point1) return 0;
        else return -1;
    }
}

public class EmergencyRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmergencyRoom emergencyRoom = new EmergencyRoom();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Patient[] patientArr = new Patient[N];
        for (int i = 0; i < N; i++) {
            patientArr[i] = new Patient(i, scanner.nextInt());
        }
        int order = emergencyRoom.getOrder(M, patientArr);
        System.out.println(order);
    }

    /**
     * 환자의 진찰 순서를 반환합니다.
     * @param M 순서를 반환할 환자
     * @param patientArr 환자 목록
     * @return M이 진찰 받을 순서(0 부터 시작)
     */
    public int getOrder(int M, Patient[] patientArr){
        int result = 0;
        Patient targetPatient = patientArr[M];
        Queue<Patient> queue = new LinkedList<>();
        for(Patient patient: patientArr){
            queue.add(patient);
        }

        while(!queue.isEmpty()){
            Patient polled = queue.poll();
            boolean hasMoreRisky = false;
            for(Patient temp: queue){
                if(polled.getPoint() < temp.getPoint()){
                    hasMoreRisky = true;
                    break;
                }
            }
            if(hasMoreRisky){
                queue.add(polled);
            }else{
                result++;
                if(polled.getPoint() == patientArr[M].getPoint() && polled.getPosition() == M) break;
            }
        }

        return result;
    }
}