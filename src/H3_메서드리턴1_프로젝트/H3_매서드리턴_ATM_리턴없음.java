package H3_메서드리턴1_프로젝트;

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
	
	//리턴안쓰므로 해서 생긴변수
	int checkDelete;
	int checkAccount;
	int checkPassword;
	
	void showMember() {
		for(int i = 0; i < count; i++) {
			System.out.println(arAcc[i] + " : " + arPw[i] + " : " + arMoney[i] + "원");
		}
	}
	
	void showMenu() {
		System.out.println("# 로그인 상태 : ");
		if(loginCheck == -1) {
			System.out.println("로그아웃");
		}else {
			System.out.println(arAcc[loginCheck]+"님, 로그인 중...");
		}
		
		System.out.println("=== " + name + " ===");
		System.out.println("1.회원가입");
		System.out.println("2.회원탈퇴");
		System.out.println("3.로그인");
		System.out.println("4.로그아웃");
		System.out.println("5.입금하기");
		System.out.println("6.이체하기");
		
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
		System.out.println("탈퇴할 계좌번호를 입력하세요 : ");
		String myAcc = scan.next();
		checkDelete = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				checkDelete = i;
			}
		}
	}
	
	void checkPw(int accCheck) {
		System.out.println("비밀번호를 입력하세요 : ");
		String myPw = scan.next();
		
		checkPassword = -1;
		if(arPw[accCheck].equals(myPw)) {
			checkPassword = 1;
		}
	}
	
	void delMember() {
		if(count == 0) {
			System.out.println("탈퇴할 회원정보가 없습니다.");
			return;
		}
		deleteCheckAcc();
		int accCheck = checkDelete;
		
		if(accCheck != -1) {
			checkPw(accCheck);
			int pwCheck = checkPassword;
			
			if(pwCheck == -1) {
				System.out.println("비밀번호를 잘못 입력했습니다.");
			}else {
				for(int i = accCheck; i < count-1; i++) {
					arAcc[i] = arAcc[i+1];
					arPw[i] = arPw[i+1];
					arMoney[i] = arMoney[i+1];
				}
				count -= 1;
				System.out.println("탈퇴되었습니다.");
			}
		}else {
			System.out.println("없는 계좌번호 입니다.");
		}
		
	}
	
	void joinMember() {
		//회원가입 회원 수는 5명까지만 허용
		if(count == 5) {
			System.out.println("더이상 가입할 수 없습니다.");
			return;
		}
		
		//계좌번호 중복검사
		System.out.println("가입할 계좌번호를 입력하세요 : ");
		String myAcc = scan.next();
		
		//int check = checkAcc(myAcc);
		joinCheckAcc(myAcc);
		int check = checkAccount;
		if(check == -1) {
			System.out.println("계좌번호가 중복됩니다.");
		}else {
			System.out.println("비밀번호를 입력하세요 : ");
			String myPw = scan.next();
			
			arAcc[count] = myAcc;
			arPw[count] = myPw;
			arMoney[count] = 1000;
			
			count += 1;
			System.out.println("회원가입을 축하합니다.");
		}
	}
	
	void login() {
		if(loginCheck != -1) {
			System.out.println("로그아웃 후 진행해주세요.");
			return;
		}
		System.out.println("계좌번호를 입력하세요 : ");
		String myId = scan.next();
		System.out.println("패스워드를 입력하세요 : ");
		String myPw = scan.next();
		
		for(int i = 0; i < count; i++) {
			if(myId.equals(arAcc[i]) && myPw.equals(arPw[i])) {
				loginCheck = i;
			}
		}
		if(loginCheck == -1) {
			System.out.println("계좌번호와 패스워드를 확인해주세요.");
		}else {
			System.out.println("로그인 성공!");
		}
		
	}
	
	void logOut() {
		if(loginCheck == -1) {
			System.out.println("로그인 후 진행해주세요.");
		}else {
			loginCheck = -1;
			System.out.println("로그아웃 되었습니다.");
		}
	}
	
	void income() {
		System.out.println("입금할 금액을 입력하세요 : ");
		int money = scan.nextInt();
		
		arMoney[loginCheck] += money;
		System.out.println("입금을 완료하였습니다.");
	}
	
	void trans() {
		System.out.println("이체할 계좌번호를 입력하세요 : ");
		String transAcc = scan.next();
		
		int check = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(transAcc)) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("계좌번호를 확인해주세요.");
		}else {
			System.out.println("이체할 금액을 입력하세요 : ");
			int transMoney = scan.nextInt();
			
			//이체 금액 유효성 검사
			if(arMoney[loginCheck] >= transMoney) {
				arMoney[loginCheck] -= transMoney;
				arMoney[check] += transMoney;
				System.out.println("이체를 완료하였습니다.");
			}else {
				System.out.println("계좌잔액이 부족합니다.");
			}
		}
	}
}

public class H3_매서드리턴_ATM_리턴없음 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankNoReturn woori = new BankNoReturn();
		woori.name = "우리은행";
		
		while(true) {
			//전체 회원정보 출력
			woori.showMember();
			//메뉴 출력
			woori.showMenu();
			//메뉴 선택
			System.out.println("메뉴를 선택해주세요 : ");
			int choice = scan.nextInt();
			//회원가입
			if(choice == 1) {
				woori.joinMember();
			}
			//회원탈퇴
			else if(choice == 2) {
				woori.delMember();
			}
			//로그인
			else if(choice == 3) {
				woori.login();
			}
			//로그아웃
			else if(choice == 4) {
				woori.logOut();
			}
			//입금
			else if(choice == 5) {
				woori.income();
			}
			//이체
			else if(choice == 6) {
				woori.trans();
			}
		}
		
	}
}
