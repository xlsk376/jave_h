package H1_메서드1_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

/*
class NumberGame{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	
	void run() {
		while(true) {
			System.out.println(Arrays.toString(move));
			System.out.println("1.왼쪽 2.오른쪽 0.종료");
			int n = scan.nextInt();
			if(n == 0) {
				break;
			}else if(n == 1) {
				if(player == 0) {
					System.out.println("이동불가");
				}else {
					move[player] = 0;
					player -= 1;
					move[player] = 8;
				}
			}else if(n == 2) {
				if(player == move.length-1) {
					System.out.println("이동불가");
				}else {
					move[player] = 0;
					player += 1;
					move[player] = 8;
				}
			}
		}
	}
}
*/
public class H1_메서드1_프로젝트_숫자이동_문제 {
	public static void main(String[] args) {

		NumberGame g = new NumberGame();
		g.run();
		
	}
}