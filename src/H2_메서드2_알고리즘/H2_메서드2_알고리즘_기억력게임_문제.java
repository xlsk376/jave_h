package H2_�޼���2_�˰���;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + �޼���
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */

//ī�弯��, ī�� ���(�ո�, �޸�), ī�弱��, ��������
class MemoryGame{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// ������ ���� Ƚ��
	
	void shuffle() {
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(front.length);
			int r2 = ran.nextInt(front.length);
			int temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
	}
	
	void printCard() {
		//ī�� �ո� ���
		System.out.println("front = [");
		for(int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println("] ");
		
		//ī�� �޸� ���
		System.out.println("back = [");
		for(int i = 0; i < back.length; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println("] ");
	}
	
	void choiceCard() {
		System.out.println("ī��1[1~10] : ");
		int card1 = scan.nextInt();
		card1 -= 1;
		System.out.println("ī��2[1~10] : ");
		int card2 = scan.nextInt();
		card2 -= 1;
		
		//ī�� ������
		if(front[card1] == front[card2]) {
			back[card1] = front[card1];
			back[card2] = front[card2];
			cnt += 1;
		}
	}
	
	void run() {
		shuffle(); // ī�� ����
		
		while(true) {
			printCard(); // ī�� ���
			
			if(cnt == 5) {
				System.out.println("���� ����");
				break;
			}
			choiceCard(); // ī�弱���ϱ�
		}
	}
}

public class H2_�޼���2_�˰���_���°���_���� {
	public static void main(String[] args) {

		MemoryGame mg = new MemoryGame();
		mg.run();
	}
}