package com.syntax.review12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PhoneListDemo {
	public static void main(String[] args) {
		List<Phone> phoneList = new ArrayList<>();
		System.out.println(phoneList.size());

		Phone phone1 = new Phone("123-123");

		phoneList.add(phone1);
		phoneList.add(new Phone("234-345"));

//		int size = phoneList.size();
//		System.out.println(size);
		System.out.println(phoneList.size());

		SmartPhone iphone1 = new SmartPhone("i234-567", "White");
		// up casting
//		Phone phone2 = iphone1;
//		phoneList.add(phone2);

		phoneList.add(iphone1);
		phoneList.add(new SmartPhone("s00000", "Black"));

		System.out.println(phoneList.size());

		Phone thirdPhone = phoneList.get(2);
		thirdPhone.displayInfo();
		thirdPhone.call("234-567");

		System.out.println("Down casting");
		SmartPhone thirdSmartPhone = (SmartPhone) thirdPhone;
		thirdSmartPhone.showWeather();

		System.out.println("---1st way---");
		for (int i = 0; i < phoneList.size(); i++) {
			Phone phone = phoneList.get(i);
			phone.displayInfo();

			// check if the phone object is of type SmartPhone
			if (phone instanceof SmartPhone) {
				// it is safe to downcast
				SmartPhone sPhone = (SmartPhone) phone;
				sPhone.showWeather();
				sPhone.takePicture();
			}
		}

		System.out.println("---2nd way---");
		for (Phone phone : phoneList) {
			phone.displayInfo();
		}

		System.out.println("---3rd way---");
		Iterator<Phone> phoneIterator = phoneList.iterator();

//		Phone firstPhone = phoneIterator.next();
//		firstPhone.displayInfo();
//		
//		Phone secondPhone = phoneIterator.next();
//		secondPhone.displayInfo();

		while (phoneIterator.hasNext()) {
			Phone phone = phoneIterator.next();
			phone.displayInfo();
		}

		System.out.println("---Remove SmartPhones from the list---");

		Iterator<Phone> it = phoneList.iterator();
		while (it.hasNext()) {
			Phone phone = it.next();
			
			if (phone instanceof SmartPhone) {
				it.remove();
			}
		}

		System.out.println(phoneList.size());

		for (int i = 0; i < phoneList.size(); i++) {
			Phone phone = phoneList.get(i);
			phone.displayInfo();
		}
	}

}
