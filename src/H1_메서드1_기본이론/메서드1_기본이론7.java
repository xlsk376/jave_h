package H1_�޼���1_�⺻�̷�;
class Data{
	int a;
	int b;
	int result;
	String op;
	void print() {
		System.out.println(a + op + b + "=" + result);
	}
}
class Calc{
	
	void plus(Data data , int a , int b) {
		data.a = a;
		data.b = b;
		data.op  = "+";
		data.result = a + b;
	}
	void minus(Data data , int a , int b) {
		data.a = a;
		data.b = b;
		data.op = "-";
		data.result = a - b;
	}
}
public class �޼���1_�⺻�̷�7 {	
	public static void main(String[] args) {		
		Data data = new Data();		
		Calc calc = new Calc();	
		
		// data �� new Data() �� �ּҰ� ����ֱ⶧���� �����ϴ�. 
		calc.plus(data, 10, 3);
		data.print();
		calc.minus(data, 10, 3);
		data.print();
	}
}