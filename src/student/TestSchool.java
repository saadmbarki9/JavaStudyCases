package student;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestSchool {

	public static void main(String[] args) {

		Student s1 = new Student("Youssef", "A", "DataTruc", 10, 'A', new ArrayList<Absence>());
		Student s2 = new Student("Mohammed", "A", "DataTruc", 10, 'B', new ArrayList<Absence>());
		Student s3 = new Student("Mouna", "A", "DataTruc", 10, 'A', new ArrayList<Absence>());

		Professor p1 = new Professor("Ahmed", "B", "DataTruc", 10, 12, 60, "Computer Science");
		Professor p2 = new Professor("Imane", "A", "DataTruc", 10, 32, 80, "Communication");

		Absence ab1 = new Absence(LocalDate.of(2018, 11, 26), false);
//		add absences to Youssef
		s1.addAbsence(new Absence(LocalDate.of(2018, 12, 03), false));
		s1.addAbsence(new Absence(LocalDate.of(2018, 11, 28), false));
		s3.addAbsence(ab1);

//		justify absence
		try {
			s3.justify(ab1, "Participation à une journée sprortive");
		} catch (AbsenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Student[] studentList = { s1, s2, s3 };
		String studentName = "";
		int maxAbsence = 0;
		for (Student student : studentList) {
			if (maxAbsence < student.getAllAbsences().size()) {
				maxAbsence = student.getAllAbsences().size();
				studentName = student.getFirstName();
			}
		}
		System.out.println(studentName);
	}

}
