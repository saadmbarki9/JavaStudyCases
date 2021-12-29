package student;

public class Professor extends Person {
	private int teachingHours, objectif;
	private String speciality;

	public int getTeachingHours() {
		return teachingHours;
	}

	public void setTeachingHours(int teachingHours) {
		this.teachingHours = teachingHours;
	}

	public int getObjectif() {
		return objectif;
	}

	public void setObjectif(int objectif) {
		this.objectif = objectif;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Professor(String firstName, String lastName, String school, int authorizedAbsence, int teachingHours,
			int objectif, String speciality) {
		super(firstName, lastName, school, authorizedAbsence);
		this.teachingHours = teachingHours;
		this.objectif = objectif;
		this.speciality = speciality;
	}

}
