package H2_메서드2_알고리즘;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

//카드섞기, 카드 출력(앞면, 뒷면), 카드선택, 게임진행
class MemoryGame{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
	
	void shuffle() {
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(front.length);
			int r2 = ran.nextInt(front.length);
			int temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
	}
	
	void printCard() {
		//카드 앞면 출력
		System.out.println("front = [");
		for(int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println("] ");
		
		//카드 뒷면 출력
		System.out.println("back = [");
		for(int i = 0; i < back.length; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println("] ");
	}
	
	void choiceCard() {
		System.out.println("카드1[1~10] : ");
		int card1 = scan.nextInt();
		card1 -= 1;
		System.out.println("카드2[1~10] : ");
		int card2 = scan.nextInt();
		card2 -= 1;
		
		//카드 뒤집기
		if(front[card1] == front[card2]) {
			back[card1] = front[card1];
			back[card2] = front[card2];
			cnt += 1;
		}
	}
	
	void run() {
		shuffle(); // 카드 섞기
		
		while(true) {
			printCard(); // 카드 출력
			
			if(cnt == 5) {
				System.out.println("게임 종료");
				break;
			}
			choiceCard(); // 카드선택하기
		}
	}
}

public class H2_메서드2_알고리즘_기억력게임_문제 {
	public static void main(String[] args) {

		MemoryGame mg = new MemoryGame();
		mg.run();
	}
}