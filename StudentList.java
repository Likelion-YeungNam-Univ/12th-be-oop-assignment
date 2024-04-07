import java.util.ArrayList;

public class StudentList {
    private int studentsNum;
    private ArrayList<Student> studentList = new ArrayList<Student>();

    // 학생 등록
    public void addStudent(Student st) {
        studentList.add(st);
        studentsNum++;
        System.out.println("학생 추가 완료");
    }

    // 학생 삭제
    public void deleteStudent(String stId, String nm) {
        int resultByInfo = searchByInfo(stId, nm, -1);
        if (resultByInfo != -1) {
            Student temp = studentList.get(resultByInfo);
            System.out.println("-----------------------------------");
            temp.printStudent();
            System.out.println("-----------------------------------");
            System.out.println("위의 정보를 삭제합니다.");
            studentList.remove(temp);
            studentsNum--;
            System.out.println("[학번: " + stId + ", 이름: " + nm + "] 학생에 대한 정보 삭제 완료");
        } else {
            System.out.println("잘못된 정보가 입력되었습니다.");
        }
    }

    // 학생 전체 수 Getter
    public int getStudentsNum() {
        return studentsNum;
    }

    // 학생 객체 Getter
    public Student getStudent(String stId, String nm) {
        // index 값을 받음
        int resultByStId = searchByStId(stId, -1);
        int resultByInfo = searchByInfo(stId, nm, -1);
        // searchByName을 사용할 경우 동명이인으로 인해 마지막 학생의 index가 반환되므로 학번과 함께 검색함.

        // 두 return 값이 -1이 아니면서 같은 값일 경우 반환
        if ((resultByStId != -1 && resultByInfo != -1) && (resultByStId == resultByInfo)) {
            return studentList.get(resultByInfo);
        } else if (resultByStId == -1 && resultByInfo != -1) {
            System.out.println("해당 학번의 학생이 존재하지 않습니다. 학번을 확인해주세요.");
            return null;
        } else if (resultByStId != -1 && resultByInfo == -1) {
            System.out.println("해당 이름의 학생이 존재하지 않습니다. 이름을 확인해주세요.");
            return null;
        } else {
            System.out.println("입력한 학번, 이름에 해당하는 학생이 존재하지 않습니다. 다시 확인해주세요.");
            return null;
        }
    }

    // 학번을 통한 학생 검색, option = -1 or 0 (-1은 정보 출력 x, 0은 정보 출력 o)
    public int searchByStId(String stId, int option) {
        int index = -1;
//        System.out.println("학생을 검색합니다. (학번: " + stId + ")");
        for (int i = 0; i < studentsNum; i++) {
            // 조건이 일치하는 경우 해당 학생의 정보를 출력
            if (studentList.get(i).getStudentId().equals(stId)) {
                if (option != -1) {
                    System.out.println("학번과 일치하는 학생이 검색되었습니다.");
                    studentList.get(i).printStudent(); // 해당 학생의 정보 출력
                }
                index = i;
                break; // 학번의 경우 모든 학생마다 다르기 때문에 중복 고려 X -> 정보를 출력 후 반복문 탈출
            }
        }

        // 해당 학번의 학생이 없는 경우
        if (index == -1) {
            System.out.println("학번과 일치하는 학생이 없습니다. 제대로 입력했는지 확인해주세요.");
        }
        return index;
    }

    // 이름을 통한 검색, option = -1 or 0 (-1은 정보 출력 x, 0은 정보 출력 o)
    public int searchByName(String nm, int option) {
        int index = -1;
//        System.out.println("학생을 검색합니다. (이름: " + nm + ")");
        for (int i = 0; i < studentsNum; i++) {
            // 조건이 일치하는 경우 해당 학생의 정보를 출력
            if (studentList.get(i).getName().equals(nm)) {
                if (option != -1) {
                    System.out.println("이름과 일치하는 학생이 검색되었습니다.");
                    studentList.get(i).printStudent(); // 해당 학생의 정보 출력
                }
                index = i;
                // 동명이인이 존재할 수 있으므로 계속해서 검색 진행
            }
        }

        // 해당 이름의 학생이 없는 경우
        if (index == -1) {
            System.out.println("이름과 일치하는 학생이 없습니다. 제대로 입력했는지 확인해주세요.");
        }
        return index;
    }

    // 학번과 이름을 통한 검색, option = -1 or 0 (-1은 정보 출력 x, 0은 정보 출력 o)
    public int searchByInfo(String stId, String nm, int option) {
        int index = -1;
//        System.out.println("학생을 검색합니다. (학번: " + stId + ")");
        for (int i = 0; i < studentsNum; i++) {
            // 조건이 일치하는 경우 해당 학생의 정보를 출력
            if (studentList.get(i).getStudentId().equals(stId) && studentList.get(i).getName().equals(nm)) {
                if (option != -1) {
                    System.out.println("학번과 일치하는 학생이 검색되었습니다.");
                    studentList.get(i).printStudent(); // 해당 학생의 정보 출력
                }
                index = i;
                break; // 학번의 경우 모든 학생마다 다르기 때문에 중복 고려 X -> 정보를 출력 후 반복문 탈출
            }
        }

        // 학생이 없는 경우
        if (index == -1) {
            System.out.println("학번, 이름과 일치하는 학생이 없습니다. 제대로 입력했는지 확인해주세요.");
        }
        return index;
    }

    // 학생 전체 조회
    public void searchAllStudents() {
        System.out.println("학생 전체 조회를 시작합니다.");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < studentsNum; i++) {
            studentList.get(i).printStudent();
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("학생 전체 조회가 완료되었습니다.");
    }

    // 학생 정보 수정 - 학번을 입력한 경우만 가능
    public void updateStudent(String stId, String nm, String newName, int newKor, int newEng, int newMath) {
        int resultByInfo = searchByInfo(stId, nm, -1);
        Student temp = studentList.get(resultByInfo);

        System.out.println("학생의 정보를 수정합니다. (성적의 경우 -1로 입력된 것은 변경되지 않음)");
        System.out.println("변경 전 이름: " + temp.getName() + " / 변경 후 이름: " + newName);
        System.out.println("변경 전 국어 성적: " + temp.getKorScore() + " / 변경 후 국어 성적: " + newKor);
        System.out.println("변경 전 영어 성적: " + temp.getEngScore() + " / 변경 후 영어 성적: " + newEng);
        System.out.println("변경 전 수학 성적: " + temp.getMathScore() + " / 변경 후 수학 성적: " + newMath);

        if (resultByInfo != -1) {
            if (!nm.equals(newName)) { // 이름이 바뀐 경우 이름 변경
                temp.setName(newName);
            }
            // 성적 변경이 필요없는 경우 -1을 입력받고 기존의 값을 그대로 사용.
            if (newKor == -1) newKor = temp.getKorScore();
            if (newEng == -1) newEng = temp.getEngScore();
            if (newMath == -1) newMath = temp.getMathScore();

            temp.setSubjectScore(newKor, newEng, newMath);
            System.out.println("학생 정보 수정이 완료되었습니다.");
            temp.printStudent();
        }
    }

    public void getStatistics() {
        int sumKor = 0, sumEng = 0, sumMath = 0;
        double avgKor = 0.0, avgEng = 0.0, avgMath = 0.0, sumAvg = 0.0, totalAvg = 0.0;

        for (int i = 0; i < studentsNum; i++) {
            Student temp = studentList.get(i);
            sumKor += temp.getKorScore();
            sumEng += temp.getEngScore();
            sumMath += temp.getMathScore();
            sumAvg += temp.getAverage();
        }
        avgKor = (double) sumKor / studentsNum;
        avgEng = (double) sumEng / studentsNum;
        avgMath = (double) sumMath / studentsNum;
        totalAvg = sumAvg / studentsNum; // studentsList의 국, 영, 수 합계 평균

        System.out.println("총 인원: " + studentsNum + "명");
        System.out.println("국어 평균: " + String.format("%.2f", avgKor) + "점");
        System.out.println("영어 평균: " + String.format("%.2f", avgEng) + "점");
        System.out.println("수학 평균: " + String.format("%.2f", avgMath) + "점");
        System.out.println("학생들의 평균 점수: " + String.format("%.2f", totalAvg) + "점");
    }
}
