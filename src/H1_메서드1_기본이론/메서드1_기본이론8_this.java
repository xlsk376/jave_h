package H1_�޼���1_�⺻�̷�;

class MyTest{
	int a; // �ν��Ͻ����� ==> heap�� �ִ� ����
	String name;
	int score;
	void test() {
		// �������� : stack �� �ִ� ����
		int a = 10; // test()���� "a"��  �Լ��ۿ��ִ� a �� ���� �ٸ�a �̴�.
		// ����� ���а����ϴ�. ������ �Ķ��� 
		// ���θ� �������� ���ؼ��� this.�� �ٿ����Ѵ�. 	
		// ���� Ŭ���� �Լ��ۿ� �ִ� �������� this.�� ���̴°� ��Ģ������
		// ���������ϴٸ� ��Ȯ���� ���� ���̴°� ����.
		this.a = 100;
		System.out.println("------------------");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println("------------------");
		
		this.name = "aaa";
		this.score = 100;
	}
}

public class �޼���1_�⺻�̷�8_this {

	public static void main(String[] args) {
		MyTest t = new MyTest();
		t.test();
		System.out.println(t.a);
	}
}