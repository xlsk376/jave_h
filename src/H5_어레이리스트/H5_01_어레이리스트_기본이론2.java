package H5_��̸���Ʈ;

import java.util.ArrayList; // ����Ʈ �ؾ��Ѵ�.

public class H5_01_��̸���Ʈ_�⺻�̷�2 {

	public static void main(String[] args) {
		// �ѹ��� ���� 
		
		ArrayList<String> list = new ArrayList<String>();
		
		//1. �߰� add
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println("------------------");
		
		//2.��� size , get
		for(int i = 0; i < list.size(); i ++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("------------------");
		
		//3.���� set(�ε��� , �����Ұ�)
		list.set(1, "ddd");
		
		for(int i = 0; i < list.size(); i ++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("------------------");
		//4.���� remove(�ε���)
		list.remove(1);	
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("------------------");
	}

}