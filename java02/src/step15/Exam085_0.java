/* 주제 : 상속 - super()의 잘못된 사용 : 일반 메서드에서 수퍼 클래스의 생성자를 호출할 수 없다.
 */
package step15;
import java.util.Scanner;

public class Exam085_0  {

   static class A {
     int v1;
     public A() {
       System.out.println("A()..."); // A 생성자 호출
       v1 = 100;
     }
   }
 

 static class B extends A {
   int v2;
   public B() {
     System.out.println("B()..");
     v2 = 200;
   }

   public void m1() {
     super(); // 컴파일 오류 ! 일반 메서드에서 생성자를 호출 할 수 없다.
   }
 }

   public static void main(String[] args) {
      B obj = new B();
     System.out.println("-------------------");

   }
 }
   



/*
#








*/
