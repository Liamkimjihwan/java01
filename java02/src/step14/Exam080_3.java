/* 주제 : 예외 처리 - throw로 던질 수 있는 객체
  => java.lang.Throwable 객체를 던질 수 있다.
  lang 패키지에 있는 Throwable 에 서브 클래스를 다 던질 수 있다는.
  1) Error 
           -> 시스템 예외 객체라고 부른다.
           -> 어플리케이션에서 던지는게 아니라 JVM에서 던지는 객체이다.
           -> 개발자가 사용하진 않는다.
           -> 해당 메서드 선언부에 Error를 던진다고 선언할 필요 없다. 선택 사항.
           -> 메서드를 사용하는 개발자에게 예외처리를 강요하지 않는다.
              예외 처리를 할지 말지는 개발자의 선택이다.
  2) Exception
         -> 애플리케이션 예외 객체라고 부른다.
         -> 애플리케이션에서 던진다.
         -> 즉 개발자가 특정 예외 상황에 대해 던질 때 사용하는 객체(클래스)이다.
         = Error 쓰지 않는다 
         -> 그러나 Error와 다르게 메서드 선언부에 반드시 어떤 예외 객체를 던지는 지 선언해야 한다. 반드시
            문법) 리턴타입 메서드명(.....) throws 예외클래스명, 예외클래스명,...{}
            예) void test(int a, int b) throws FileNotFoundException, ProtocolExveption
         -> 메서드를 사용하려는 개발자에게 예외처리를 강요하는 효과가 있다.
 */
package step14;
import java.util.Scanner;

 public class Exam080_3  {

    static int m1(int a, int b) {
      if ( b == 0) {
      throw new Error("0으로 나눌 수 없습니다."); // 패키지가 없으니 java.lang 임
      }
      return a / b;

    }
     static int m2(int a, int b) throws Exception{
      if ( b == 0) {
        throw new Exception("0으로 나눌 수 없습니다."); // 패키지가 없으니 java.lang 임
      }
      return a / b;
    }
     static int m3(int a, int b) {
      if ( b == 0) {
      // throw는 반드시  java.lang.Throwable 객체만 던질 수 있다.
      // 당연히 Throwable 서브 클래스도 포함하는 것이다.
      //  throw new String("0으로 나눌 수 없습니다."); // 컴파일 오류
      }
      return a / b;

    }

   public static void main(String[] args) {
     Scanner keyScan = new Scanner(System.in);
     int v1 = keyScan.nextInt(); // 넥스트 인트는
     int v2 = keyScan.nextInt();

   // 혹시 m1()을 실행 시켰는데 m1()에서 예외를 던진다면
   // 그 예외를 받는 코드를 넣어야 한다.

    try { // < == 블록 안에는 원래 하려했던 작업코드(명령)을 작성 한다.
     int result = m1(v1, v2);
         System.out.println(result);
       } catch (Error e) { // catch 블록 안에는 예외 상황을 처리하는 코드를 둔다.
         System.out.println(e.getMessage()); // e 객체에 들어있는 예외 내용을 출력한다.

        } finally { // 예외가 정상적으로 수행하던, 예외가 발생하던 상관없이 무조건
                  // 실행되어야하는 코드를 작성.
         System.out.println("안녕히 가세요!");
       }
      }
    }



/*
#
nextInt()
=> 사용자가 입력한 문자열에서 공백 또는 줄바꿈 코드를 만나면 그 문자열을 끊어서
숫자로 바꾼 다음 리턴한다.
단, 한 개 문자열만 끊어서 숫자로 바꾼다.








*/
