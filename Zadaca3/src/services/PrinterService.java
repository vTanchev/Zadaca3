package services;

import model.Invoice;

public class PrinterService {
	
	public String printInvoice(Invoice invoice) {
		
		if (invoice != null) {
			if (invoice.getFaktura() != null && !invoice.getFaktura().equals("")) {
				System.out.print(invoice.getFaktura());
				return "Invoice has been printed";
			}else {
				return "Invoice.getFaktura() is null or empty";
			}
		}else {
			return "Invoice is null";
		}
	}
}
