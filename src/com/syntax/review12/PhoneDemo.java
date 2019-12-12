package com.syntax.review12;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone = new Phone("123-456-789");
		phone.color = "Blue";
		phone.sendText("123-456", "Privet");
		phone.call("234-567");
		
		phone.displayInfo();
	
		System.out.println(phone.getSerialNumber("12346"));	
		System.out.println(phone.getSerialNumber("123456"));
		
		System.out.println("---Smartphone generation---");
		
		//up casting is done implicitly
		Phone iphone1 = new SmartPhone("i123-456", "Red");
		iphone1.displayInfo();
		iphone1.call("345-567");
		iphone1.sendText("345-567", "Selam");
		
		//down casting has to be done explicitly
		SmartPhone smartPhone1 = (SmartPhone)iphone1;
		smartPhone1.showWeather();
		smartPhone1.takePicture();
	}
}
