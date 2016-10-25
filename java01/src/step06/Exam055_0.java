
package step06;

 public class Exam055_0 {

   static void square(int value) {
     value *= value;
   }

   public static void main(String[] args) {
  int value = 3;
  square(value); // value 변수를 넘겨주는 것이 아니라 value의 값을 넘겨 주는 것


  }
 }





/*
아규먼트란
=> 메써드를 호출 할 때 넘겨주는 값을 말한다.
ex) square(30) or square(value)
이 때 30이나 value를 아규먼트라 부른다.
파라미터란
=> 메서드가 넘긴 값을 받는 로컬 변수이다.
예) void square(int value) {...}
이때 value 변수가 파라미터이다.





*/
