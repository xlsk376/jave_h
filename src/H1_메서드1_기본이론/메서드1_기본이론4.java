package H1_�޼���1_�⺻�̷�;
class Calculation{
	double num1;
	double num2;
	double result;	
	
	// �ż���� ��� ���������̶� �������� ǥ�õ� �������� �ߺ��̵Ǿ ���� �ٸ� �����̴�.
	// double a, double b  �� 4���̳� ��������� �����ٸ������̴�. 
	void plus(double a, double b) {
		result = a + b;
	}
	void minus(double a , double b) {
		result = a - b;
	}
	void multiply(double a , double b) {
		result = a * b;
	}
	void division(double a , double b) {
		result = a / b;
	}
	void printResult() {
		System.out.println(result);
	}
}
public class �޼���1_�⺻�̷�4 {
	
	public static void main(String[] args) {
		Calculation cal =new Calculation();
		double a = 10;
		double b = 3;
		cal.plus(a, b);
		cal.printResult();
		
		cal.minus(a, b);
		cal.printResult();
		
		cal.multiply(a, b);
		cal.printResult();
		
		cal.division(a, b);
		cal.printResult();
	}
}