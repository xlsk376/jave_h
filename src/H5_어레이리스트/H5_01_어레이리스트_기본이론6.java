package H5_��̸���Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class H5_01_��̸���Ʈ_�⺻�̷�6 {
	/*
       	��� ����Ʈ�� �Ⱦ��� (�Ϲݹ迭���)	����
 		ȸ������������ 
  		[1] ��ȣ [2] ���̵� [3] ��й�ȣ [4] �̸� 
 	  
  		�׽�Ʈ�� ���� �Ʒ� �⺻������ 4���� �ְ� �����Ѵ�.  
 */
	public static void main(String[] args) {
		
		// ��� ����Ʈ�� �Ⱦ��� (�Ϲݹ迭���)
	
		Scanner scan = new Scanner(System.in);	
		String[] test1 = {"1001" , "aaa" ,"aaa123" , "��ö��"};
		String[] test2 = {"1002" , "bbb" ,"bbb123" , "�̹μ�"};
		String[] test3 = {"1003" , "ccc" ,"ccc123" , "�ڿ���"};
		String[] test4 = {"1004" , "ddd" ,"ddd123" , "�ֹ���"};		
		
		String [][] memberList =new String[100][4]; // �ִ�100�� ����Ÿ��4
		int count = 0;
		int lastNumber = 1000;
		memberList[count] = test1;
		lastNumber += 1;
		count += 1;
		
		memberList[count] = test2;
		lastNumber += 1;
		count += 1;
		
		memberList[count] = test3;
		lastNumber += 1;
		count += 1;
		
		memberList[count] = test4;
		lastNumber += 1;
		count += 1;
			
		while(true) {
			System.out.println("[ȸ������]");
			System.out.println("[1] �߰� [2] ���� [3] ���� [4] �˻� [5] ��� [0] ����");
			int sel = scan.nextInt();
			if(sel == 0) { // ����
				break;
			}
			else if(sel == 5) { // ���
				for(int i = 0; i < count; i++) {
					String [] temp = memberList[i];
					System.out.println(Arrays.toString(temp));
				}
			}			
			else if(sel == 1) { // �߰�
				System.out.println("���̵� �Է� : ");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < count; i++) {
					String [] temp = memberList[i];
					
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
					memberList[count] = data;
					count += 1;
					
				}else {
					System.out.println("�ߺ����̵��Դϴ�. ");
				}	
			}else if(sel == 2) { // ����
				System.out.println("������ ���̵� �Է�");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(id.equals(memberList[i][1])) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("���̵� �����ϴ�");
				}else {
					for(int i = index; i < count-1; i++) {
						memberList[i][0] = memberList[i+1][0];
						memberList[i][1] = memberList[i+1][1];
						memberList[i][2] = memberList[i+1][2];
						memberList[i][3] = memberList[i+1][3];
					}
					memberList[count-1][0] = "";
					memberList[count-1][1] = "";
					memberList[count-1][2] = "";
					memberList[count-1][3] = "";
					count -= 1;
				}
			}else if(sel == 3) { // ����
				System.out.println("������ ���̵� �Է�");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(id.equals(memberList[i][1])) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("���̵� �����ϴ�");
				}else {
					System.out.println(memberList[index][0] + " " + memberList[index][1] + " " + memberList[index][2] + " " + memberList[index][3]);
					System.out.println("������ ������ �Է��ϼ���([1]��й�ȣ [2]�̸�)");
					int sel1 = scan.nextInt();
					if(sel1 == 1) { // ��й�ȣ
						System.out.println("������ ��й�ȣ�� �Է�");
						String pw = scan.next();
						memberList[index][2] = pw;
					}else if(sel1 == 2) { // �̸�
						System.out.println("������ �̸��� �Է�");
						String name = scan.next();
						memberList[index][3] = name;
					}
				}
			}else if(sel == 4) { // �˻�
				System.out.println("�˻��� ���̵� �Է��ϼ���");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(id.equals(memberList[i][1])) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("�˻��Ϸ��� ���̵� �����ϴ�.");
				}else {
					System.out.println(memberList[index][0] + " " + memberList[index][1] + " " + memberList[index][2] + " " + memberList[index][3]);
				}
			}
		}
	}
}