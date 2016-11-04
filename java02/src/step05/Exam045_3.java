
package step05;

 public class Exam045_3 { // 클래스 블록
   static int a = 20;
   public static void main(String[] args) { // 메서드 블록
  a = 100;
 int b = 10;
}


static void m1() {
  a = 200; // static int a = 20;에서 선언된 (클래스 블록) 것은 선언 가능
//  b = 200; // 다른 메서드 블록에 선언된 변수는 접근 no
}
}


/*

클래스 블록에 선언된 변수
=> 모든 메서드 블록에서 사용할 수 있다.






*/
