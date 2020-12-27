package db.connection.mysql.connection.model;

public class Manager {

	private Employee employee;
	private String departmentName;
	
	public Manager(Employee employee, String departmentName) {
		this.employee = employee;
		this.departmentName = departmentName;
	}

	public Manager() {

	}

	@Override
	public String toString() {
		return "Manager{" +
				"employee=" + employee +
				", departmentName='" + departmentName + '\'' +
				'}';
	}

	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
