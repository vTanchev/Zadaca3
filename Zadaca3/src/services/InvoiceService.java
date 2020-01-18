package services;

import model.Customer;
import model.Invoice;

public class InvoiceService {
	
	private PrinterService printerService = null; 
	private EmailService emailService = null;
	
	public InvoiceService(PrinterService printerService, EmailService emailService) {
		this.printerService = printerService; this.emailService = emailService;
	}
	
	public void handleInvoice(Invoice invoice, Customer customer) { 
		if (customer.isPrefersEmails()) {
			emailService.sendInvoice(invoice, customer.getEmail());
		} else {
			printerService.printInvoice(invoice);
		}
	}

}
