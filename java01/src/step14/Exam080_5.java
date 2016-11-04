/* 주제 : 예외 처리 - Exception 예외에 대해 자세히
  = > 개발자가 애플리케이션에서 예외 상황을 알릴 때 사용한다.
  => 메서드 선언부에 반드시 어떤 예외를 던지는지 선언해야 한다.

 */
package step14;
import java.util.Scanner;

 public class Exam080_5  {
   // 어떤 예외를 던지는지 선언하지 않으면 컴파일 오류

    static void m1()  {
     // throw new Exception("예외 발생!"); // 컴파일 오류
      }

    // 예외를 던진다고 선언해야 된다. 필수사항이다.
     static void m2() throws Exception{
        throw new Exception("예외 발생!"); // 패키지가 없으니 java.lang 임
      }
    
   public static void main(String[] args) throws Exception {
     // Exception 예외를 던지는 메서드를 호출할 때는 
     // 반드시 예외 처리해야 한다. try ~ catch 문법을 사용
     // 1) try ~ catch 를 사용하여 예외 처리
    /*
     try {
       m2();
     }  catch (Exception e) {
       System.out.println("예외가 발생했어요!");
     }
*/

// 2) 만약 여기서 예외를 처리하기 싫다면 
// 이 메서드의 선언부에 예외가 발생한다고 선언하라.
// 즉 throws 문장을 메서드 선언부에 붙여라.
       m2();
      }
    }



/*
#
nextInt()
=> 사용자가 입력한 문자열에서 공백 또는 줄바꿈 코드를 만나면 그 문자열을 끊어서
숫자로 바꾼 다음 리턴한다.
단, 한 개 문자열만 끊어서 숫자로 바꾼다.








*/
