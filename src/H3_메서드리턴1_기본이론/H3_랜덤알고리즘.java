package H3_�޼��帮��1_�⺻�̷�;

class RandomTest{

	int nextInt(int max) {
        	long next = System.currentTimeMillis(); // ����ð��� �����´�. �ð��� ��� �ٲ�� �����̳��ü��ִ�.
        //	long next = 1; //�̼��ڷ� �غ��� ��� �������ڰ� ���´�. 
		next = next * 1103515245 + 12345;
		next = (next/65536) % 32768;
		System.out.println(next);
		if(next < 0) {
			next *= -1;
		}
		return (int)next % max;
	}	
}

public class H3_�����˰��� {

	public static void main(String[] args) {
		
		RandomTest ran = new RandomTest();
		
		int r1 = ran.nextInt(10);
		System.out.println(r1);
		

	}

}
