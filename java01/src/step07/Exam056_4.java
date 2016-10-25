
package step07;

 public class Exam056_4 {
   static void m1(String p1) {
    String s = "홍길동";
    if (p1 == s) {
      System.out.println("p1 == s");
    }

   }
   public static void main(String[] args) {
   String s1 = "홍길동";
    m1(s1);



 }
}




/*
상수 문자열과 메서드
- 어떤 메서드에서 문자열을 만들어도 이미 Constants pool에 같은 값을 갖는 스트링 객체가
있다면 그 객체(인스턴스)의 주소를 리턴한다.
=> 메모리 절약을 위해 상수 스트링 인스턴스는 한 번만 생성.



*/
