package manager;

import java.util.ArrayList;

public class Manager extends Person {
	private int respBonus;
	private ArrayList<Employee> employees;

	public int getRespBonus() {
		return respBonus;
	}

	public void setRespBonus(int respBonus) {
		this.respBonus = respBonus;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public Manager(String firstName, String lastName, String entreprise, float baseSalary, int respBonus,
			ArrayList<Employee> employees) throws ManagerException {
		super(firstName, lastName, entreprise, baseSalary);
		if (respBonus <= 0.1 * baseSalary) {
			throw new ManagerException();
		} else {
			this.respBonus = respBonus;
			this.employees = employees;
		}

	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void displayEmployees() {
		for (Employee emp : employees) {
			System.out.println(emp.getFirstName());
		}

	}

	public Employee bestEmployee() {
		Employee bestEmployee = employees.get(0);
		for (Employee emp : employees) {
			if (emp.isBetterThan(bestEmployee) == 1) {
				bestEmployee = emp;
			}
		}
		return bestEmployee;
	}

	public ArrayList<Employee> worstEmployee() {
		ArrayList<Employee> theWorstEmployees = new ArrayList<Employee>();
		for (Employee emp : employees) {
			if (emp.getPerformance() < emp.getObective()) {
				theWorstEmployees.add(emp);
			}
		}
		return theWorstEmployees;
	}

}
