package student;

// alt + shift + s (source) => generate getters... constructor
// ctr + shift + f => format code

public class Person implements Trackable {
	private String firstName, lastName, school;
	private static  int authorizedAbsence = 10;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getAuthorizedAbsence() {
		return authorizedAbsence;
	}

	public void setAuthorizedAbsence(int authorizedAbsence) {
		this.authorizedAbsence = authorizedAbsence;
	}

	public Person(String firstName, String lastName, String school, int authorizedAbsence) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.school = school;
		this.authorizedAbsence = authorizedAbsence;
	}

	public int trackSituation() {
		return 0;
	}

	public void display() {

	}
}
