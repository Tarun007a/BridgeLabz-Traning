package com.constructor.level1;

public class CourseManagement {
	private String courseName;
	private int duration;
	private int fee;
	private static String instituteName = "Institute of Science";
	
	public CourseManagement(String courseName, int duration, int fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	public void displayCourseDetails() {
		System.out.println(courseName + " " + duration + " " + fee);
	}
	
	public void updateInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	
	public static void main(String[] args) {
		CourseManagement course = new CourseManagement("b.tech", 4, 1000000);
		course.displayCourseDetails();
		course.updateInstituteName("New institute name");
	}

}
