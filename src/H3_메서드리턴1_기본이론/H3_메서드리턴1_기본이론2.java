package H3_�޼��帮��1_�⺻�̷�;

class TestReturn2_1{
	int result;
	void plus(int a , int b) {
		result = a + b;
	}	
}

class TestReturn2_2{
	int plus(int a , int b) {
		// result ������ ��� ����� ������ִ�. 
		return a + b;
	}
}
public class H3_�޼��帮��1_�⺻�̷�2 {
	// ������ �����  (2)	
	// return �ż��带 ����ϸ� Ŭ�������� �����Ѱ��� ���ϼ��ִ�.
	// ���� �����ʾƵ� ���α׷� ����µ��� �ƹ��������� ����. 
	// ������ ���α׷����� �ɼ������� �ڿ������Եȴ�.

	// ���ϸ޼��� ����¹� 
	// 1) int 					   ==> main ���� ���� �ڷ��� 
	// 2) plus(int a , int b)     ==> �̸� 
	// 3) { return + ������ �� }      ==> �̰��� main ���� ��������.   
	
	public static void main(String[] args) {
		TestReturn2_1 t1 = new TestReturn2_1();
		t1.plus(10, 3);
		int num1 = t1.result;
		System.out.println(num1);
		
		System.out.println("---------------------------");
		TestReturn2_2 t2 = new TestReturn2_2();
		int num2 = t2.plus(10, 3);
		System.out.println(num2);
				
	}
}