package H5_어레이리스트;

import java.util.ArrayList; // 임포트 해야한다.

public class H5_01_어레이리스트_기본이론2 {

	public static void main(String[] args) {
		// 한번더 연습 
		
		ArrayList<String> list = new ArrayList<String>();
		
		//1. 추가 add
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println("------------------");
		
		//2.출력 size , get
		for(int i = 0; i < list.size(); i ++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("------------------");
		
		//3.수정 set(인덱스 , 변경할값)
		list.set(1, "ddd");
		
		for(int i = 0; i < list.size(); i ++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("------------------");
		//4.삭제 remove(인덱스)
		list.remove(1);	
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("------------------");
	}

}