package com.careerit.cj.day20;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String country;
	private double salary;

	private Employee(EmployeeBuilder eb) {
		this.id = eb.id;
		this.firstName = eb.firstName;
		this.lastName = eb.lastName;
		this.email = eb.email;
		this.gender = eb.gender;
		this.country = eb.country;
		this.salary = eb.salary;
	}

	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}

	static class EmployeeBuilder {
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		private String gender;
		private String country;
		private double salary;
		
		public EmployeeBuilder id(int id) {
			this.id = id;
			return this;
		}
		public EmployeeBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public EmployeeBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public EmployeeBuilder email(String email) {
			this.email = email;
			return this;
		}
		public EmployeeBuilder gender(String gender) {
			this.gender = gender;
			return this;
		}
		public EmployeeBuilder country(String country) {
			this.country = country;
			return this;
		}
		public EmployeeBuilder salary(double salary) {
			this.salary = salary;
			return this;
		}
		public Employee build() {
			return new Employee(this);
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gender=" + gender + ", country=" + country + ", salary=" + salary + "]";
	}

	

}
