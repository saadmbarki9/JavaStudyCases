package manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Person {
	private String firstName, lastName, entreprise;
	private float baseSalary;

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

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Person(String firstName, String lastName, String entreprise, float baseSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.entreprise = entreprise;
		this.baseSalary = baseSalary;
	}

	public double calculateSalary() {
		return 0;
	}

	public void display() {

	}

	public boolean demandeAbsence(LocalDate dateDebut,int dure,String message,Interim interim){
		if(new ArrayList<String>(Arrays.asList(message.split(" "))).contains("maladie")){
			return true;
		}
		if(new ArrayList<String>(Arrays.asList(message.split(" "))).contains("congé")){
			if( dure <=2){
				return true;
			}else{
				if(interim != null && interim.isDispo()){
					return true;
				}else{
					return false;
				}
			}
		}
		if(message ==""){
			return false;
		}
		else{
			return false;
		}
	}

}
