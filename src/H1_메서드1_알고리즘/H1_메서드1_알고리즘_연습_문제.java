package H1_�޼���1_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//class Test3 {
//	Random ran = new Random();
//
//	void score(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = ran.nextInt(100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//	}
//
//	void total(int[] arr) {
//		int total = 0;
//		double avg = 0;
//		for (int i = 0; i < arr.length; i++) {
//			total += arr[i];
//		}
//		avg = total / 5;
//		System.out.println("���� : " + total + " " + "��� : " + avg);
//	}
//
//	void rank(int[] arr) {
//		int cnt = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] >= 60) {
//				cnt += 1;
//			}
//		}
//		System.out.println("�հݻ��� : " + cnt);
//	}
//
//	void indexScore(int[] arr, int x) {
//		System.out.println(arr[x]);
//	}
//
//	void scoreIndex(int[] arr, int x) {
//		int index = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (x == arr[i]) {
//				index = i;
//			}
//		}
//		System.out.println(index);
//	}
//
//	void hakbunScore(int[] arr, int[] arr1, int x) {
//		int index = 0;
//		boolean check = false;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == x) {
//				index = i;
//				check = true;
//			}
//		}
//		if (check == true) {
//			System.out.println("�й� : " + arr[index] + " " + "���� : " + arr1[index]);
//		} else {
//			System.out.println(x + " �ش��й��� �������� �ʽ��ϴ�.");
//		}
//	}
//
//
//}

class Test3Result {
	void setRandomValuesinArray(int[] scores) {
		Random ran = new Random();
		for (int i = 0; i < scores.length; i++) {
			int r = ran.nextInt(100) + 1;
			scores[i] = r;
		}
		printScores(scores);
	}
	
	void printScores(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
	
	void printNuber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	void printSumAndAverage(int[] scores) {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		// ����ȯ
		System.out.println(total + " : " + (double) total / scores.length);
	}
	
	void printWinner(int[] scores) {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	
	void printScore1(int[] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ε����� �Է��ϼ��� : ");
		int index = scan.nextInt();
		System.out.println(scores[index]);
		
	}
	
	void printScore2(int[] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int value = scan.nextInt();
		for (int i = 0; i < scores.length; i++) {
			if (value == scores[i]) {
				System.out.println(i);
			}
		}
	}
	
	void printScore3(int[] hakbuns, int[] scores) {
		Scanner scan = new Scanner(System.in);
		printNuber(hakbuns);
		System.out.println("�й��� �Է��ϼ��� : ");
		int value = scan.nextInt();
		boolean check = false;
		for (int i = 0; i < hakbuns.length; i++) {
			if (value == hakbuns[i]) {
				System.out.println(scores[i]);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("�����й��Դϴ�.");
		}
	}
	
	void printNumberOne(int[] hakbuns, int[] scores) {
		int max = scores[0];
		int maxindex = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				maxindex = i;
			}
		}
		System.out.println(max + " " + hakbuns[maxindex]);
	}
}
public class H1_�޼���1_�˰���_����_���� {
	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		//Test3 test = new Test3(); // ��뼱��
		Test3Result test = new Test3Result();
		Scanner scan = new Scanner(System.in);
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		// test.score(scores);

		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		// test.total(scores);

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		// test.rank(scores);

		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
//		System.out.println("�ε��� �Է� : ");
//		int index = scan.nextInt();
//		test.indexScore(scores, index);

		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
//		System.out.println("���� �Է� : ");
//		int score = scan.nextInt();
//		test.scoreIndex(scores, score);

		// ����6) �й��� �Է¹޾� ���� ���
//		System.out.println("�й� �Է� : ");
//		int number = scan.nextInt();
//		test.hakbunScore(scores, hakbuns, number);
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		// System.out.println("�й� �Է� : ");
		// int number = scan.nextInt();
		// test.hakbunScore(hakbuns, scores, number);
		// ����8) 1���л��� �й��� ���� ���

		
		
		
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		test.setRandomValuesinArray(scores);
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		test.printSumAndAverage(scores);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		test.printWinner(scores);
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		test.printScore1(scores);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		test.printScore2(scores);
		// ����6) �й��� �Է¹޾� ���� ��� // ��, �����й� �Է� �� ����ó��

		test.printScore3(hakbuns, scores);
		// ����7) 1���л��� �й��� ���� ���

		test.printNumberOne(hakbuns, scores);

	}
}
