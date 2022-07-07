package H3_�޼��帮��1_������Ʈ;

import java.util.Scanner;

//ATM

class BankNoReturn{
	
	Scanner scan = new Scanner(System.in);
	String name = "";
	
	String[] arAcc = { "1111", "2222", "3333", "", "" };
	String[] arPw = { "1234", "2345", "3456", "", "" };
	int[] arMoney = { 87000, 34000, 17500, 0, 0 };
	
	int count = 3;
	int loginCheck = -1;
	
	//���ϾȾ��Ƿ� �ؼ� ���亯��
	int checkDelete;
	int checkAccount;
	int checkPassword;
	
	void showMember() {
		for(int i = 0; i < count; i++) {
			System.out.println(arAcc[i] + " : " + arPw[i] + " : " + arMoney[i] + "��");
		}
	}
	
	void showMenu() {
		System.out.println("# �α��� ���� : ");
		if(loginCheck == -1) {
			System.out.println("�α׾ƿ�");
		}else {
			System.out.println(arAcc[loginCheck]+"��, �α��� ��...");
		}
		
		System.out.println("=== " + name + " ===");
		System.out.println("1.ȸ������");
		System.out.println("2.ȸ��Ż��");
		System.out.println("3.�α���");
		System.out.println("4.�α׾ƿ�");
		System.out.println("5.�Ա��ϱ�");
		System.out.println("6.��ü�ϱ�");
		
	}
	
	void joinCheckAcc(String myAcc) {
		checkAccount = 1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				checkAccount = -1;
			}
		}
	}
	
	void deleteCheckAcc() {
		System.out.println("Ż���� ���¹�ȣ�� �Է��ϼ��� : ");
		String myAcc = scan.next();
		checkDelete = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				checkDelete = i;
			}
		}
	}
	
	void checkPw(int accCheck) {
		System.out.println("��й�ȣ�� �Է��ϼ��� : ");
		String myPw = scan.next();
		
		checkPassword = -1;
		if(arPw[accCheck].equals(myPw)) {
			checkPassword = 1;
		}
	}
	
	void delMember() {
		if(count == 0) {
			System.out.println("Ż���� ȸ�������� �����ϴ�.");
			return;
		}
		deleteCheckAcc();
		int accCheck = checkDelete;
		
		if(accCheck != -1) {
			checkPw(accCheck);
			int pwCheck = checkPassword;
			
			if(pwCheck == -1) {
				System.out.println("��й�ȣ�� �߸� �Է��߽��ϴ�.");
			}else {
				for(int i = accCheck; i < count-1; i++) {
					arAcc[i] = arAcc[i+1];
					arPw[i] = arPw[i+1];
					arMoney[i] = arMoney[i+1];
				}
				count -= 1;
				System.out.println("Ż��Ǿ����ϴ�.");
			}
		}else {
			System.out.println("���� ���¹�ȣ �Դϴ�.");
		}
		
	}
	
	void joinMember() {
		//ȸ������ ȸ�� ���� 5������� ���
		if(count == 5) {
			System.out.println("���̻� ������ �� �����ϴ�.");
			return;
		}
		
		//���¹�ȣ �ߺ��˻�
		System.out.println("������ ���¹�ȣ�� �Է��ϼ��� : ");
		String myAcc = scan.next();
		
		//int check = checkAcc(myAcc);
		joinCheckAcc(myAcc);
		int check = checkAccount;
		if(check == -1) {
			System.out.println("���¹�ȣ�� �ߺ��˴ϴ�.");
		}else {
			System.out.println("��й�ȣ�� �Է��ϼ��� : ");
			String myPw = scan.next();
			
			arAcc[count] = myAcc;
			arPw[count] = myPw;
			arMoney[count] = 1000;
			
			count += 1;
			System.out.println("ȸ�������� �����մϴ�.");
		}
	}
	
	void login() {
		if(loginCheck != -1) {
			System.out.println("�α׾ƿ� �� �������ּ���.");
			return;
		}
		System.out.println("���¹�ȣ�� �Է��ϼ��� : ");
		String myId = scan.next();
		System.out.println("�н����带 �Է��ϼ��� : ");
		String myPw = scan.next();
		
		for(int i = 0; i < count; i++) {
			if(myId.equals(arAcc[i]) && myPw.equals(arPw[i])) {
				loginCheck = i;
			}
		}
		if(loginCheck == -1) {
			System.out.println("���¹�ȣ�� �н����带 Ȯ�����ּ���.");
		}else {
			System.out.println("�α��� ����!");
		}
		
	}
	
	void logOut() {
		if(loginCheck == -1) {
			System.out.println("�α��� �� �������ּ���.");
		}else {
			loginCheck = -1;
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
	}
	
	void income() {
		System.out.println("�Ա��� �ݾ��� �Է��ϼ��� : ");
		int money = scan.nextInt();
		
		arMoney[loginCheck] += money;
		System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�.");
	}
	
	void trans() {
		System.out.println("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
		String transAcc = scan.next();
		
		int check = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(transAcc)) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
		}else {
			System.out.println("��ü�� �ݾ��� �Է��ϼ��� : ");
			int transMoney = scan.nextInt();
			
			//��ü �ݾ� ��ȿ�� �˻�
			if(arMoney[loginCheck] >= transMoney) {
				arMoney[loginCheck] -= transMoney;
				arMoney[check] += transMoney;
				System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
			}else {
				System.out.println("�����ܾ��� �����մϴ�.");
			}
		}
	}
}

public class H3_�ż��帮��_ATM_���Ͼ��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankNoReturn woori = new BankNoReturn();
		woori.name = "�츮����";
		
		while(true) {
			//��ü ȸ������ ���
			woori.showMember();
			//�޴� ���
			woori.showMenu();
			//�޴� ����
			System.out.println("�޴��� �������ּ��� : ");
			int choice = scan.nextInt();
			//ȸ������
			if(choice == 1) {
				woori.joinMember();
			}
			//ȸ��Ż��
			else if(choice == 2) {
				woori.delMember();
			}
			//�α���
			else if(choice == 3) {
				woori.login();
			}
			//�α׾ƿ�
			else if(choice == 4) {
				woori.logOut();
			}
			//�Ա�
			else if(choice == 5) {
				woori.income();
			}
			//��ü
			else if(choice == 6) {
				woori.trans();
			}
		}
		
	}
}
