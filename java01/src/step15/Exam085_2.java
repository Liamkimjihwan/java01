/* 주제 : 상속 - super()와 this()를 동시에 사용할 수 없다.
 */
package step15;
import java.util.Scanner;

public class Exam085_2  {
   static class A {
     int v1;
     public A() {
       // super(); 
       System.out.println("A()..."); // A 생성자 호출
       v1 = 100;
     }
     public A(int a) {
     this(); // B(int) --> B의 기본 생성자를 호출 --> A의 기본 생성자 호출.
             // 실행 순서는 역순
     System.out.println("B(int)...");
     v2 = a;
    }
   }
 

 static class B extends A { 
   int v2;
   public B() { // 받는 값이 없는걸 기본 생성자,
     System.out.println("B()..");
     v2 = 200;
   }
   public B(int a) {
  //  this() 나 super()는 생성자 블록에서 첫 문장이 되어야 한다.
    super(200); 
    // this(); // 컴파일 오류
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
