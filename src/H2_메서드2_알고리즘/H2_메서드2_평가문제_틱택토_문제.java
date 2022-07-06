package H2_메서드2_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//# 틱택토

//class TicTacToe{
//	Scanner scan = new Scanner(System.in);
//	
//	String[][] game = new String[3][3];
//	
//	int turn = 0;
//	int win = 0;		// 1[turn1승리] 2[turn2승리]
//	
//	
//	void gameInit() {
//		for(int i = 0; i < game.length; i++) {
//			for(int j = 0; j < game[i].length; j++) {
//				game[i][j] = "0";
//			}
//		}
//	}
//	
//	
//	void view() {
//		for(int i = 0; i < game.length; i++) {
//			for(int j = 0; j < game[i].length; j++) {
//				if(game[i][j].equals("0")) {
//					System.out.print("[ ]");
//				}else if(game[i][j].equals("1")) {
//					System.out.print("[O]");
//				}else if(game[i][j].equals("2")) {
//					System.out.print("[X]");
//				}
//			}
//			System.out.println();
//		}
//	}
//	void turn1() {
//		System.out.println("== turn1 ==");
//		System.out.println("y좌표 입력");
//		int y = scan.nextInt();
//		System.out.println("x좌표 입력");
//		int x = scan.nextInt();
//		game[y][x] = "1";
//		turn += 1;
//	}
//	
//	void turn2() {
//		System.out.println("== turn2 ==");
//		System.out.println("y좌표 입력");
//		int y = scan.nextInt();
//		System.out.println("x좌표 입력");
//		int x = scan.nextInt();
//		game[y][x] = "2";
//		turn += 1;
//	}
//	
//	void win() {
//		
//	}
//	
//	
//	
//	void run() {
//		gameInit();
//		while(true) {
//			view();
//			
//			if(turn % 2 == 0) {
//				turn1();
//			}else {
//				turn2();
//			}
//			
//		}
//		
//		
//	}
//	
//}

public class H2_메서드2_평가문제_틱택토_문제 {
	public static void main(String[] args) {
//		TicTacToe tic = new TicTacToe();
//		tic.run();
	}
}