
public class Student extends User {
	String lastSchool;

	public Student(int id, String firstName, String lastName, String email, String username, String password,
			String lastSchool) {
		super(id, firstName, lastName, email, username, password);
		this.lastSchool = lastSchool;
	}

	public String getLastSchool() {
		return lastSchool;
	}

	public void setLastSchool(String lastSchool) {
		this.lastSchool = lastSchool;
	}
	
	
	
	
}
