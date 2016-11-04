
package step06;

 public class Exam054_3 {

   static void score(int[] values, String name) { // [] 배열 넣으면 무조건 [] 넣어야함
// int 값 리턴 합계이기에 sum, sum은 int값으로 구하기 때문에 int, value는 값
     int sum = 0;
     for (int value : values) { //values 배열의 값을 value에 저장.
       sum += value;
     }
     // void가 없기에 리턴 값 없다. return 값 없앰
     System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);
   }


   // static void score2(int... values, String name) { // 컴파일 오류
    static void score2(String name, int... values) {
     int result = 0;
     for (int value : values) {
       result += value;
     }
    System.out.printf("%s님의 총점은 %d입니다.\n", name, result);
   }


   public static void main(String[] args) {
    score(new int[]{100,90,80}, "홍길동");
    //score2(100,90,80, "임꺽정");
    score2("임꺽정", 100,90,80);
   }
 }






/*
가변개수 아규먼트 사용시 유의
// 가변개수 문자열은 뒤에 다른 변수 적을 수 없음. ex) (int... values, String name)
// 반드시 맨 마지막에 와야 한다.
- 가변개수 아규먼트를 여러개 선언할 수 없다.
ex) int... value, String...name

배열 파라미터의 이점

- 배열 변수 다음 다른 파라미터 선언 가능
- 여러개의 파라미터 배열을 선언할 수 있다.




*/
