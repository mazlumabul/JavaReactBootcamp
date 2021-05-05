import abstracts.BaseCustomerManager;
import concrete.NeroCustomerManager;
import entities.Customer;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Mazlum","abul","06/03/1994","13136985214"));
		
		
	}
}
