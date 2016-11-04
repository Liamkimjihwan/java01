/* 주제 : 예외 처리 - 예전에 예외 처리하던 방식 적용
 => c 프로그래밍 시절에는 리턴 값을 검사하여 예외를 처리하였다..

 => JVM은 자바 코드를 실행하다가 오류가 발생하면
    예외에 대한 내용을 출력한 후 즉시 실행을 멈춘다.
    => 리턴 값으로 호출한 쪽에 예외 상황을 알리는 방식의 한계가 있다.
    - 예외상황의 리턴 값이 정상적인 작업에서도 나올 수 있다.
    - 작업을 수행하는 명령과 오류를 처리하는 명령이 섞여 있어서
      유지 보수가 힘들다. 한 눈에 소스코드를 봤을 때 한 눈에 어떤 일을 하는 코드인지
      쉽게 인지하기 힘들다. = 기존 언어의 단점.
*/
package step14;
import java.util.Scanner;

 public class Exam080_1  {
   // static 메서드 준비
    static int m1(int a, int b) {  // 정수값 a, b 을 받아 나눈다는
      if ( b == 0) {
        // 0으로 나누려 한다면 호출한 쪽에 오류 상황을 알려야 한다.
        // 리턴값으로!!
        return -11119999; // 계산 값으로 나오지 않을 가능성이 있는 값을 리턴한다.
      }
      return a / b;

    }

   public static void main(String[] args)  {
     Scanner keyScan = new Scanner(System.in);
     int v1 = keyScan.nextInt(); // 넥스트 인트는
     int v2 = keyScan.nextInt();
//  항상 메서드를 호출한 후 리턴 값을 검사해야 한다.
    int result = m1(v1, v2);
    if (result == -11119999) {
      System.out.println("0으로 나눌 수 없습니다.");
    } else {
         System.out.println(result);
       }
         System.out.println("안녕히 가세요!");
      }
    }



/*
#
nextInt()
=> 사용자가 입력한 문자열에서 공백 또는 줄바꿈 코드를 만나면 그 문자열을 끊어서
숫자로 바꾼 다음 리턴한다.
단, 한 개 문자열만 끊어서 숫자로 바꾼다.








*/
