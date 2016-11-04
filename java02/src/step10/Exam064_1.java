/* 주제 : 클래스 로딩과 스태틱 블록의 수행



*/
package step10;

import java.util.Scanner;

 public class Exam064_1 {


  static class X {
    static int value;
    int b;

    static {
     System.out.println("X: 스태틱 초기화 블록 실행");
     X.value = Y.getValue(); // 이 순간에 Y 클래스 로딩
     System.out.printf("X: X.value=%d, Y.value=%d\n", X.value, Y.value);
   }

    static int getValue() {
     System.out.println("X: getValue()");
     return 100;
   }

}
static class Y {
  static int value;
  int b;

  static {
   System.out.println("Y: 스태틱 초기화 블록 실행"); // 얘가 실행안됐다는건 로딩이 안됐다는것
   Y.value = X.getValue();
   System.out.printf("Y: X.value=%d, Y.value=%d\n", X.value, Y.value);
 }

  static int getValue() {
   System.out.println("Y: getValue()");
   return 200;
 }

}

   public static void main(String[] args) {

    System.out.println(X.value);


}
}





/*
실행 순서 :  Exam064_1 실행 = > 공책


*/
