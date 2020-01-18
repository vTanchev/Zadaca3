package model;

public class Invoice {
			
	public Invoice(String faktura) {
		this.faktura = faktura;
	}

	private String faktura;

	public String getFaktura() {
		return faktura;
	}

	public void setFaktura(String faktura) {
		this.faktura = faktura;
	}
	
}
