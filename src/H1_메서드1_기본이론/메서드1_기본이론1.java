package H1_�޼���1_�⺻�̷�;

//�ż��� �⺻���� 
// ����
// 1) void 				==> Ű����
// 2) testPrint() 		==> �̸�
// 3) {���}             ==> ����Ǵ� ���� 
	
// ����
// t1.testPrint();
// 1) t1     ==> Ŭ����������
// 2) .testPrint(); ==> .�Լ��̸�();
class Test{		
	void testPrint() {
		System.out.println("!!");
	}
}
public class �޼���1_�⺻�̷�1 {
	public static void main(String[] args) {
		Test test = new Test();
		test.testPrint();
		test.testPrint();
		test.testPrint();
		test.testPrint();
	}
}