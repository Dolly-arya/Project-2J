package com.studentManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentDB {
	private static Map<Integer, Student> studentMap = new HashMap<>();

    public static void addStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
    }

    public static void updateStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
    }

    public static Student getStudentById(int studentId) {
        return studentMap.get(studentId);
    }

    public static Map<Integer, Student> getAllStudents() {
        return studentMap;
    }

    public static void deleteStudent(int studentId) {
        studentMap.remove(studentId);
    }

}
