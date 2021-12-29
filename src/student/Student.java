package student;

import java.util.ArrayList;

public class Student extends Person {
	private char groupe;
	private ArrayList<Absence> allAbsences;

	public char getGroupe() {
		return groupe;
	}

	public void setGroupe(char groupe) {
		this.groupe = groupe;
	}

	public ArrayList<Absence> getAllAbsences() {
		return allAbsences;
	}

	public void setAllAbsences(ArrayList<Absence> allAbsences) {
		this.allAbsences = allAbsences;
	}

	public Student(String firstName, String lastName, String school, int authorizedAbsence, char groupe,
			ArrayList<Absence> allAbsences) {
		super(firstName, lastName, school, authorizedAbsence);
		this.groupe = groupe;
		this.allAbsences = allAbsences;
	}

	public boolean justify(Absence a, String reason) throws AbsenceException {
		if (reason == "") {
			throw new AbsenceException();
		} else {
			a.setJustification(true);
			return true;
		}
	}

	public void addAbsence(Absence a) {
		this.allAbsences.add(a);

	}
}
