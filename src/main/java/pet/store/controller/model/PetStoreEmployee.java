package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Employee;

@Data
@NoArgsConstructor
public class PetStoreEmployee {
	private Long employeeId;
	private String employeeName;
	private String employeePhone;
	private String employeeJobTitle;

	public PetStoreEmployee(Employee employee) {
		this.employeeId = employee.getEmployeeId();
		this.employeeName = employee.getEmployeeFirstName() + " " + employee.getEmployeeLastName();
		this.employeePhone = employee.getEmployeePhone();
		this.employeeJobTitle = employee.getEmployeeJobTitle();
	}
}
