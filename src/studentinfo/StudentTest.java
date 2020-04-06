package studentinfo;


import junit.framework.TestCase;

public class StudentTest extends TestCase {
	public void testCreate() {
		final String firstStudentName = "Jane Doe";
		Student firstStudent = new Student(firstStudentName);
		assertEquals(firstStudentName, firstStudent.getName());
		
		final String secondStudentName = "Joe Blow";
		Student secondStudent = new Student ("Joe Blow");
		assertEquals(secondStudentName, secondStudent.getName());
		
		assertEquals("Jane Doe", firstStudent.getName());
	}
}
