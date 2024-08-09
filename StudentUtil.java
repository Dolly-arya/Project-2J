package com.studentManagementSystem;

import java.util.List;
import java.util.stream.Collectors;

public class StudentUtil {
	public static Student searchStudentByName(String name) {
        return StudentDB.getAllStudents().values().stream()
                .filter(student -> student.getStudentName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public static List<Student> getAllStudentsSorted() {
        return StudentDB.getAllStudents().values().stream()
                .sorted((s1, s2) -> s1.getStudentName().compareToIgnoreCase(s2.getStudentName()))
                .collect(Collectors.toList());
    }

}
