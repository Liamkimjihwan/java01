/* 주제 : 상속 - super()와 this() 잘못된 사용 : this()와 동시 사용 불가
 */
package step15;
import java.util.Scanner;

public class Exam085_1  {
   static class A {
     int v1;
     public A() {
       // super(); 
       System.out.println("A()..."); // A 생성자 호출
       v1 = 100;
     }
   }
 

 static class B extends A { 
   int v2;
   public B() { // 받는 값이 없는걸 기본 생성자,
   // super();  B()가 실행되기 전에 super();가 먼저 실행됨.
     System.out.println("B()..");
     v2 = 200;
   }
   public B(int a) {
     this(); // B(int) --> B의 기본 생성자를 호출 --> A의 기본 생성자 호출.
             // 실행 순서는 역순
     System.out.println("B(int)...");
     v2 = a;
   }

   public void m1() {
    // super(); // 컴파일 오류 ! 일반 메서드에서 생성자를 호출 할 수 없다.
   }
 }

   public static void main(String[] args) {
      B obj = new B(100); // 값이 있기 때문에 값을 받는 생성자를 호출
     System.out.println("-------------------");

   }
 }
   



/*
#








*/
