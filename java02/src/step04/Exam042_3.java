// 특정 위치의 비트들의 값이 1인지 확인할 때 사용할 수 있다.
package step04;

 public class Exam042_3 {
   public static void main(String[] args) {
//java, javascript, html, css, c++, PHP, Python, perl, VB, R, Groovy
// xml, Xcala, Rubby, swift, object-c, pascal, c#, go
int language = 0b00000000_00001111_11111101_10001100;
//             0b00000000_00001000_00000000_00000000;  java
// 1은 할 줄 아는 프로그램 32비트 4바이트만 필요
// bollean으로 했다면 30바이트 필요



// java , c, c++ 을 할줄 아는 사람인지 검사하라.
// java + c + c++ =  0b00000000_00001000_11000000_00000000;
/* 계산 예)
        0b00000000_00001111_11111101_10001100
&       0b00000000_00001000_11000000_00000000
------------------------------------------------
        0b00000000_00001000_11000000_00000000
         이렇게 된다면 java와 c, c++를 할수 있다는 얘기


*/
String result = ((language & 0x0008c000) == 0x0008c000) ? "yes" : "no";
//                           0x8c00으로 생략가능.
System.out.println(result);

 }
}
