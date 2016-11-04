/* 자바 기본 도구 사용법 - 입력도구 Scanner
=> 키보드로부터 입력 받은 특정 타입의 데이터로 잘라주는 도구
*/
package step09;

import java.util.Scanner;
// java util에 있는 Scanner
 public class Exam062_0 {
   public static void main(String[] args) {
       // 1) 키보드로부터 입력된 데이터를 우리가 원하는 형식으로 잘라주는 도구 준비
       // java.util.Scanner keyScan = new java.util.Scanner(System.in);
       Scanner keyScan = new java.util.Scanner(System.in);
      // import java.util.Scanner 가 있으면 java.util은 빼도 됨
       //2) 사용자가 입력한 데이터(값)을 줄 단위로 자른다.
       String str = keyScan.nextLine(); // 리턴 값은 한 줄 문자열이 저장된 인스턴스의 주소이다.
      //레퍼런스                       // 그 문자열을 저장하기 위한 String 변수를 줘야함
     // 3) 사용자가 입력한 값을 출력한다.
      System.out.printf("=>%s\n", str);
}
}





/*
# System.in
- 시스템 기본 입력 장치(키보드)의 정보를 갖고 있는 변수 인스턴스
-
System.outd
시스템 기본 출력장치

*/
