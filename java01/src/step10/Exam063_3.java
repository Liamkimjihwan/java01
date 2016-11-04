/* 스태틱 메서드와 인스턴스 메서드 -
레퍼런스와 스태틱 메서드 호출


*/
package step10;

import java.util.Scanner;

 public class Exam063_3 {
  static class Mytype {
    static void m1() {
      System.out.println("스태틱 메서드 호출...");
    }
     void m2() {
      System.out.println("인스턴스 메서드 호출..");
    }
  }


   public static void main(String[] args) {
Mytype obj = new Mytype();
obj.m1(); // 인스턴스 주소로 스태틱 메서드 호출 가능.
          // 그러나 코드의 가독성을 위해서는 가능한 스태틱 메서드는 클래스 주소로 호출하라.
}
}





/*
# 인스턴스 주소로 스태틱 메서드를 호출할 수 있다.
- 먼저 인스턴스 메서드를 찾는다.
없으면 스태틱 메서드를 찾는다.




*/
