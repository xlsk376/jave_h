package H3_�޼��帮��1_�˰���;

import java.util.Arrays;

/*
	�Ʒ� data�� �л� ������ ���ڿ��� �����ѵ������̴�.
	������ 0~100�� �����̰� , 60���̻��� �հ��̴�.
	������ �հݻ��� ������ result �迭�� ��Ƽ� �����Ͻÿ�.
 */

class Return1{
	
	int[] run(String[] data) {
		
		int[] result = null;
		result = new int[data.length];
		int temp[] = new int[data.length];
		int index = 0;
		for(int i = 0; i < data.length; i++) {
			result[i] = Integer.parseInt(data[i]);
			if(result[i] >= 60) {
				temp[index] = result[i];
			}
		}
		result = temp;
		return result;
	}
}

public class H3_�޼��帮��1_�򰡹���_����1 {
	public static void main(String[] args) {
		Return1 re = new Return1();
		String[] data = {"34" , "43" ,"76" ,"12" , "54"};
		int result[] = re.run(data);
		System.out.println(Arrays.toString(result));
		
	}
}