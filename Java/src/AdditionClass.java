public class AdditionClass{
 // two numbers to add 
	public int number1,number2, TotalSum;

	/**
	 *
	 * @param num1 for number 1
	 * @param num2 for number 2
	 * 
	 */
	
	public AdditionClass(int num1, int num2) {
		number1=num1;
		number2=num2;
	}

	/**
	 *Add Number will add number1 and number2 and assign it to totalSum
	 */
	public void AddNumbers() {
		TotalSum=number1+number2;
			
	}

	
	     /**
		 * return String version of the Total Sum
		 */
	public String toString() {
		
		return "SUM of "+number1+" and "+number2+" equals "+TotalSum+"";	
	}
}
