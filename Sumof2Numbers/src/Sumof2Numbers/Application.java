package Sumof2Numbers;

interface SumOfNumbers{
	
	int Sum(int a, int b);
	
}

class Sum{
	
	public void Sum(SumOfNumbers calc) {
		
		int number = calc.Sum(20, 30);
		System.out.println("The sum is: " + number);
	}
}

public class Application {

	public static void main(String[] args) {
		
		Sum sum = new Sum();
		sum.Sum((int a, int b) -> {
			
		return a + b;
				
		});

	}

}
