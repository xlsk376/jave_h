package H3_�޼��帮��1_�˰���;

import java.util.Scanner;

/*
 * # ��ȭ�� �¼����� : Ŭ���� + �޼���
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

class Theater {

	int[] seat = new int[10];
	Scanner scan = new Scanner(System.in);
	String name = ""; // ��ȭ�� �̸�
	int cnt = 0; // ���� ��
	int money = 0; // �����

	void showMenu() {
		System.out.println("=== " + name + " ===");
		System.out.println("1.�����ϱ�");
		System.out.println("2.�����ϱ�");
	}

	void showSeat() {
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 0) {
				System.out.print(" [X] ");
			} else {
				System.out.print(" [O] ");
			}
		}
		System.out.println();
	}

	void choiceSeat() {
		// �¼� ��Ȳ ����ϱ�
		System.out.print("�¼���ȣ�� �����ϼ���[1 ~ 10] : ");
		int idx = scan.nextInt() - 1;

		if (seat[idx] == 0) {
			seat[idx] = 1;
			cnt += 1;
			System.out.println("���Ÿ� �Ϸ��Ͽ����ϴ�.");
		} else {
			System.out.println("�̹� ���Ű� ���� �¼��Դϴ�.");
		}
	}

	void showSales() {
		money = cnt * 12000;
		System.out.println("�� ���� �ݾ� = " + money + "��");
	}

}

public class H3_�޼��帮��1_�򰡹���_����_���Ͼ��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Theater megabox = new Theater();
		megabox.name = "�ް��ڽ�";

		while (true) {
			megabox.showSeat();
			// �޴� ���
			megabox.showMenu();

			// �޴� �����ϱ�
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();

			// �����ϱ�
			if (choice == 1) {
				megabox.choiceSeat();
			}
			// �����ϱ�
			else if (choice == 2) {
				// ���� ��Ȳ ����ϱ�
				megabox.showSales();

				System.out.println("���α׷� ����");
				break;
			}

		}

	}
}