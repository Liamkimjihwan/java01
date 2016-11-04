/* 주제 : 상속 - super() : 생성자 호출의 순서
=> 어떤 클래스의 생성자를 호출하면 항상 수퍼 클래스의 생성자를 호출하게 된다.
   그래서 생성자의 실행은 최상위 수퍼 클래스부터 아래로 실행되는 것이다.
=> 표현할 때 주의할 점!
  1) 생성자는 수퍼 클래스부터 호출됩니다.( XXX ) 
  - 생성자 호출은 현재 클래스부터 상위 클래스로 따라 올라가면서 호출이 된다
  - 그리고 실행은 수퍼 클래스부터 현재 클래스의 생성자까지 내려오면서 실행 된다. 
 */
package step15;
import java.util.Scanner;

public class Exam083_3  {
   static class A {
     int v1;
     public A() {
    
       System.out.println("A()..."); // A 생성자 호출
       v1 = 100; // v1은 100으로 초기화
     }
   }
 

 static class B extends A {
   int v2;
   public B() {
         // super(); 명령어가 없으면 다음 코드를 자동으로 삽입한다.
       // 그래서 다음 코드를 생략해도 된다.
       // super();
     System.out.println("B()..");
     v2 = 200;
   }
 }

static class C extends B {
  int v3;
  public C() {
        // super(); 명령어가 없으면 다음 코드를 자동으로 삽입한다.
       // 그래서 다음 코드를 생략해도 된다.
       // super();
    System.out.println("C()...");
    v3 = 300;
     }
   }

   public static void main(String[] args) {
      C obj3 = new C(); // C() 인스턴스 생성.
                        // new C() C 클래스 기본생성자 호출했음. = > public c()로 감. super() 호출 > class B > super() > A > super() > Object
                       // 실행은 Object부터 아래로 A() 출력 > B() 출력

   }
 }
   



/*
#








*/
