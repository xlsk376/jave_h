package H3_메서드리턴1_알고리즘;

import java.util.Arrays;

/*
		student 데이터는  차례대로 ==>  이름 , 지역 , 번호 를 나타낸다.
		score 데이터는 ==>  번호 국어 , 수학 , 영어 을 나타낸다.			
		아래순서대로 전체 학생 출력  
		[학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균] 
 */
// result[4][8] 총학생 4명, 범주(catagory) 8개
class Return4{	
	String[][] run(String[][] student , String[][] score) {
		String[][] result = null;
		result = new String[student.length][8];
		int total = 0;
		double avg = 0;
		for(int i = 0; i < student.length; i++) {
			result[i][0] = student[i][2];
			result[i][1] = student[i][0];
			result[i][2] = student[i][1];
			int index = 3;
			for(int j = 1; j < score.length; j++) {
				if(student[i][2].equals(score[j][0])) {
					total += Integer.parseInt(score[j][2]);
					result[i][6] = total + "";
					String temp = score[j][1]; 
					result[i][index] = temp;
					index += 1;
				}
			}
			avg = total/3;
			result[i][7] = avg + "";
		}
		return result;
	}
}

public class H3_메서드리턴1_평가문제_리턴4 {
	public static void main(String[] args) {

		Return4 re = new Return4();
		
		String [][] student = {
				{"김철만","신촌","1001"}, 
				{"오상덕","강남","1002"},
				{"민철이","대치","1003"} ,
				{"유재석","강동","1004"}};
		String[][] score = {
				{"번호","과목","점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
				
		String result[][] = re.run(student, score);
		System.out.println(Arrays.deepToString(result));
		
	}
}