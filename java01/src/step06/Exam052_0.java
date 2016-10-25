
package step06;

 public class Exam052_0 {
   public static void main(String[] args) {

     int count = 5;
     int count2 = 0;

     while (count-- > 0) {
       while (count2++ <= count) {
         System.out.print("*");
       }
       System.out.println();
       count2 = 0;
     }
   }
 }





/*
메서드
- 특정 목적에 작업을 수행하는 명령어들을 별도로 묶어 놓은 것.
- 이점은 나중에 언제든 그 명령을 실행할 수 있다.
- 명령들을 관련성에 따라 분류해 놓음으로써 소스 코드의 유지보수가 쉬움. (봉다리)




*/
