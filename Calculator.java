import java.util.Scanner;
public class Calculator {
	public double addNumbers(double num1, double num2) {
		double addition=num1+num2;
		return addition;
	}
	public double substractNumbers(double num1, double num2) {
		double substraction=num1-num2;
		return substraction;
	}
	public double divisionNumbers(double num1, double num2) {
		if(num2!=0) {
			return num1/num2;
		}else {
			System.out.println("Cannot devide by Zero");
			return Double.NaN;}
	}
	public double multiplyNumbers(double num1, double num2) {
		double multiplication=num1*num2;
		return multiplication;
	}

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter number 1");
	double num1=scanner.nextInt();
	System.out.println("Enter number 2");
	double num2=scanner.nextInt();
	System.out.println("Enter operator(+-/*)");
	String operator=scanner.next();
	Calculator calculator = new Calculator();
    double result = 0;

    switch (operator) {
        case "+":
            result = calculator.addNumbers(num1, num2);
            System.out.println("The sum of num1 and num2 is: " + result);
            break;
        case "-":
            result = calculator.substractNumbers(num1, num2);
            System.out.println("The difference between num1 and num2 is: " + result);
            break;
        case "*":
            result = calculator.multiplyNumbers(num1, num2);
            System.out.println("The multiplication between num1 and num2 is: " + result);
            break;
        case "/":
            result = calculator.divisionNumbers(num1, num2);
            if (!Double.isNaN(result)) {
                System.out.println("The division between num1 and num2 is: " + result);
            }
            break;
        default:
            System.out.println("Invalid operator");
	

	}

	}
	}
