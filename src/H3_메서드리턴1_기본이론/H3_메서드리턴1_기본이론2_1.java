package H3_�޼��帮��1_�⺻�̷�;

import java.util.Random;

class MyRandom1{
	int ran;
	void nextInt(int r) {
		r += 10;
		r -= 7;
		r *= 3;
		r /= 3;
		ran = r;
	}
}
class MyRandom2{
	int nextInt(int r) {
		r += 10;
		r -= 7;
		r *= 3;
		r /= 3;
		return r;
	}
}
public class H3_�޼��帮��1_�⺻�̷�2_1 {
	
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(10);
		
		MyRandom1 ran1 = new MyRandom1();
		ran1.nextInt(10);
		int r2 = ran1.ran;
		System.out.println(r2);
		
		MyRandom2 ran2 = new MyRandom2();
		int r3 = ran2.nextInt(10);
		System.out.println(r3);
		
		
	}
}