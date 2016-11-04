/* 주제 : 예외 처리 - Error는 애플리케이션에서 사용하지 말라
=>  Error의 스텔스 모드는...
=> 자바는 애플리케이션 개발자를 위해 Error처럼 스텔스 모드로 예외를 전달하는
   클래스를 제공해준다.
=> 조건 : 모든 애플리케이션 예외는 Exception 이어야 한다.
   해결방법
  Exception의 서브 클래스이면 가능한 일이다.
  java.lang.RuntimeEXception 이라는 예외 클래스이다.
  런타임의 조상이 익셉션이지만 동작은 Error와 같은 동작을 함.
  = > 스텔스 모드의 장점
      예외를 즉시 현장에서 처리하지 않고, 최상위 호출자에게 전달하여 
      일괄적, 일관되게 예외를 처리하고 싶을 때  사용하는 방법이다.
 */
package step14;
import java.util.Scanner;
 public class Exam080_8  {
    static void m1()  { 
        m2();
      }
     static void m2() {
        m3();
      }
       static void m3()  { // m4()가 어떤 예외를 던지는지 관심 없다. 
        m4(); // try catch를 안쓴다면 메서드에 선언을 해줘야함. m3() m2() m1() 동일
      }
       static void m4() {
        throw new RuntimeException("예외발생!");
      }
    
   public static void main(String[] args)  {
       try {

       m1();
       } catch (Exception e) {
         System.out.println(e.getMessage());
       }


      }
    }



/*
#








*/
