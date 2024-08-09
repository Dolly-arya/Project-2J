package com.studentManagementSystem;

import java.util.List;

public class Student {
	 private int studentId;
	    private String studentName;
	    private List<course> courses;

	    public Student(int studentId, String studentName, List<course> courses) {
	        this.studentId = studentId;
	        this.studentName = studentName;
	        this.courses = courses;
	    }

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public List<course> getCourses() {
			return courses;
		}

		public void setCourses(List<course> courses) {
			this.courses = courses;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courses=" + courses + "]";
		}
	    
	    

}
