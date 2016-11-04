
package step06;

 public class Exam053_3 {

   static String greeting() {
     return "Hello, world!";
   }// "Hello, world!" 출력

   public static void main(String[] args) {
     String message = greeting(); // 문자열 Hello, world!를 리턴받는다.
     System.out.println(message);
   }
 }





/*
메서드 정의 문법
- [리턴타입] 메서드명(파라미터 선언, ...) {
명령들...
}
=> 리턴타입 : 메서드를 실행한 후 결과를 리턴할 때 그 결과의 데이터 종류
            예) void(결과 없음), int, long, String, int[], Strin[]
            [] : 배열
=> 메서드명 : 메서드를 실행할 때 사용할 이름
            예) 메서드명();
            예) int value = 메서드명(); 리턴 값이 있을 때
=> 파라미터 선언 : 메서드를 호출할 때 넘겨 준 값을 받는 변수
            예) 일반변수처럼 메서드명(int a, int b,String[] arr)





*/
