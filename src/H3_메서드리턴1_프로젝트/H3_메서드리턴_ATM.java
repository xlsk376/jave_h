package H3_�޼��帮��1_������Ʈ;

import java.util.Scanner;

//ATM

class Bank{
	
	Scanner scan = new Scanner(System.in);
	String name = "";
	
	String[] arAcc = {"1111", "2222", "3333", "", ""};
	String[] arPw  = {"1234", "2345", "3456", "", ""};
	int[] arMoney  = {87000, 34000, 17500, 0, 0};
	
	int count = 3;
	int loginCheck = -1;
	//ȸ������ ���
	void showMember() {
		for(int i = 0; i < count; i++) {
			System.out.println(arAcc[i] + " : " + arPw[i] + " : " + arMoney[i]);
		}
	}
	//���� �޴� ���
	void showMenu() {
		System.out.println("# �α��� ���� : ");
		if(loginCheck == -1) {
			System.out.println("�α׾ƿ�");
		}else {
			System.out.println(arAcc[loginCheck] +"�� �α��� ��...");
		}
		
		System.out.println("=== " + name + " ===");
		System.out.println("1.ȸ������");	
		System.out.println("2.ȸ��Ż��");
		System.out.println("3.�α���");
		System.out.println("4.�α׾ƿ�");
		System.out.println("5.�Ա��ϱ�");
		System.out.println("6.��ü�ϱ�");
	}
	//���� �ߺ� üũ
	int joinCheckAcc(String myAcc) {
		int check = 1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				check = -1;
			}
		}
		return check;
	}
	//��й�ȣ üũ
	int checkPw(int accCheck) {
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String myPw = scan.next();
		
		int pwCheck = -1;
		
		if(arPw[accCheck].equals(myPw)) {
			pwCheck = 1;
		}
		return pwCheck;
	}
	//Ż���� ���¹�ȣ üũ
	int deleteCheckAcc() {
		System.out.println("Ż���� ���¹�ȣ�� �Է��ϼ���");
		String myAcc = scan.next();
		int accCheck = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				accCheck = i;
			}
		}
		return accCheck;
	}
	
	void delMember() {
		//ȸ��Ż�� ��������
		if(count == 0) {
			System.out.println("Ż���� ȸ�������� �����ϴ�.");
			return;
		}
		
		//���¹�ȣ ��ȿ�� �˻�
		int accCheck = deleteCheckAcc();
		
		if(accCheck != -1) {
			int pwCheck = checkPw(accCheck);
			if(pwCheck == -1) {
				System.out.println("��й�ȣ�� �߸��Է��Ͽ����ϴ�.");
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
			System.out.println("���� ���¹�ȣ�Դϴ�.");
		}
	}
	
	void joinMember() {
		//ȸ������ ȸ�� ���� 5������� ���
		if(count == 5) {
			System.out.println("���̻� ������ �� �����ϴ�.");
			return;
		}
		//���¹�ȣ �ߺ��˻�
		System.out.println("������ ���¹�ȣ�� �Է��ϼ���.");
		String myAcc = scan.next();
		int check = joinCheckAcc(myAcc);
		if(check == -1) {
			System.out.println("���¹�ȣ�� �ߺ��˴ϴ�.");
		}else {
			System.out.println("��й�ȣ�� �Է��ϼ���");
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
			System.out.println("�α׾ƿ� �� ������ �ּ���");
			return;
		}
		
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String myId = scan.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String myPw = scan.next();
		
		//���¹�ȣ�� �н����� ��ȿ�� �˻�
		for(int i = 0; i < count; i++) {
			if(myId.equals(arAcc[i]) && myPw.equals(arPw[i])) {
				loginCheck = i;
			}
		}
		if(loginCheck == -1) {
			System.out.println("���¹�ȣ�� ��й�ȣ�� Ȯ�����ּ���");
		}else {
			System.out.println("�α��� ����");
		}
	}
	
	void logOut() {
		if(loginCheck == -1) {
			System.out.println("�α��� �� �������ּ���");
		}else {
			loginCheck = -1;
			System.out.println("�α׾ƿ� �Ǿ����ϴ�");
		}
	}
	
	void income() {
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
		int money = scan.nextInt();
		
		arMoney[loginCheck] += money;
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�");
	}
	
	void trans() {
		System.out.println("��ü�� ���¹�ȣ�� �Է��ϼ���");
		String transAcc = scan.next();
		
		//��ü ���¹�ȣ ��ȿ�� �˻�
		int check = -1;
		for(int i = 0; i < count; i++) {
			if(transAcc.equals(arAcc[i])) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("���¹�ȣ�� Ȯ�����ּ���");
		}else {
			System.out.println("��ü�� �ݾ��� �Է��ϼ���");
			int transMoney = scan.nextInt();
			
			//��ü�ݾ� ��ȿ�� �˻�
			if(arMoney[loginCheck] >= transMoney) {
				arMoney[loginCheck] -= transMoney;
				arMoney[check] += transMoney;
				System.out.println("��ü�� �Ϸ��Ͽ����ϴ�");
			}else {
				System.out.println("�����ܾ��� �����մϴ�");
			}
		}
	}
}

public class H3_�޼��帮��_ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank woori = new Bank();
		woori.name = "�츮����";
		
		while(true) {
			//��ü ȸ������ ���
			woori.showMember();
			//�޴� ���
			woori.showMenu();
			//�޴� ����
			System.out.println("�޴��� �������ּ���");
			int choice = scan.nextInt();
			//ȸ������
			 if(choice == 1) { woori.joinMember();}
			 //ȸ��Ż��
			 else if(choice == 2) {woori.delMember();}
			 //�α���
			 else if(choice == 3) {woori.login();}
			 // �α׾ƿ�
			 else if(choice == 4) {woori.logOut();}
			 // �Ա�
			 else if(choice == 5) {woori.income();}
			 // ��ü
			 else if(choice == 6) {woori.trans();}
		}
		
	}
}
