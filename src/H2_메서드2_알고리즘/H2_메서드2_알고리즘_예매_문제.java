package H2_�޼���2_�˰���;

import java.util.Arrays;
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

//
//class Theater {
//
//	int[] seat = new int[10];
//	Scanner scan = new Scanner(System.in);
//	String name = ""; // ��ȭ�� �̸�
//	int cnt = 0; // ���� ��
//	int money = 0; // �����
//	
//	void seatView() {
//		System.out.println(Arrays.toString(seat));
//	}
//	
//	
//	void ticketSelect() {
//		System.out.println("�¼��� �����ϼ���.");
//		int seatSelect = scan.nextInt();
//		seatSelect -= 1;
//		seat[seatSelect] = 1;
//		
//	}
//	
//	void pay() {
//		for(int i = 0; i < seat.length; i++) {
//			if(seat[i] == 1) {
//				cnt += 1;
//			}
//		}
//		money = 12000*cnt;
//		System.out.println("�ݾ� : "+money);
//	}
//}

public class H2_�޼���2_�˰���_����_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Theater megabox = new Theater();
//		megabox.name = "�ް��ڽ�";
//
//		while (true) {
//		
//			// �޴� �����ϱ�
//			System.out.print("�޴� ���� : ");
//			System.out.println("1.���� 2.����");
//			int choice = scan.nextInt();
//			if(choice == 1) {
//				megabox.seatView();
//				megabox.ticketSelect();
//			}else if(choice == 2) {
//				megabox.pay();
//				break;
//			}
//
//		}
//
	}
}