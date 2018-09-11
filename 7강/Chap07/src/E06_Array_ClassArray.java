// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 6. 클래스의 배열
public class E06_Array_ClassArray {
	public static void main(String[] args) {
	
	// 총 데이터(객체)의 개수를 선언
	int iPerson = 5;
	
	// OneData클래스를 원소로 하는 배열을 선언, 생성(개수만큼)
	E06_OneData[] AllData = new E06_OneData[iPerson];
	
	// 배열의 해당 원소를 해당 객체로 초기화함.
	AllData[0] = new E06_OneData("홍길01", 100, 100, 100);
	AllData[1] = new E06_OneData("홍길02", 90, 90, 90);
	AllData[2] = new E06_OneData("홍길03", 80, 80, 80);
	AllData[3] = new E06_OneData("홍길04", 70, 70, 70);
	AllData[4] = new E06_OneData("홍길05", 60, 60, 60);
	
	// 각 객체의 변수들을 출력해본다.
	for(int i = 0; i < AllData.length; i++)
	{
		System.out.printf("%s", AllData[i].getName());
		System.out.printf(" %d", AllData[i].getKor());
		System.out.printf(" %d", AllData[i].getEng());
		System.out.printf(" %d", AllData[i].getSum());
		System.out.printf(" %f", AllData[i].getAve());
		System.out.println();
	}
	
	}
}
