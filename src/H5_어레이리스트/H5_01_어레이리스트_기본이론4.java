package H5_��̸���Ʈ;

import java.util.ArrayList; // ����Ʈ �ؾ��Ѵ�.

public class H5_01_��̸���Ʈ_�⺻�̷�4 {
	/*
 	��̸���Ʈ(������)	 	
 	[1] ��̸���Ʈ������  ������ int �� ����Ҽ�����.
 	[2] Integer �� ������ �����ؾ��Ѵ�. 
 	[3] ���� Integer ���ϰ� �������� �Ȱ���. 
 */
	public static void main(String[] args) {
		
		// Ư���ϰ� int �� ����Ҽ����� Integer �� �ٲ�����Ѵ�. 
		ArrayList<Integer> list = new ArrayList<Integer>();
				
		//�߰� 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//����
		list.remove(1);  // 20�� �����Ȱ��̴�.
		
		//����
		list.set(2, 100); 
		// �ε���2�� 10,30,40 ���� 40�� ���Ѵ�. 
		// 40�� 100���� �ٲ���̴�. 
		
		System.out.println("------------------");
		//��� 
		for(int i = 0; i < list.size(); i++) {
			int temp = list.get(i); // �������� int�� �ص��ȴ�. 
			System.out.println(temp);
		}
		System.out.println("------------------");
	}

}