package com.javalab.RRRRRR;

public class StudentScore {
    public static void main(String[] args) {
            String[] names = {"김정민", "조수만", "백금열"};
            int[] korean = {82, 74, 90};
            int[] english = {90, 88, 85};
            int[] math = {70, 83, 94};


            double[] averages = new double[names.length];
            for (int i = 0; i < names.length; i++) {
                averages[i] = (korean[i] + english[i] + math[i]) / 3.0;
            }


            System.out.println("학생들의 성적");
            for (int i = 0; i < names.length; i++) {
                System.out.printf("%s: 국어 %d, 영어 %d, 수학 %d, 평균 %.2f\n",
                        names[i], korean[i], english[i], math[i], averages[i]);
            }
        }
    }
