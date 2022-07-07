package H5_어레이리스트;

import java.util.ArrayList; // 임포트 해야한다.
import java.util.Scanner;

public class H5_01_어레이리스트_기본이론5 {
	/*
 	컨트롤러
	*/
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);	
		while(true) {
			System.out.println("[컨트롤러]");
			System.out.println("[1] 추가 [2] 삭제 [3] 검색 [4] 출력 [5] 수정 [0] 종료");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) { // 추가
				System.out.println("번호입력 : ");
				int num = scan.nextInt();
				System.out.println("이름입력 : ");
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
					System.out.println("회원을 추가합니다.");
				}else {
					System.out.println("중복된 번호입니다.");
				}				
			}else if(sel == 2) { // 삭제
				System.out.println("번호입력 : ");
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
					System.out.println("삭제할 데이타가 없습니다.");
				}else {
					numberList.remove(index);
				}
				
			}else if(sel == 3) { // 검색
				System.out.println("번호입력 : ");
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
					System.out.println("없는 번호입니다. ");
				}else {
					System.out.println(numberList.get(index));
				}
			}else if(sel == 4) { // 출력
				for(int i = 0; i < numberList.size(); i++) {
					System.out.print(numberList.get(i) + " ");
				}
				System.out.println();
			}else if(sel == 5) { // 수정
				//System.out.println("만들어보세요.");
				System.out.println("번호입력 : ");
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
					System.out.println("일치하는 번호가 없습니다");
				}else {
					System.out.println("변경할 번호입력 : ");
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
						System.out.println("중복된 번호입니다");
					}
				}
			}
		}
		scan.close();
	}
}
	