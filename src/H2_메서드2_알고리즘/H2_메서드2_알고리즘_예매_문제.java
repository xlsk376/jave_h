package H2_메서드2_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

//
//class Theater {
//
//	int[] seat = new int[10];
//	Scanner scan = new Scanner(System.in);
//	String name = ""; // 영화관 이름
//	int cnt = 0; // 예매 수
//	int money = 0; // 매출액
//	
//	void seatView() {
//		System.out.println(Arrays.toString(seat));
//	}
//	
//	
//	void ticketSelect() {
//		System.out.println("좌석을 선택하세요.");
//		int seatSelect = scan.nextInt();
//		seatSelect -= 1;
//		seat[seatSelect] = 1;
//		
//	}
//	
//	void pay() {
//		for(int i = 0; i < seat.length; i++) {
//			if(seat[i] == 1) {
//				cnt += 1;
//			}
//		}
//		money = 12000*cnt;
//		System.out.println("금액 : "+money);
//	}
//}

public class H2_메서드2_알고리즘_예매_문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Theater megabox = new Theater();
//		megabox.name = "메가박스";
//
//		while (true) {
//		
//			// 메뉴 선택하기
//			System.out.print("메뉴 선택 : ");
//			System.out.println("1.예매 2.종료");
//			int choice = scan.nextInt();
//			if(choice == 1) {
//				megabox.seatView();
//				megabox.ticketSelect();
//			}else if(choice == 2) {
//				megabox.pay();
//				break;
//			}
//
//		}
//
	}
}