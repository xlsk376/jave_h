package H3_�޼��帮��1_�˰���;

import java.util.Arrays;

/*
	�Ʒ� data�� �л� ��ȣ�� ������ ���ڿ��� �����ѵ������̴�.
	��ȣ�� 1001������ 1004 ���̰�,
	������ 0~100�� �����̰� , 60���̻��� �հ��̴�.
	������ �հݻ��� ��ȣ�� result �迭�� ��Ƽ� �����Ͻÿ�.
 */

class Return2{
	
	int[] run(String[][] data) {	
		int[] result = null;		
		result = new int[data.length];
		int temp[] = new int[data.length];
		int index = 0;
		for(int i = 0; i < data.length; i++) {
			temp[i] = Integer.parseInt(data[i][1]);
			if(temp[i] >= 60) {
				result[index] = Integer.parseInt(data[i][0]);
				index += 1;
			}
		}
		return result;
	}
}

public class H3_�޼��帮��1_�򰡹���_����2 {
	public static void main(String[] args) {

		Return2 re = new Return2();
		
		String data[][] = {
				{"1001","34"},
				{"1002","46"},
				{"1003","81"},
				{"1004","10"},
		};
		
		int result[] = re.run(data);
		System.out.println(Arrays.toString(result));
		
	}
}