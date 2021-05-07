package odevApp;

import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Mazlum","abul",LocalDate.of(1994, 03, 06), "13139777200"));
	
	}
}
