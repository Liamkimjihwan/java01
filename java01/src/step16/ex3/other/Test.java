/* 주제 : 클래스의 접근 제어 테스트
패키지 멤버만 접근을 허용하는 Exam086_1과 
public 접근 권한을 허용하는 Exam086_2의 접근을 테스트해본다.
*/
package step16.ex3.other;
import step16.ex3.*;
 public class Test {
  public static void main(String[] args) {}
 // Exam086_1 obj1;  // 레퍼런스     => 컴파일 오류 ! public으로 
                  // 공개되지 않은 클래스는 다른 패키지에서 접근할 수 없다
                  // ex3 아래에서만 사용이 가능하다.
  Exam086_2 obj2;  
}




/*
#








*/
