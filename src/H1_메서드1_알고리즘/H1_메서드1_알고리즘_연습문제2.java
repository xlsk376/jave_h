package H1_�޼���1_�˰���;

class Test2 {
	void printSum(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}
	void printSumMultiple4(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				total += arr[i];
			}
		}
		System.out.println(total);
	}
	void printCountMultiple4(int[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}
	void printCountEvenNumber(int[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}
}

public class H1_�޼���1_�˰���_��������2 {
	public static void main(String[] args) {
		int[] arr = { 87, 100, 11, 72, 92 };
		Test2 test = new Test2();
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		test.printSum(arr);

		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		test.printSumMultiple4(arr);

		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		test.printCountMultiple4(arr);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		test.printCountEvenNumber(arr);
	}
}