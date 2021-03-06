/* 주제 : 예외 처리 - Error 예외의 편리함?!
=> Error 예외를 발생시키는 메서드를 사용할 떄
  중간 경유지에 위치한 메서드들은 굳이 예외가 발생한다는 것을
  선언할 필요는 없다.
=> 중간 경유지에 있는 메서드가 Error 예외를 처리하지 않으면,
   자동으로 호출자에게 전달된다.
   = > 용도!
    스텔스 모드로 최상위 호출자에게 예외를 전달하고 싶을 때 유용하다.
    중간 경유지에 있는 메서드들은 추가로 throws를 선언할 필요가 없다. 
    어떤 예외를 던지는지 => 코딩 단순화
    => 실무에서는 가능한 예외처리를 강제하는 것이 시스템 안정성에 좋기 때문에
       Error 보다는 Exception을 사용할 것을 권장하고 있다.
 */
package step14;
import java.util.Scanner;

 public class Exam080_7  {
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
        throw new Error("예외발생!");
      }
    
   public static void main(String[] args)  {
       try {

       m1();
       } catch (Error e) {
         System.out.println(e.getMessage());
       }


      }
    }



/*
#








*/
