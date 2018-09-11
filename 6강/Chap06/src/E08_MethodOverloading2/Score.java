//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 8. 메소드 오버로딩(점수)
package E08_MethodOverloading2;

public class Score {
	
	void score(int kor, int eng, int mat) {
			
		int sum = kor + eng + mat;
		int ave = sum / 3;
		
		System.out.printf("3월 성적표\n");
		System.out.printf("=========================================\n");
		System.out.printf("이름   국어 영어 수학 총점 평균\n");
		System.out.printf("=========================================\n");
		System.out.printf("송태양  %d  %d  %d  %d  %d\n", kor, eng, mat, sum, ave);
		System.out.println();
	}
	
	void score(int kor, int eng, int mat, int sci) {
		
		int sum = kor + eng + mat + sci;
		int ave = sum / 4;
		
		System.out.printf("4월 성적표\n");
		System.out.printf("=========================================\n");
		System.out.printf("이름   국어 영어 수학 과학 총점 평균\n");
		System.out.printf("=========================================\n");
		System.out.printf("송태양  %d  %d  %d  %d  %d  %d\n", kor, eng, mat, sci, sum, ave);
		System.out.println();
	}
	
	void score(int kor, int eng, int mat, int sci, int soc) {
		
		int sum = kor + eng + mat + sci + soc;
		int ave = sum / 5;
		
		System.out.printf("5월 성적표\n");
		System.out.printf("=========================================\n");
		System.out.printf("이름   국어 영어 수학 과학 사회 총점 평균\n");
		System.out.printf("=========================================\n");
		System.out.printf("송태양  %d  %d  %d  %d  %d  %d  %d\n", kor, eng, mat, sci, soc, sum, ave);
		System.out.println();
	}

}
