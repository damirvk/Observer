package com.damirvk;

public class Main {

	
	public static void main(String[] args) {
		PSK psk=new PSK();
		Germania ger = new Germania();
		Kladionica kladionica = new Kladionica();
		kladionica.addObeserver(psk);
		kladionica.addObeserver(ger);
		kladionica.setPromjena(3);
		kladionica.setPromjena(14);
		
	}
	
}
