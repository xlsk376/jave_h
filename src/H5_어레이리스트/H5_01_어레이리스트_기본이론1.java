package H5_��̸���Ʈ;

import java.util.ArrayList; // ����Ʈ �ؾ��Ѵ�.

public class H5_01_��̸���Ʈ_�⺻�̷�1 {

	public static void main(String[] args) {
		/*
	 	# ��̸���Ʈ 	 	
	 	[1] �⺻ �迭�� max ���� ���س��� ���̻��� �����Ҽ��� ������. 
	 	[2] ��̸���Ʈ�� �����迭�� ���Ѵ�� ������ �����ϴ�. 
	 	
	 	# ���� 
		 	[1-1] ������ ���������� ����Ʈ �ؾ��Ѵ�. 
		 	[1-2] import java.util.ArrayList;
		 	
		 	[2-1] ���� ������ ����� Ư���ϴ�. <> �� �̿��Ѵ�. 
		 	[2-2] ArrayList<String> list = new ArrayList<String>();
	 	
	 */
		ArrayList<String> list = new ArrayList<String>();
		
		//1. �߰� add
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println("-------------");
		
		//2. ��� size �� get
		// list.size() ==> ���� 4���� �߰������Ƿ� 4�̴�. 
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i); // get(�ε���) �� ���ؼ� �ϳ��� ���������ִ�.
			System.out.println(temp);
		}
		System.out.println("-------------");
		
		//3. ���� set (�ε��� , �����Ұ�)
		// bbb �� eee �� �����غ���.	
		list.set(1, "eee");
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i); 
			System.out.println(temp);
		}
		System.out.println("-------------");
		
		//4. ���� remove(�ε���)
		//  ccc �� �����غ���.
		list.remove(2);
		
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i); 
			System.out.println(temp);
		}
		System.out.println("-------------");
	}

}