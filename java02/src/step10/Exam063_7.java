/* 주제 : 스태틱 변수와 인스턴스 변수를 초기화 시키는 블록 II



*/
package step10;

import java.util.Scanner;

 public class Exam063_7 {
  static class Mytype { // 상위의 접근 1
   static int a; // 스태틱 변수 2
   int b;

   static {System.out.println("스태틱 초기화 블록");}
    {System.out.println("인스턴스 초기화 블록");} // 인스턴스 블록

    static {System.out.println("스태틱 초기화 블록2");}
     {System.out.println("인스턴스 초기화 블록2");} // new 명령어 실행 후
     // 생성자 실행 전 초기화 시킴.

  }



   public static void main(String[] args) {
     System.out.println(Mytype.a); // 5


     Mytype obj;  // 레퍼런스는 인스턴스 블록 실행하고 상관없다.
                  // 레퍼런스 주소만 생성되면 인스턴스 초기화 블록이 실행되는건 아니다.
    obj = new Mytype();
    System.out.println(obj.b);


}
}





/*
# 스태틱 초기화 블록과 인스턴스 초기화 블록
 - 여러개가 존재할 수 있고,




*/
