package review11;

public class American extends Human{
	String SSN;
	
	public American(String name, int age, int weight, String SSN) {
		super(name, age, weight);
		this.SSN = SSN;
	}
	
	public void taxReturns() {
		System.out.println("I am doing ma tax return.");
	}

}
