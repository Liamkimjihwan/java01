/* 자바 기본 도구 사용법 - 입력도구 Scanner
=> 키보드로부터 입력 받은 특정 타입의 데이터로 잘라주는 도구
*/
package step09;

import java.util.Scanner;
// java util에 있는 Scanner
 public class Exam062_00 {
   public static void main(String[] args) {
   boolean first = true;

  while (true) {
  int i;  // 로컬변수는 자동으로 초기화 안된다. 인스턴스만 자동으로 초기화.
  if (first) {
    i = 0;
    first = false;
  } else {
    i++;
  }
  System.out.println(i);
}
}




}




/*
# System.in
- 시스템 기본 입력 장치(키보드)의 정보를 갖고 있는 변수 인스턴스
-
System.outd
시스템 기본 출력장치

*/
