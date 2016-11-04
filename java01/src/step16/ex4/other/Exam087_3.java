/* 주제 : 자손 클래스에서 멤버에 접근하기.
=> 주의!
   protected 멤버의 자손이 접근할 때는 오직 자기 메모리인 경우만 허용한다.

*/
package step16.ex4.other;
import step16.ex4.*;
public class Exam087_3 extends Exam087_0 {
   public static void main(String[] args) {
     Exam087_0 obj = new Exam087_0();
      // obj.v1 = 1000; // 컴파일 오류 . private은 다른 클래스에서 접근 불가능
      // obj.v2 = 2000; // 컴파일 오류
      // obj.v3 = 3000; // 컴파일 오류 현 클래스에서 만들어진 메모리가 아니기에
                        // Exam087_3 객체의 메모리가 아니다.
      obj.v4 = 4000;


   Exam087_3 obj2 = new Exam087_3();

       //obj2.v1 = 1000; // 컴파일 오류 . private은 다른 클래스에서 접근 불가능
       //obj2.v2 = 2000; // 컴파일 오류
       obj2.v3 = 3000; // Exam087_3 객체의 메모리이다. 현 클래스에서 만들어진 메모리
       obj2.v4 = 4000;
   }
 }
 



/*
#








*/
