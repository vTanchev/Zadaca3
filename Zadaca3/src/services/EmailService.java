package services;

import model.Invoice;

public class EmailService {
	
	public boolean sendInvoice(Invoice invoice, String email) {
		
		if (email != null && email.equals("")) {
			System.out.println(invoice.getFaktura() +" send to "+ email);
			return true;
		}
		
		return false;
	}

}
