package com.damirvk;

public class Germania implements Observer {

	@Override
	public void onUpdate(Integer i) {
		System.out.println("Germania:.. "+i);		
	}

}
