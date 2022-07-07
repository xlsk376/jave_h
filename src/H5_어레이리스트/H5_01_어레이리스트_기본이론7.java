package H5_어레이리스트;

import java.util.ArrayList; // 임포트 해야한다.
import java.util.Arrays;
import java.util.Scanner;

public class H5_01_어레이리스트_기본이론7 {
	/*
 		어레이 리스트 2차원	 	
 	 	회원관리데이터 
 	 	[1] 번호 [2] 아이디 [3] 비밀번호 [4] 이름 
 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		String[] test1 = {"1001" , "aaa" ,"aaa123" , "김철수"};
		String[] test2 = {"1002" , "bbb" ,"bbb123" , "이민수"};
		String[] test3 = {"1003" , "ccc" ,"ccc123" , "박영희"};
		String[] test4 = {"1004" , "ddd" ,"ddd123" , "최민정"};		
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
			System.out.println("[회원관리]");
			System.out.println("[1] 추가 [2] 삭제 [3] 수정 [4] 검색 [5] 출력 [0] 종료");
			int sel = scan.nextInt();
			if(sel == 0) { // 종료
				break;
			}
			else if(sel == 5) { // 출력
				for(int i = 0; i < memberList.size(); i++) {
					String [] temp = memberList.get(i);
					System.out.println(Arrays.toString(temp));
				}
			}
			
			else if(sel == 1) {
				System.out.println("아이디를 입력 : ");
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
					memberList.add(data);
					
				}else {
					System.out.println("중복아이디입니다. ");
				}	
			}else if(sel == 2) { // 삭제
				System.out.println("삭제할 아이디 입력");
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
					System.out.println("삭제할 아이디가 없습니다");
				}else {
					memberList.remove(index);
				}
			}else if(sel == 3) { // 수정
				System.out.println("수정할 아이디 입력");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					String temp[] = memberList.get(i);
					if(id.equals(temp[1])) {
						index = i;
					}
				}
				if(index == -1) {
					System.out.println("수정할 아이디가 없습니다");
				}else {
					System.out.println("변경할 정보 입력([1] 비밀번호 [2] 이름)");
					int sel1 = scan.nextInt();
					String data[] = new String[4];
					if(sel1 == 1) { // 비밀번호 변경
						System.out.println("변경할 비밀번호 입력");
						String pw = scan.next();
						data = memberList.get(index);
						data[2] = pw;
						memberList.set(index, data);
					}else if(sel1 == 2) { // 이름 변경
						System.out.println("변경할 이름 입력");
						String name = scan.next();
						data = memberList.get(index);
						data[3] = name;
						memberList.set(index, data);
					}
				}
			}else if(sel == 4) { // 검색
				System.out.println("검색할 아이디 입력");
				String id = scan.next();
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					String temp[] = memberList.get(i);
					if(id.equals(temp[1])) {
						index = i;
					}
				}
				if(index == -1) {
					System.out.println("검색할 아이디가 없습니다");
				}else {
					System.out.println(Arrays.toString(memberList.get(index)));
				}
			}
		}
	}
}