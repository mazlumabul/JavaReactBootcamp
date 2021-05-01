
public class Instructor extends User {
	String course;

	public Instructor(int id, String firstName, String lastName, String email, String username, String password,
			String course) {
		super(id, firstName, lastName, email, username, password);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
	
	
	
}
