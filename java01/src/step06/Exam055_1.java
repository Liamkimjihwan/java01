
package step06;

 public class Exam055_1 {

   static void square(int value) {
     value *= value;
System.out.printf("square():%d\n", value);
   }

   public static void main(String[] args) {
     int value = 3;
     square(value); // call by value.
                    // value 변수 넘기는것이 아니라 변수에 들어있는 값을 넘기기 때문
                    // 따라서 square() 메서드에서는 main()의 value 변수에 접근 no
  System.out.printf("main():%d\n", value);
  }
 }





/*
call by value
-메서드를 호출할 때 넘겨주는 것이 일반 값일 경우





*/
