package H1_�޼���1_�˰���;

import java.util.Scanner;

/*
 * # ������ ����ϱ� : Ŭ����[����]
 * 1. �ܹ��� �ֹ��� �޾� �������� ����Ѵ�.
 * 2. ��³����� �� �޴��� �ֹ� ������ �� �ݾ� �� �ܵ��� ǥ���Ѵ�.
 */


class BurgerShop{
	
	Scanner scan = new Scanner(System.in);

	String name = "";		// ���� �̸�
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"ġ�����", "�Ұ�����", "����Ƣ��", "��      ��"};
	int[] arCount = new int[4];
	int total = 0;	
	
	void showMeu() {
		System.out.println("===== " + name + " =====");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i+1) + "." + arMenu[i] + ": " + arPrice[i] + "��");
		}
		System.out.println("5.�����ϱ�");
	}
	
	void select(int num) { arCount[num] += 1; }
	
	
	void getReceipt() {
		System.out.println();
		System.out.println("===== ������ =====");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i + 1) + "." + arMenu[i] + ": " + arCount[i] + "��");
			total += arPrice[i] * arCount[i];
		}
		System.out.println("�� �ݾ� : " + total + "��");		
	}
	
}
public class H1_�޼���1_�˰���_������_���� {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		BurgerShop moms = new BurgerShop();
		moms.name = "������ġ �ܹ���";
		
		while(true) {
			// �޴� ���
			moms.showMeu();
			
			// �޴� ����
			System.out.print("�޴��� �����ϼ��� : ");
			int choice = scan.nextInt();
			
			// ġ�����
			if(choice == 1) { moms.select(0); }
			// �Ұ�����
			else if(choice == 2) { moms.select(1); }
			// ����Ƣ��
			else if(choice == 3) { moms.select(2); }
			// �ݶ�
			else if(choice == 4) { moms.select(3); }
			// ���� �� ������ ���
			else if(choice == 5) {
				moms.getReceipt();
				break;
			}
		}		
		
	}
}