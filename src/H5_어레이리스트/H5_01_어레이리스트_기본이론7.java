package H5_��̸���Ʈ;

import java.util.ArrayList; // ����Ʈ �ؾ��Ѵ�.
import java.util.Arrays;
import java.util.Scanner;

public class H5_01_��̸���Ʈ_�⺻�̷�7 {
	/*
 		��� ����Ʈ 2����	 	
 	 	ȸ������������ 
 	 	[1] ��ȣ [2] ���̵� [3] ��й�ȣ [4] �̸� 
 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		String[] test1 = {"1001" , "aaa" ,"aaa123" , "��ö��"};
		String[] test2 = {"1002" , "bbb" ,"bbb123" , "�̹μ�"};
		String[] test3 = {"1003" , "ccc" ,"ccc123" , "�ڿ���"};
		String[] test4 = {"1004" , "ddd" ,"ddd123" , "�ֹ���"};		
		int lastNumber = 1000;
		ArrayList<String[]> memberList = new ArrayList<String[]>();	
		lastNumber += 1;
		memberList.add(test1);
		
		lastNumber += 1;
		memberList.add(test2);
		
		lastNumber += 1;
		memberList.add(test3);
		
		lastNumber += 1;
		memberList.add(test4);	
		while(true) {
			System.out.println("[ȸ������]");
			System.out.println("[1] �߰� [2] ���� [3] ���� [4] �˻� [5] ��� [0] ����");
			int sel = scan.nextInt();
			if(sel == 0) { // ����
				break;
			}
			else if(sel == 5) { // ���
				for(int i = 0; i < memberList.size(); i++) {
					String [] temp = memberList.get(i);
					System.out.println(Arrays.toString(temp));
				}
			}
			
			else if(sel == 1) {
				System.out.println("���̵� �Է� : ");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					String [] temp = memberList.get(i);
					
					if(id.equals(temp[1])) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("��й�ȣ�� �Է� : ");
					String pw = scan.next();
					System.out.println("�̸��� �Է� : ");
					String name = scan.next();				
					String [] data = new String[4];
					lastNumber += 1;
					data[0] = lastNumber + ""; // ���ڶ� ���ڿ��� ����
					data[1] = id;
					data[2] = pw;
					data[3] = name;
					memberList.add(data);
					
				}else {
					System.out.println("�ߺ����̵��Դϴ�. ");
				}	
			}else if(sel == 2) { // ����
				System.out.println("������ ���̵� �Է�");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					String temp[] = memberList.get(i);
					if(id.equals(temp[1])) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("������ ���̵� �����ϴ�");
				}else {
					memberList.remove(index);
				}
			}else if(sel == 3) { // ����
				System.out.println("������ ���̵� �Է�");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					String temp[] = memberList.get(i);
					if(id.equals(temp[1])) {
						index = i;
					}
				}
				if(index == -1) {
					System.out.println("������ ���̵� �����ϴ�");
				}else {
					System.out.println("������ ���� �Է�([1] ��й�ȣ [2] �̸�)");
					int sel1 = scan.nextInt();
					String data[] = new String[4];
					if(sel1 == 1) { // ��й�ȣ ����
						System.out.println("������ ��й�ȣ �Է�");
						String pw = scan.next();
						data = memberList.get(index);
						data[2] = pw;
						memberList.set(index, data);
					}else if(sel1 == 2) { // �̸� ����
						System.out.println("������ �̸� �Է�");
						String name = scan.next();
						data = memberList.get(index);
						data[3] = name;
						memberList.set(index, data);
					}
				}
			}else if(sel == 4) { // �˻�
				System.out.println("�˻��� ���̵� �Է�");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					String temp[] = memberList.get(i);
					if(id.equals(temp[1])) {
						index = i;
					}
				}
				if(index == -1) {
					System.out.println("�˻��� ���̵� �����ϴ�");
				}else {
					System.out.println(Arrays.toString(memberList.get(index)));
				}
			}
		}
	}
}