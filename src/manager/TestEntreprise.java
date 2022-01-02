package manager;

import java.util.ArrayList;

public class TestEntreprise {
	public static float payroll(Person[] staff) {
		float masseGlobale = 0;
		for (Person per : staff) {
			if (per instanceof Manager) {
				Manager perr;
				perr = (Manager) per;
				masseGlobale += perr.getBaseSalary() + perr.getRespBonus();

			} else {
				Employee perr;
				perr = (Employee) per;
				masseGlobale += perr.getBaseSalary() + perr.getPerfBonus();
			}
		}
		return masseGlobale;
	}

	public static void main(String[] args) {
//		creating managers
		Manager m1 = null;
		Manager m2 = null;
		try {
			m1 = new Manager("Ahmed", "B", "DataTruc", 18000, 3000, new ArrayList<Employee>());
		} catch (ManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		try {
			m2 = new Manager("Imane", "A", "DataTruc", 15000, 5000, new ArrayList<Employee>());
		} catch (ManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		creating employees
		Employee em1 = new Employee("Youssef", "A", "DataTruc", 11000, 300, 3000, 250, m1);
		Employee em2 = new Employee("Mohammed", "A", "DataTruc", 10000, 200, 3000, 250, m2);
		Employee em3 = new Employee("Mouna", "A", "DataTruc", 11000, 100, 3000, 250, m1);
//		adding employees to managers
		m1.addEmployee(em1);
		m1.addEmployee(em3);
		m2.addEmployee(em2);
//		afficher
		m1.displayEmployees();
//		worst employees
		for (Employee emp : m1.worstEmployee()) {
			System.out.println(emp.getFirstName());
		}
//		collection
		Person[] staff = { m1, m2, em1, em2, em3 };
//		method payroll
		System.out.println("----");
		System.out.println(payroll(staff));

	}

}
