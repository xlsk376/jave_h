package H5_어레이리스트;

import java.util.Arrays;
import java.util.Scanner;

public class H5_01_어레이리스트_기본이론6 {
	/*
       	어레이 리스트를 안쓸때 (일반배열사용)	복습
 		회원관리데이터 
  		[1] 번호 [2] 아이디 [3] 비밀번호 [4] 이름 
 	  
  		테스트를 위해 아래 기본데이터 4개를 넣고 시작한다.  
 */
	public static void main(String[] args) {
		
		// 어레이 리스트를 안쓸때 (일반배열사용)
	
		Scanner scan = new Scanner(System.in);	
		String[] test1 = {"1001" , "aaa" ,"aaa123" , "김철수"};
		String[] test2 = {"1002" , "bbb" ,"bbb123" , "이민수"};
		String[] test3 = {"1003" , "ccc" ,"ccc123" , "박영희"};
		String[] test4 = {"1004" , "ddd" ,"ddd123" , "최민정"};		
		
		String [][] memberList =new String[100][4]; // 최대100명 데이타는4
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
			System.out.println("[회원관리]");
			System.out.println("[1] 추가 [2] 삭제 [3] 수정 [4] 검색 [5] 출력 [0] 종료");
			int sel = scan.nextInt();
			if(sel == 0) { // 종료
				break;
			}
			else if(sel == 5) { // 출력
				for(int i = 0; i < count; i++) {
					String [] temp = memberList[i];
					System.out.println(Arrays.toString(temp));
				}
			}			
			else if(sel == 1) { // 추가
				System.out.println("아이디를 입력 : ");
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
					System.out.println("비밀번호를 입력 : ");
					String pw = scan.next();
					System.out.println("이름을 입력 : ");
					String name = scan.next();				
					String [] data = new String[4];
					lastNumber += 1;
					data[0] = lastNumber + ""; // 숫자라 문자열로 변경
					data[1] = id;
					data[2] = pw;
					data[3] = name;
					memberList[count] = data;
					count += 1;
					
				}else {
					System.out.println("중복아이디입니다. ");
				}	
			}else if(sel == 2) { // 삭제
				System.out.println("삭제할 아이디 입력");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(id.equals(memberList[i][1])) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("아이디가 없습니다");
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
			}else if(sel == 3) { // 수정
				System.out.println("수정할 아이디 입력");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(id.equals(memberList[i][1])) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("아이디가 없습니다");
				}else {
					System.out.println(memberList[index][0] + " " + memberList[index][1] + " " + memberList[index][2] + " " + memberList[index][3]);
					System.out.println("수정할 정보를 입력하세요([1]비밀번호 [2]이름)");
					int sel1 = scan.nextInt();
					if(sel1 == 1) { // 비밀번호
						System.out.println("변경할 비밀번호를 입력");
						String pw = scan.next();
						memberList[index][2] = pw;
					}else if(sel1 == 2) { // 이름
						System.out.println("변경할 이름을 입력");
						String name = scan.next();
						memberList[index][3] = name;
					}
				}
			}else if(sel == 4) { // 검색
				System.out.println("검색할 아이디를 입력하세요");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(id.equals(memberList[i][1])) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("검색하려는 아이디가 없습니다.");
				}else {
					System.out.println(memberList[index][0] + " " + memberList[index][1] + " " + memberList[index][2] + " " + memberList[index][3]);
				}
			}
		}
	}
}