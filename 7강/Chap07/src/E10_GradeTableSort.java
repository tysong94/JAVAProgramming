// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 10. 다페이지 성적 집계표
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class E10_GradeTableSort {
	
	// OneData ArrayList 만들기
	static ArrayList<OneData2> AllData = new ArrayList<OneData2>();
	
	// 변수 선언
	static int pkorsum = 0;			// 현재 페이지 합계 변수
	static int pengsum = 0;
	static int pmatsum = 0;
	static int ptotsum = 0;
	static int pavesum = 0;
	static int pitemcount = 0;
		
	static int sumkor = 0;				// 누적 페이지 합계 변수
	static int sumeng = 0;
	static int summat = 0;
	static int sumsum = 0;
	static int sumave = 0;
	static int aitemcount = 0;
	
		
	// 총 데이터 생성
	public static void DataSet(int personNum)
	{
		for(int i = 0; i < personNum; i++)
		{
			int studentID = i + 1;										// 랜덤 매개변수를 만듬
			String name = String.format("홍길%02d", i);			
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			AllData.add(new OneData2(studentID, name, kor, eng, mat)); 	// OneData 객체를 생성하고 AllData 배열에 넣는다.
		}
	}
	
	// 총 데이터 정렬하기
	public static void DataSort()
	{
		Comparator<OneData2> kijun = new Comparator<OneData2>()
		{
			public int compare(OneData2 a1, OneData2 a2)
			{
				return (a2.getSum() - a1.getSum());
			}
		};
		Collections.sort(AllData, kijun);
	
		for(int i = 0; i < AllData.size(); i++)		// 번호 다시 바꾸어서 넣기.
		{
			AllData.get(i).setStudentID(i+1);
		}
	}
	
	
	// 헤더 인쇄
	public static void HeadPrint(int page)
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.printf("                  성적집계표                    \n");
		System.out.printf("PAGE : %d                     %s\n", page, sdf.format(cal.getTime()));
		System.out.printf("================================================\n");
		System.out.printf("번호   이름     국어   영어   수학   합계   평균\n");
		System.out.printf("================================================\n");
	}
	
	// 내용 인쇄 : 하나의 OneData의 변수들을 출력
	public static void ItemPrint(int i)
	{
		OneData2 od = AllData.get(i);
		System.out.printf
		(
			"%03d    %-5s%6d%7d%7d%7d%7.0f\n",
			od.getStudentID(), od.getName(), od.getKor(), od.getEng(), od.getMat(), od.getSum(), od.getAve()
		);
		
		pkorsum += od.getKor();
		pengsum += od.getEng();
		pmatsum += od.getMat();
		ptotsum += od.getSum();
		pavesum += od.getAve();
		pitemcount ++;
				
		sumkor += od.getKor();
		sumeng += od.getEng();
		summat += od.getMat();
		sumsum += od.getSum();
		sumave += od.getAve();
		aitemcount ++;
	}
	
	// 꼬리 인쇄
	public static void TailPrint()
	{
		// 현재 페이지 인쇄
		System.out.printf("================================================\n");
		System.out.printf("현재페이지\n");
		System.out.printf
		(
			"%-11s%7d%7d%7d%7d%7d\n", 
			"합계", pkorsum, pengsum, pmatsum, ptotsum, pavesum
		);
		System.out.printf
		(
			"%-11s%7.0f%7.0f%7.0f%7.0f%7.0f\n",
			"평균", pkorsum / (double)pitemcount, pengsum / (double)pitemcount, pmatsum / (double)pitemcount, ptotsum / (double)pitemcount, pavesum / (double)pitemcount
		);
		pkorsum = 0;
		pengsum = 0;
		pmatsum = 0;
		ptotsum = 0;
		pavesum = 0;
		pitemcount = 0;
		
		// 누적 페이지 인쇄
		System.out.printf("================================================\n");
		System.out.printf("누적페이지\n");
		System.out.printf
		(
			"%-11s%7d%7d%7d%7d%7d\n",
			"합계", sumkor, sumeng, summat, sumsum, sumave
		);
		System.out.printf
		(
			"%-11s%7.0f%7.0f%7.0f%7.0f%7.0f\n",
			"평균", sumkor / (double)aitemcount, sumeng / (double)aitemcount, summat / (double)aitemcount, sumsum / (double)aitemcount, sumave / (double)aitemcount
		);
		System.out.printf("\n\n");
	}
	
	public static void main(String[] args) {
		
		// 데이터 설정
		DataSet(10);	// 데이터 생성
//		DataSort();	// 데이터 정렬
		
		// 항목 수, 페이지 수 선언
		int pageitemnum = 3; 								// 페이지당 항목 수
		int allPage = AllData.size() / pageitemnum;			// 전체 페이지 
		if(AllData.size() % pageitemnum !=0) { allPage++; }
		int startindex = 0;									// 시작 인덱스 세팅
					
		// 출력
		for(int Page = 1; Page <= allPage; Page++) 						// 처음 페이지부터 마지막 페이지까지
		{
			
			HeadPrint(Page);											// 헤더 인쇄
			
			for(int i = startindex; i < startindex + pageitemnum; i++)	// 시작 데이터부터 항목 수만큼 데이터 인쇄
			{
				if(i == AllData.size()) 
				{
					break;
				}
				else
				{
					ItemPrint(i);
				}			
			}
						
			TailPrint();										// 꼬리 인쇄
			
			startindex = startindex + pageitemnum;						// 시작 데이터 변경
		}
	
	}
	
}
