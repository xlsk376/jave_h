package H1_�޼���1_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ���� �̵��ϱ� : Ŭ���� + �޼���
 * 1. ���� 8�� ĳ�����̴�.
 * 2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
 * 3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
 * 4. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.
 */

/*
class NumberGame{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	
	void run() {
		while(true) {
			System.out.println(Arrays.toString(move));
			System.out.println("1.���� 2.������ 0.����");
			int n = scan.nextInt();
			if(n == 0) {
				break;
			}else if(n == 1) {
				if(player == 0) {
					System.out.println("�̵��Ұ�");
				}else {
					move[player] = 0;
					player -= 1;
					move[player] = 8;
				}
			}else if(n == 2) {
				if(player == move.length-1) {
					System.out.println("�̵��Ұ�");
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
public class H1_�޼���1_������Ʈ_�����̵�_���� {
	public static void main(String[] args) {

		NumberGame g = new NumberGame();
		g.run();
		
	}
}