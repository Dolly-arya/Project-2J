package com.studentManagementSystem;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

    
		  StudentDB.addStudent(new Student(1, "Aman", Arrays.asList(new course("PYTHON"), new course("MERN"))));
		  StudentDB.addStudent(new Student(2, "Shakuntala", Arrays.asList(new course("GK"), new course("DLDA"))));
		  StudentDB.addStudent(new Student(3, "Krishna", Arrays.asList(new course("JAVA"), new course("JS"))));

		  System.out.println(StudentDB.getStudentById(2));

		  StudentDB.updateStudent(new Student(2, "Shakuntala", Arrays.asList(new course("HTML"), new course("CSS"))));
		   System.out.println(StudentDB.getStudentById(2));

		   System.out.println(StudentDB.getAllStudents());

	
		   System.out.println(StudentUtil.searchStudentByName("Shakuntala"));

		   System.out.println(StudentUtil.getAllStudentsSorted());
		   
		  StudentDB.deleteStudent(3);
		   System.out.println(StudentDB.getAllStudents());
		   
		  System.out.println(StudentUtil.getAllStudentsSorted());
		    }


}
