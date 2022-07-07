package H3_�޼��帮��1_�⺻�̷�;

class MethodOverloading{
	int add(int x, int y) {
		return x + y;
	}
	int add(int x, int y, int z) {
		return x + y + z;
	}
	int add(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}
public class H3_�޼��帮��1_�⺻�̷�5_�����ε� {
	  	
	// �ż�������ε��̶�? �޼��带 �����̸����� ���� 
	// ���޵Ǵ°��� �ٸ��� ���� �ٸ� �ż���� �ν��ϰڴ�. �̷��� 
	
	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int r1 = mol.add(10, 3);
		int r2 = mol.add(10, 3, 1);
		int r3 = mol.add(arr);
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);


	}
}