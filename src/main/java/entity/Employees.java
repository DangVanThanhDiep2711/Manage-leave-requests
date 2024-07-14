package entity;

public class Employees {
	private int EmployeeID; 
	private String Name; 
	private String Email;
	private String Password;
	private String Role;
	
	public Employees() {}
	
	public Employees(int employeeID, String name, String email, String password, String role) {
		super();
		EmployeeID = employeeID;
		Name = name;
		Email = email;
		Password = password;
		Role = role;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	@Override
	public String toString() {
		return "Employees [EmployeeID=" + EmployeeID + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password
				+ ", Role=" + Role + "]";
	}  

	
}
