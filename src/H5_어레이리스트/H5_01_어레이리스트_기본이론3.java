package H5_��̸���Ʈ;

import java.util.ArrayList; // ����Ʈ �ؾ��Ѵ�.

public class H5_01_��̸���Ʈ_�⺻�̷�3 {
	/*
 	��̸���Ʈ�� �Ϲݹ迭 ���� ���غ���.
 */
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		String [] str = new String[100];
		int count = 0;
		
		//------------------------------------
		//[1] �߰� 
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		//------------------------------------
		
		str[count] = "aaa";
		count += 1;
		str[count] = "bbb";
		count += 1;
		str[count] = "ccc";
		count += 1;
		str[count] = "ddd";
		count += 1;
		//------------------------------------
		
		//[2] ����
		// bbb�� �����غ���.
		int removeIndex = 1;
		list.remove(removeIndex);
		
		//------------------------------------
		
		for(int i = removeIndex; i < count - 1; i++) {
			str[i] = str[i + 1];
		}
		str[count] = "";
		count -= 1;
		
		//------------------------------------
		
		//[3] ����
		// ccc �� kkk �κ��� ; // ������ ���������Ƿ� aaa , ccc , ddd 3�����ִ�. 
		int updateIndex = 1;
		String updateValue = "kkk";
		list.set(updateIndex , updateValue );
		//------------------------------------
		
		str[updateIndex] = updateValue;
		
		//------------------------------------
		
		//[4] ��� 
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("-------------------");
		for(int i = 0; i < count; i++) {
			String temp = str[i];
			System.out.println(temp);
		}
	}

}