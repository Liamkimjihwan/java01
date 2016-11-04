/* 주제 : 상속 - super() : 수퍼 클래스의 생성자 호출 II
  => 모든 생성자는 수퍼 클래스의 생성자를 호출하는 명령어 (super();) 를
    생성자 블록 첫 줄에 포함한다.
    만약 개발자가 이 명령어를 작성하지 않으면 컴파일러가 자동으로 
    수퍼 클래스의 기본 생성자를 호출하는 명령어를 추가한다.
    => 수퍼 클래스의 생성자를 호출하는 명령을 명시적으로 작성해 보자.
 */
package step15;
import java.util.Scanner;

public class Exam083_1  {
   static class A {
     int v1;
     public A() {
       // 항상 첫 줄은 수퍼 클래스의 기본 생성자 호출 명령어가 있어야한다.
      super(); // A의 수퍼 클래스는 Object
       System.out.println("A()..."); // A 생성자 호출
       v1 = 100; // v1은 100으로 초기화
     }
   }
 

 static class B extends A {
   int v2;
   public B() {
     // 항상 첫 줄은 수퍼 클래스의 기본 생성자 호출 명령어가 있어야한다.
    super();
     System.out.println("B()..");
     v2 = 200;
   }
 }

static class C extends B {
  int v3;
  public C() {
    // 항상 첫 줄은 수퍼 클래스의 기본 생성자 호출 명령어가 있어야한다.
    super();
    System.out.println("C()...");
    v3 = 300;
     }
   }

   public static void main(String[] args) {
     
     A obj1 = new A(); // A 클래스 인스턴스 생성
     System.out.println("-------------------"); 

      B obj2 = new B();
     System.out.println("-------------------");

      C obj3 = new C();
     System.out.println("-------------------");

   }
 }
   



/*
#








*/
