package H3_메서드리턴1_기본이론;

class RandomTest{

	int nextInt(int max) {
        	long next = System.currentTimeMillis(); // 현재시간을 가저온다. 시간은 계속 바뀌니 랜덤이나올수있다.
        //	long next = 1; //이숫자로 해보면 계속 같은숫자가 나온다. 
		next = next * 1103515245 + 12345;
		next = (next/65536) % 32768;
		System.out.println(next);
		if(next < 0) {
			next *= -1;
		}
		return (int)next % max;
	}	
}

public class H3_랜덤알고리즘 {

	public static void main(String[] args) {
		
		RandomTest ran = new RandomTest();
		
		int r1 = ran.nextInt(10);
		System.out.println(r1);
		

	}

}
