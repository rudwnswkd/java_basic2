package com.javalab.RRRRRR;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("김정민", new int[]{82, 90, 70});
        Student student2 = new Student("조수만", new int[]{74, 88, 83});
        Student student3 = new Student("백금열", new int[]{90, 85, 94});

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            System.out.println("학생 이름: " + student.getName());
            System.out.println("국어: " + student.getScores()[0]);
            System.out.println("영어: " + student.getScores()[1]);
            System.out.println("수학: " + student.getScores()[2]);
            System.out.printf("과목별 평균 점수: %.2f" , student.calculateAverage());
            System.out.println();
        }
    }
}