package H3_�޼��帮��1_�⺻�̷�;

class TestReturn3{
	int num;
	
	void setNum(int a) {
		num = a;
	}	
	int getNum() {
		return num;
	}
}

public class H3_�޼��帮��1_�⺻�̷�3 {
	  	
	public static void main(String[] args) {
		System.out.println("������ ����ϴ°��� ���ϴ°�� ");
		
		TestReturn3 t1 = new TestReturn3();
		t1.setNum(10);
		
		//1) ����ϴ°��
		System.out.println("1) ����ϴ°��");
		int num1 = t1.getNum();
		System.out.println(num1);
		
		//2) �����ϴ°��
		System.out.println("2) �����ϴ°��");
		int num2 = t1.num;
		System.out.println(num2);
				
	}
}