package H5_��̸���Ʈ;

import java.util.ArrayList; // ����Ʈ �ؾ��Ѵ�.
import java.util.Scanner;

public class H5_01_��̸���Ʈ_�⺻�̷�5 {
	/*
 	��Ʈ�ѷ�
	*/
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);	
		while(true) {
			System.out.println("[��Ʈ�ѷ�]");
			System.out.println("[1] �߰� [2] ���� [3] �˻� [4] ��� [5] ���� [0] ����");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) { // �߰�
				System.out.println("��ȣ�Է� : ");
				int num = scan.nextInt();
				System.out.println("�̸��Է� : ");
				String name = scan.next();
				
				int index = -1;
				
				for(int i = 0; i < numberList.size(); i++) {
					int temp = numberList.get(i);
					if(temp == num) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					numberList.add(num);
					System.out.println("ȸ���� �߰��մϴ�.");
				}else {
					System.out.println("�ߺ��� ��ȣ�Դϴ�.");
				}				
			}else if(sel == 2) { // ����
				System.out.println("��ȣ�Է� : ");
				int num = scan.nextInt();			
				int index = -1;
				
				for(int i = 0; i < numberList.size(); i++) {
					int temp = numberList.get(i);
					if(temp == num) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("������ ����Ÿ�� �����ϴ�.");
				}else {
					numberList.remove(index);
				}
				
			}else if(sel == 3) { // �˻�
				System.out.println("��ȣ�Է� : ");
				int num = scan.nextInt();			
				int index = -1;
				
				for(int i = 0; i < numberList.size(); i++) {
					int temp = numberList.get(i);
					if(temp == num) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("���� ��ȣ�Դϴ�. ");
				}else {
					System.out.println(numberList.get(index));
				}
			}else if(sel == 4) { // ���
				for(int i = 0; i < numberList.size(); i++) {
					System.out.print(numberList.get(i) + " ");
				}
				System.out.println();
			}else if(sel == 5) { // ����
				//System.out.println("��������.");
				System.out.println("��ȣ�Է� : ");
				int num = scan.nextInt();
				int index = -1;
				
				for(int i = 0; i < numberList.size(); i++) {
					int temp = numberList.get(i);
					if(temp == num) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�");
				}else {
					System.out.println("������ ��ȣ�Է� : ");
					num = scan.nextInt();
					int index1 = -1;
					for(int i = 0; i < numberList.size(); i++) {
						int temp = numberList.get(i);
						if(num == temp) {
							index1 = i;
							break;
						}
					}
					if(index1 == -1) {
						numberList.set(index, num);
					}else {
						System.out.println("�ߺ��� ��ȣ�Դϴ�");
					}
				}
			}
		}
		scan.close();
	}
}
	