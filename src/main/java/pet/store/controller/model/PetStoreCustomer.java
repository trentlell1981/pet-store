package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;

@Data
@NoArgsConstructor
public class PetStoreCustomer {
	private Long customerId;
	private String customerName;
	private String customerEmail;
	private String customerPhone;

	public PetStoreCustomer(Customer customer) {
		this.customerId = customer.getCustomerId();
		this.customerName = customer.getCustomerFirstName() + " " + customer.getCustomerLastName();
		this.customerEmail = customer.getCustomerEmail();
		this.customerPhone = customer.getCustomerPhone();
	}
}
