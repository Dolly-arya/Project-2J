package com.studentManagementSystem;

public class course {
	 private String courseName;

	    public course(String courseName) {
	        this.courseName = courseName;
	    }

	    // Getters and Setters
	    public String getCourseName() {
	        return courseName;
	    }

	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }

	    @Override
	    public String toString() {
	        return courseName;
	    }

}
