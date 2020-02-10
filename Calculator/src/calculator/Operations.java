package calculator;

public class Operations {
	float number1;
	float number2;
	
	ExceptionHandler eHandler = new ExceptionHandler();
	
	public Operations(float number1, float number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public float add() {
		return number1+number2;
	}
	
	public float subtract() {
		return number1-number2;
	}
	
	public float multiply() {
		return number1*number2;
	}
	
	public float divide() {
		if(number2 == 0) {
			eHandler.writeLog("Denominator cannot be Zero");
			return 0;
		}
		return number1/number2;
	}
	
}
