package com.sachin.lab.program.program1;

import java.util.Scanner;

public class Student {
    private final String usn, name, branch, phone;

    Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("USN: %s NAME: %s BRANCH: %s PHONE: %s", usn, name, branch, phone);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter details of Student %d:", i + 1);
            String usn = scanner.next();
            String name = scanner.next();
            String branch = scanner.next();
            String phone = scanner.next();
            students[i] = new Student(usn, name, branch, phone);
        }

        System.out.println("------------Student Details------------");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
