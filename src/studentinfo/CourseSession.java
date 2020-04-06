package studentinfo;

import java.util.*;

public class CourseSession {
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;
	
	CourseSession(String department, String number, Date startDate){
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}
	
	String getDepartment () {
		return department;
	}
	
	String getNumber() {
		return number;
	}

	int getNumberOfStudents() {
		return students.size();
	}
	
	void enroll(Student student) {
		students.add(student);
	}
	
	Student get(int index) {
		return students.get(index);
	}
	
	Date getEndDate() {
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);

		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday; 
		// int numberOfDays = 16 * 7 - 3;

		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
		
	}

	Date getStartDate() {
		return startDate;
	}
}
