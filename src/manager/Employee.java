package manager;

public class Employee extends Person implements Comparable {
	private int performance, perfBonus, obective;
	private Manager manager;

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getPerfBonus() {
		return perfBonus;
	}

	public void setPerfBonus(int perfBonus) {
		this.perfBonus = perfBonus;
	}

	public int getObective() {
		return obective;
	}

	public void setObective(int obective) {
		this.obective = obective;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Employee(String firstName, String lastName, String entreprise, float baseSalary, int performance,
			int perfBonus, int obective, Manager manager) {
		super(firstName, lastName, entreprise, baseSalary);
		this.performance = performance;
		this.perfBonus = perfBonus;
		this.obective = obective;
		this.manager = manager;
	}

	public int isBetterThan(Employee a) {
		if (performance < a.getPerformance()) {
			return -1;
		} else if (performance == a.getPerformance()) {
			return 0;
		} else {
			return 1;
		}
	}

}
