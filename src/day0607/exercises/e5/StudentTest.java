package day0607.exercises.e5;

import day0607.exercises.e4.MyArrays;

public class StudentTest {
    public static void main(String[] args) {
        // 20
        Student[] students = new Student[20];
        for (int i = 1; i <= 20; i++) {
            Student student = new Student();
            student.number = i;
            student.state = (int)(Math.random() * 6 + 1);
            student.score = (int)(Math.random() * 101);

            students[i-1] = student;
        }

        // 问题一
        for (Student student : students) {
            if (student.state == 3) {
                System.out.println(student);
            }
        }

        System.out.println("=== === ===");

        // 问题二
        //MyArrays.sort(students);
    }
}
