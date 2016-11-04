/* 주제 : 다른 클래스 멤버에 접근하기.


*/
package step16.ex4.other;
import step16.ex4.*;
public class Exam087_2 {
   public static void main(String[] args) {
     Exam087_0 obj = new Exam087_0();
     // obj.v1 = 1000; // 컴파일 오류 . private은 다른 클래스에서 접근 불가능
     // obj.v2 = 2000; // 컴파일 오류
     // obj.v3 = 3000; // 컴파일 오류
     obj.v4 = 4000; // public은 다 가능.

   }
 }
 



/*
#








*/
