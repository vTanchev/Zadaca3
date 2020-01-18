package services;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Customer;
import model.Invoice;

public class InvoiceServiceTest {
	
	private static Customer customer;
	
	private static Invoice inovice;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 customer = new Customer("Vasko", "Tancev", "vasko.tancev@gmail.com", true);
		 inovice = new Invoice("Faktura");
	}

	@Test
	public void testHandleInvoice() {						
		assertNotNull(customer);
		assertNotNull(inovice);
		assertTrue(customer.isPrefersEmails());
		customer.setPrefersEmails(false);
		assertFalse(customer.isPrefersEmails());
	}
	
}
