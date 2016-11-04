/* 주제 : 상속 - super() : 수퍼 클래스의 생성자를 반드시 명시해야할 경우 II
 => 수퍼 클래스의 생성자 중에서 호출할 대상을 명시적으로 지정한다.
 super(값, 값, ...); 을 줌으로서 
 => 수퍼 클래스의 생성자를 호출할 때 어떤 값을 주느냐에 따라 호출할 생성자가 결정된다.
   => 오버로딩 처리 방식.
 */
package step15;
import java.util.Scanner;

public class Exam084_1  {
  // A 클래스는 기본 생성자가 없다.
   static class A {
     int v1;
     public A(int a) {
       System.out.println("A(int)..."); // A 생성자 호출
       v1 = a; // ina a 값 받아서 v1에 집어넣는
     }
   }
 

 static class B extends A {
   int v2;
   public B() {
     super(100); // 수퍼 클래스의 int 값 받는 생성자를 호출한다.
     // 여기에 수퍼 클래스 A의 기본 생성자를 호출하는 코드가 자동으로 삽입된다.
     // super(); < --- 바로 이것 때문에 컴파일 오류가 발생한다.
     System.out.println("B()..");
     v2 = 200;
   }
 }

static class C extends B {
  int v3;
  public C() {
    System.out.println("C()...");
    v3 = 300;
     }
   }

   public static void main(String[] args) {
      C obj = new C();
     System.out.println("-------------------");

   }
 }
   



/*
#








*/
