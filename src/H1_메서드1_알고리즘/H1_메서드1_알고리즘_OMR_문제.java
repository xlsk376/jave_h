package H1_�޼���1_�˰���;

import java.util.Random;

/*
 * # OMRī�� : Ŭ���� + �޼���
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

// ��� �ۼ�, ���� ��� �ۼ�, ��� �� �� �������
class ScoreMng{
	
	Random ran = new Random();
	
	int[] omr = {1, 3, 4, 2, 5};		// ������
	int[] me = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
	
	// 1.me ��� �ϼ��ϱ�
	void makeAnswer() {
		for(int i=0; i<me.length; i++) {
			me[i] = ran.nextInt(5) + 1;		// [0 ~ 4] + 1		
		}
	}
	
	// 2.���� ����ϱ�
	void showAnswer() {
		// omrī�� ���
		System.out.print("omr = [ ");
		for(int i=0; i<omr.length; i++) {
			System.out.print(omr[i] + " ");
		}
		System.out.println("]");
		// meī�� ���
		System.out.print("me  = [ ");
		for(int i=0; i<me.length; i++) {
			System.out.print(me[i] + " ");
		}
		System.out.println("]");
	}
	
	// 3.���� ���ϱ�
	void checkAnswer() {
		cnt = 0;
		System.out.print("����ǥ= [ ");
		for(int i=0; i<omr.length; i++) {
			if(omr[i] == me[i]) {
				System.out.print("o ");
				cnt += 1;
			}else {
				System.out.print("x ");
			}
		}
		System.out.println("]");
		
		score = 20 * cnt;
		System.out.println("��  �� = " + score + "��");
	}
	
}

public class H1_�޼���1_�˰���_OMR_���� {
	public static void main(String[] args) {
		ScoreMng sm = new ScoreMng();

		sm.makeAnswer();
		sm.showAnswer();
		sm.checkAnswer();

	}
}