package com.syntax.review14;

public class HomemadeExceptionDemo {
	public static void main(String[] args) {
		int age1 = 19;
		try {
			checkInformation(age1);
			System.out.println("First user is logged in");
		} catch (AccessDeniedException e) {
			e.printStackTrace();
		}

		int age2 = 16;
//		try {
//			checkInformation(age2);
//			System.out.println("Second user is logged in");
//		} catch (AccessDeniedException e) {
//			System.out.println("Message -> " + e.getMessage());
//			System.out.println("Class -> " + e.getClass());
//			System.out.println("e -> " + e);
////			e.printStackTrace();
//		}
		
		String password1 = "12345";
//		try {
//			checkInformation(age1, password1);
//		} catch (AccessDeniedException e) {
//			e.printStackTrace();
//		} catch (WrongPasswordException e) {
//			e.printStackTrace();
//		}

		try {
			checkInformation(age2, password1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Happy Ending");

	}

	public static void checkInformation(int age) throws AccessDeniedException {
		if (age < 18) {
			AccessDeniedException ade = new AccessDeniedException("You are under 18!");
			throw ade;
		}
	}

	public static void checkInformation(int age, String password) throws AccessDeniedException, WrongPasswordException {
		if (age < 18) {
			throw new AccessDeniedException("You are under 18.");
		}

		if (password.equals("123456")) {
			System.out.println("You are OK");
		} else {
			throw new WrongPasswordException("The password should be 123456");
		}

	}
}

class AccessDeniedException extends Exception {
	public AccessDeniedException() {
		super();
	}

	public AccessDeniedException(String msg) {
		super(msg);
	}
}

class WrongPasswordException extends Exception {
	public WrongPasswordException(String message) {
		super(message);
	}
}
