package com.javalab.RRRRRR;

public class StudentScore {
    public static void main(String[] args) {
            String[] names = {"김정민", "조수만", "백금열"};
            int[] korean = {82, 74, 90};
            int[] english = {90, 88, 85};
            int[] math = {70, 83, 94};

            // 각 학생의 세 과목 평균 계산
            double[] averages = new double[names.length];
            for (int i = 0; i < names.length; i++) {
                averages[i] = (korean[i] + english[i] + math[i]) / 3.0; // 실수형으로 나누기 위해 3.0 사용
            }

            // 학생들의 이름과 세 과목 평균 점수 출력
            System.out.println("학생들의 성적");
            for (int i = 0; i < names.length; i++) {
                System.out.printf("%s: 국어 %d, 영어 %d, 수학 %d, 평균 %.2f\n",
                        names[i], korean[i], english[i], math[i], averages[i]); // 평균을 실수형으로 출력하기 위해 %.2f 사용
            }
        }
    }
