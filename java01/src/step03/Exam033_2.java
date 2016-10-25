package step03;

 public class Exam033_2 {
   public static void main(String[] args) {
//정수
int[] scores = new int[3];
scores[0] = 100; // 배열 메모리의 번호는 0번부터 시작한다.
scores[2] = 100;
scores[1] = 100;

// 배열의 인덱스 범위를 벗어나면 실행 오류, 컴파일은 가능
//scores[3] = 100; // 배열의 인텍스 범위는 0 ~(크기=length -1)
//주의
// 배열을 만들지 않고 단지 배열 이름 변수만 선언한 다음에 사용하면 오류
//int[] scores2;
//scores2[0] = 100;


//2) 배열 변수 선언과 함께 값을 저장하기
int[] scores2 = new int[] {80,81,82}; // 중괄호에 나열된 값 개수만큼 배열이 생성된다.
System.out.println(scores3[2]);

// 3) 배열 변수 선언과 함께 값을 지정할 때 new int[] 명령을 생량할 수 있다.
// 변수 선언에 어떤 종류의 메모리인지 지정되어 있기 때문에 생략이 가능한 것이다.
int[] scores3 = {80,81,82};
System.out.println(scores4[1]);

//주의 1) 배열 변수 선언과 값을 초기화 시키는 명령이 분리 되었을 때(줄바꿈)는
// new int[] 생략이 불가능
int[] scores4;
// scores5 = {80,81,82};  컴파일 오류

// 배열 변수를 선언하고 따로 초기화 시킬 때는 반드시 new int[]를 명시해야 한다.
scores6 = new int[] {80,81,82};
//주의2) 배열 선언할 때 값을 초기화시키는 명령이 있으면 배열 개수를 지정할 수 없다.
// 초기화 명령({값,값,...})에서 메모리 개수를 자동 계산할 수 있기 때문
//int[] scores7 = new int[3] {100,100,100};  //오류

   }
 }
