package main;

import model.Customer;
import model.Invoice;
import services.EmailService;
import services.InvoiceService;
import services.PrinterService;

public class Main {
	
	public static void main(String[] args) {
		
		Invoice invoice = new Invoice("Faktura");
		Customer customer = new Customer("Vasko", "Tancev", "vasko.tancev@gmail.com", true);
		
		PrinterService printerService = new PrinterService();
		EmailService emailService = new EmailService();
		
		InvoiceService invoiceService = new InvoiceService(printerService, emailService);
		
		invoiceService.handleInvoice(invoice, customer);
           
    }

}
