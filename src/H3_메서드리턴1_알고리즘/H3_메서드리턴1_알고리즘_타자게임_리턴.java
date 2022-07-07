package H3_�޼��帮��1_�˰���;

import java.util.Random;
import java.util.Scanner;

class WordGame{
	Random ran = new Random();
	String [] wordList = {"java" , "spring" , "jsp" , "android" , "php"};
	boolean [] checkList;
	int count;
	void shuffleWord() {
		for(int i = 0; i < 1000; i++) {
			int r1 = ran.nextInt(wordList.length);
			int r2 = ran.nextInt(wordList.length);
			
			String temp = wordList[r1];
			wordList[r1] = wordList[r2];
			wordList[r2] = temp;
		}
	}	
	void reset() {
		count = 0;
		shuffleWord();
		checkList = new boolean [wordList.length];
	}
	String getWord() {
		return wordList[count];
	}
	void checkWord(String word) {
		if(word.equals(wordList[count])) {
			checkList[count] = true;
		}
		count += 1;
	}
	boolean getGameEnd() {
		if(count == wordList.length) {
			return true;
		}else {
			return false;
		}
	}
	void printGameEnd() {
		System.out.println("------------------------------");
		for(int i = 0; i < wordList.length; i++) {
			System.out.printf("%-8s" , wordList[i]);
		}
		System.out.println();
		for(int i = 0; i < checkList.length; i++) {
			System.out.printf("%-8s" , checkList[i]);
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("[Game Over]");
	}
}

public class H3_�޼��帮��1_�˰���_Ÿ�ڰ���_���� {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		WordGame wordGame= new WordGame();
		wordGame.reset();
		while(true) {
			System.out.println("Ÿ�ڿ�������");
			System.out.println("1)���� 0)����");
			int sel = scan.nextInt();
			if(sel == 1) {
				wordGame.reset();
				while(true) {
					System.out.println(wordGame.count + ") �ܾ ���纸����.");
					System.out.println(wordGame.getWord());
					String word = scan.next();
					wordGame.checkWord(word);
					if(wordGame.getGameEnd()) {
						wordGame.printGameEnd();
						break;
					}
				}
			}else if(sel == 0) {
				break;
			}
			
		}
	}
}