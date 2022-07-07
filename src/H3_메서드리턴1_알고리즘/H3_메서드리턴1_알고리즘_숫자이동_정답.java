package H3_�޼��帮��1_�˰���;

import java.util.Scanner;

/*
 * # ���� �̵��ϱ� : Ŭ���� + �޼���
 * 1. ���� 8�� ĳ�����̴�.
 * 2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
 * 3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
 * 4. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.
 */

class NumberGame{
	
	Scanner scan = new Scanner(System.in);
	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	
	void printPlay() {
		for(int i=0; i<move.length; i++) {
			if(move[i] == 0) { System.out.print("[ ]"); }
			else { System.out.print("[��]"); }
		}
		System.out.println();
	}
	boolean checkSelect(int sel) {
		if(sel >= 0 || sel <= 2) {
			return true;
		}else {
			return false;
		}
	}
	
	void showMenu() {
		System.out.println(player);
		System.out.print("0.�����ϱ�");
		System.out.print("1.�·� �̵�");
		System.out.print("2.��� �̵�");	
		System.out.print(": ");
	}
	boolean moveLeftCheck() {
		if(player > 0 ) {
			return true;
		}else {
			return false;
		}
	}
	boolean moveRightCheck() {
		if(player < move.length-1 ) {
			return true;
		}else {
			return false;
		}
	}
	void moveLeft() {
		if(moveLeftCheck() == true) {
			move[player] = 0;
			move[player - 1] = 8;
			player -= 1;
		}else {
			System.out.println("���̻� ������ �� �����!");
		}
	}
	
	void moveRight() {
		if(moveRightCheck() == true) {
			move[player] = 0;
			move[player + 1] = 8;
			player += 1;
		}else {
			System.out.println("���̻� ������ �� �����!");
		}
	}
	
	void run() {
		while(true) {
			// ����ȭ�� ���
			printPlay();
			// �޴� ���
			showMenu();
			// �޴� ����
			
			int sel = scan.nextInt();
			if(checkSelect(sel) == false) {
				System.out.println("[�߸��ȹ�ȣ]");
				continue;
			}
			// �·� �̵�
			if(sel == 1) { moveLeft(); }
			// ��� �̵�
			else if(sel == 2) { moveRight(); }
			// ����
			else if(sel == 0) {
				System.out.println("���� ����");
				break;
			}
		}
	}
}
public class H3_�޼��帮��1_�˰���_�����̵�_���� {
	public static void main(String[] args) {

		NumberGame g = new NumberGame();
		g.run();
		
	}
}