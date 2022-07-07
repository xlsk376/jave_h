package H2_메서드2_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//숫자 세팅, 카드섞기, 카드현황출력, 카드선택, 게임진행
class SpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3]; // 1~9
	int[][] back = new int[3][3];  // 10~18

	int num = 1;	
	
	void setNumber() { // 숫자 세팅
		int k = 1;
		for(int i = 0; i < front.length; i++) {
			for(int j = 0; j < front[i].length; j++) {
				front[i][j] = k;
				k += 1;
			}
		}
		for(int i = 0; i < back.length; i++) {
			for(int j = 0; j < back[i].length; j++) {
				back[i][j] = k;
				k += 1;
			}
		}
	}
	
	void suffleCard() { // 카드 섞기
		for(int i = 0; i < front.length; i++) {
			for(int j = 0; j < front[i].length; j++) {
				int xR = ran.nextInt(front.length);
				int yR = ran.nextInt(front[i].length);
				
				int tmp = front[0][0];
				front[0][0] = front[xR][yR];
				front[xR][yR] = tmp;
				
				tmp = back[0][0];
				back[0][0] = back[xR][yR];
				back[xR][yR] = tmp;
			}
		}
	}
	void showCard() {
		for(int i = 0; i < front.length; i++) {
			for(int j = 0; j < front.length; j++) {
				System.out.print(front[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	void selectCard() {
		System.out.println("x입력 : ");
		int xIdx = scan.nextInt();
		System.out.println("y입력 : ");
		int yIdx = scan.nextInt();
		if(num == front[xIdx][yIdx]) {
			if(num <= 9) {
				front[xIdx][yIdx] = back[xIdx][yIdx];
			}else {
				front[xIdx][yIdx] = 0;
			}
			num += 1;
		}
	}
	
	void run() {
		setNumber();
		suffleCard();
		
		while(true) {
			showCard();
			
			if(num == 19) {
				System.out.println("게임종료");
				break;
			}
			
			selectCard();
		}
	}
	
}


public class H2_메서드2_평가문제_1to50_문제 {
	public static void main(String[] args) {
		SpeedGame sg = new SpeedGame();
		sg.run();
	}
}