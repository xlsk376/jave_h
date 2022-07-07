package H4_�޼�������1_ȸ������;

import java.util.Arrays;
import java.util.Scanner;

/*
��� ������
[0] ��ȣ
[1] ���̵�
[2] ��й�ȣ
[3] �̸� 

*/

class MemberDAO{
	int lastNumber = 10001;
	int maxSize = 10000;
	String[][] memberList = new String[maxSize][4];
	int memberCount = 0;
	//��� �߰�
	void insertMember(String id, String pw, String name) {
		memberList[memberCount][0] = lastNumber + "";
		memberList[memberCount][1] = id;
		memberList[memberCount][2] = pw;
		memberList[memberCount][3] = name;
		lastNumber += 1;
		memberCount += 1;
	}
	// ���̵� �ߺ� üũ
	boolean checkId(String id) {
		boolean check = false;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i][1].equals(id)) {
				check = true;
				break;
			}
		}
		return check;
	}
	// �α��� 
	boolean checkLogin(String id, String pw) {
		boolean check = false;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i][1].equals(id) && memberList[i][2].equals(pw)) {
				check = true;
				break;
			}
		}
		return check;
	}
	
	void showMember(){
		for(int i = 0; i < memberCount; i++) {
			System.out.print(memberList[i][0] + " ");
			System.out.print(memberList[i][1] + " ");
			System.out.print(memberList[i][2] + " ");
			System.out.println(memberList[i][3]);
		}
	}
	void deleteMember(String log) {
		int index = -1;
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if(log.equals(memberList[i][1])) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("����");
		}else {
			System.out.println("index : " + index + " " + "memberCount : " + memberCount);
			for(int i = index; i < memberCount-1; i++) {
				memberList[i][0] = memberList[i+1][0];
				memberList[i][1] = memberList[i+1][1];
				memberList[i][2] = memberList[i+1][2];
				memberList[i][3] = memberList[i+1][3];
			}
			for(int i = 0; i < 4; i++) {
				memberList[memberCount-1][i] = "";
			}
			memberCount -= 1;
		}
	}
}

class Controller{
	Scanner scan = new Scanner(System.in);
	MemberDAO memberDAO = null;
	String log = "";
	//�ʱ�ȭ
	void init(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	//����
	void run() {
		while(true) {
			System.out.println("=== [����ȭ��] ===");
			System.out.println("[1] ���� [2] �α��� [0] ����");
			memberDAO.showMember();
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("���̵� �Է��ϼ���");
				String id = scan.next();
				boolean check = memberDAO.checkId(id);
				if(check == true) {
					System.out.println("�����ϴ� ���̵��Դϴ�");
				}else {
					System.out.println("����Ҽ� �ִ� ���̵��Դϴ�");
					System.out.println("��й�ȣ�� �Է��ϼ���");
					String pw = scan.next();
					System.out.println("�̸��� �Է��ϼ���");
					String name = scan.next();
					memberDAO.insertMember(id, pw, name);
					
				}
			}else if(sel == 2) {
				System.out.println("���̵� �Է��ϼ���");
				String id = scan.next();
				System.out.println("��й�ȣ�� �Է��ϼ���");
				String pw = scan.next();
				boolean check = memberDAO.checkLogin(id, pw);
				if(check == true) {
					log = id;
					System.out.println("�α��μ���");
					while(true) {
						System.out.println("[" + log +"�� �α�����" +"]");
						System.out.println("[1] �α׾ƿ� [2] �������� [3] ����Ȯ�� [4] ȸ��Ż��");
						int sel2 = scan.nextInt();
						if(sel2 == 1) {
							System.out.println("�α׾ƿ��մϴ�");
							log = "";
							break;
						}else if(sel2 == 2) { // ��������
							
						}else if(sel2 == 3) { // ����Ȯ��
							memberDAO.showMember();
						}else if(sel2 == 4) { // ȸ��Ż��
							memberDAO.deleteMember(log);
							break;
						}
					}
				}else {
					System.out.println("�α��ν���");
				}
			}else if(sel == 0) {
				break;
			}
		}
	}
}


public class H4_ȸ������ {
	public static void main(String[] args) {
		Controller controller = new Controller();
		MemberDAO memberDAO = new MemberDAO();
		controller.init(memberDAO);
		controller.run();
	}
}
