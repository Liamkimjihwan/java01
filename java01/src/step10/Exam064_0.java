/* 주제 : 클래스 로딩



*/
package step10;

import java.util.Scanner;

 public class Exam064_0 {
   static { // Exam64_0도 클래스이기 때문에 static 블록을 가질수 있다.
     System.out.println("Exam064_0: static 블록 실행");
   }

  static class Mytype { // 상위의 접근 1
    static int a; // 스태틱 변수 2
    int b;

    static { // static 초기화 블록은 최초로 static 변수 static 메서드 실행할 때, new 명령어 실행할 때 실행되어짐
     System.out.println("Mytype: 스태틱 초기화 블록 실행"); // 얘가 실행안됐다는건 로딩이 안됐다는것
   }

    static void m1() {
     System.out.println("Mytype: m1()");
   }

}



   public static void main(String[] args) {
   System.out.println("main()...");



     // 1) Mytype 클래스 로딩 시키기 : 스태틱 변수 사용
    //  Mytype.a = 100; // Mytype 클래스 로딩 --> 스태틱 변수 생성 --> 스태틱 초기화 블록 실행
    // 2) Mytype 클래스 로딩 시키기 II : 스태틱 메서드 사용

    // Mytype.m1(); // 스태틱 메서드를 호출하려면 클래스가 메모리에 있어야한다.
// 3) Mytype 클래스 로딩 시키기 III : new 명령어 사용
    new Mytype(); // 주소를 안받아도 됨
      new Mytype(); // 한 번 클래스가 로딩되면 중복해서 로딩되지 않는다. 한 번만 스태틱 블록 실행.

// 4) 레퍼런스 변수 선언은 클래스를 로딩하지 않는다.
    Mytype obj = null;



}
}



/*
# 클래스 로딩
그 클래스에 스태틱 변수나 스테틱 메서드를 최초로 사용하는 시점에서 로딩된다.
또는 new 명령을 최초로 실행하는 시점에서 로딩된다.
주의
레퍼런스 변수를 만들 때는 스태틱 블록을 실행하지(클래스를 로딩하지) 않는다.
( 어차피 주소 변수이기 떄문에 클래스 로딩 x)

#
main()이 static인 이유
- JVM이 클래스를 실행할 때 해당 클래스를 로딩하고 바로 main()을 호출할 수 있도록 하기 위해
  main() 메서드는 인스턴스이면 안된다. static이 아닌 main()는 실행할 수 없다.


*/
