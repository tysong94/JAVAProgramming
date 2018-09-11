// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 9. 클래스의 ArrayList
import java.util.ArrayList;

public class E09_ArrayList_Class {
	
	static ArrayList<OneData1> AllData = new ArrayList<OneData1>();
	
	static int sumkor = 0;
	static int sumeng = 0;
	static int summat = 0;
	static int sumsum = 0;
	static int sumave = 0;
	static final int iPerson = 20;
	
	// 데이터 만들기 메소드
	public static void DataSet()
	{
		for(int i = 0; i < iPerson; i++)
		{
			// 랜덤 매개변수를 만듬
			int studentID = i + 1;
			String name = String.format("홍길%02d", i);			
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			// OneData 객체를 생성하고 AllData 배열에 넣는다.
			AllData.add(new OneData1(studentID, name, kor, eng, mat)); 
		}
	}
	
	// 헤더 인쇄
	public static void HeadPrint()
	{
		System.out.printf("************************************\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("************************************\n");
	}
	
	// 내용 인쇄 : 하나의 OneData(객체)의 변수들을 출력
	public static void ItemPrint(int i)
	{
		OneData1 od = AllData.get(i);
		System.out.printf
		(
			"%4d %4s %3d %3d %3d  %3d  %6.2f\n",
			od.getStudentID(), od.getName(), od.getKor(), od.getEng(), od.getMat(), od.getSum(), od.getAve()
		);
		
		sumkor += od.getKor();
		sumeng += od.getEng();
		summat += od.getMat();
		sumsum += od.getSum();
		sumave += od.getAve();
	}
	
	// 꼬리 인쇄
	public static void TailPrint()
	{
		System.out.printf("************************************\n");
		System.out.printf("국어합계 %d   국어평균: %6.2f\n", sumkor, sumkor / (double)AllData.size());
		System.out.printf("영어합계 %d   국어평균: %6.2f\n", sumeng, sumeng / (double)AllData.size());
		System.out.printf("수학합계 %d   국어평균: %6.2f\n", summat, summat / (double)AllData.size());
		System.out.printf("************************************\n");
		System.out.printf("반평균합계 %d   반평균: %6.2f\n", sumave, sumave / (double)AllData.size());
	}
	
	public static void main(String[] args) {
		
		DataSet();
		HeadPrint();
		for(int i = 0; i < AllData.size(); i++)
		{
			ItemPrint(i);
		}
		TailPrint();
		
	}
	
}
