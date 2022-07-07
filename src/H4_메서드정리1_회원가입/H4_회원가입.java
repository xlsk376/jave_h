package H4_메서드정리1_회원가입;

import java.util.Arrays;
import java.util.Scanner;

/*
멤버 내용은
[0] 번호
[1] 아이디
[2] 비밀번호
[3] 이름 

*/

class MemberDAO{
	int lastNumber = 10001;
	int maxSize = 10000;
	String[][] memberList = new String[maxSize][4];
	int memberCount = 0;
	//멤버 추가
	void insertMember(String id, String pw, String name) {
		memberList[memberCount][0] = lastNumber + "";
		memberList[memberCount][1] = id;
		memberList[memberCount][2] = pw;
		memberList[memberCount][3] = name;
		lastNumber += 1;
		memberCount += 1;
	}
	// 아이디 중복 체크
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
	// 로그인 
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
			System.out.println("에러");
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
	//초기화
	void init(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	//실행
	void run() {
		while(true) {
			System.out.println("=== [메인화면] ===");
			System.out.println("[1] 가입 [2] 로그인 [0] 종료");
			memberDAO.showMember();
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("아이디를 입력하세요");
				String id = scan.next();
				boolean check = memberDAO.checkId(id);
				if(check == true) {
					System.out.println("존재하는 아이디입니다");
				}else {
					System.out.println("사용할수 있는 아이디입니다");
					System.out.println("비밀번호를 입력하세요");
					String pw = scan.next();
					System.out.println("이름을 입력하세요");
					String name = scan.next();
					memberDAO.insertMember(id, pw, name);
					
				}
			}else if(sel == 2) {
				System.out.println("아이디를 입력하세요");
				String id = scan.next();
				System.out.println("비밀번호를 입력하세요");
				String pw = scan.next();
				boolean check = memberDAO.checkLogin(id, pw);
				if(check == true) {
					log = id;
					System.out.println("로그인성공");
					while(true) {
						System.out.println("[" + log +"님 로그인중" +"]");
						System.out.println("[1] 로그아웃 [2] 정보수정 [3] 정보확인 [4] 회원탈퇴");
						int sel2 = scan.nextInt();
						if(sel2 == 1) {
							System.out.println("로그아웃합니다");
							log = "";
							break;
						}else if(sel2 == 2) { // 정보수정
							
						}else if(sel2 == 3) { // 정보확인
							memberDAO.showMember();
						}else if(sel2 == 4) { // 회원탈퇴
							memberDAO.deleteMember(log);
							break;
						}
					}
				}else {
					System.out.println("로그인실패");
				}
			}else if(sel == 0) {
				break;
			}
		}
	}
}


public class H4_회원가입 {
	public static void main(String[] args) {
		Controller controller = new Controller();
		MemberDAO memberDAO = new MemberDAO();
		controller.init(memberDAO);
		controller.run();
	}
}
