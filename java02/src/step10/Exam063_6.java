/* 주제 : 스태틱 변수와 인스턴스 변수를 초기화 시키는 블록



*/
package step10;

import java.util.Scanner;

 public class Exam063_6 {
  static class Mytype { // 상위의 접근 1
   static int a; // 스태틱 변수 2
   int b;

   static { // 스태틱 초기화 블록 , 클래스가 실행될 때 자동적으로 실행됨
    System.out.println("스태틱 초기화 블록"); // 3
    a = 20; // 4
   }

    { // 인스턴스 초기화 블록
     System.out.println("인스턴스 초기화 블록");
      this.b = 20; // this 생략 가능
      // 20으로 초기화

    }

   public Mytype() { // 생성자는 파라미터 없음.
     System.out.println("생성자 호출");
     this.b = 30;
   }
  }



   public static void main(String[] args) {
     System.out.println(Mytype.a); // 5
     Mytype.a = 100; // 6
     System.out.println(Mytype.a); // 7
     System.out.println("-------------------");

     Mytype obj;  // 레퍼런스는 인스턴스 블록 실행하고 상관없다.
                  // 레퍼런스 주소만 생성되면 인스턴스 초기화 블록이 실행되는건 아니다.
    obj = new Mytype();
    System.out.println(obj.b);

    Mytype obj2 = new Mytype();  // 인스턴스
    System.out.println(obj2.b);

}
}





/*
# 스태틱 초기화 블록
- 클래스가 로딩된 후 , 스태틱 변수가 생성 => 스태틱 초기화 블록 실행
목적 : 스태틱 변수를 유효한 값으로 초기화시키는 용도로 사용
- 이 블록은 클래스가 단 한 번 로딩되기 때문에 이 블록도 단 한번 실행 한다.
실행순서 1~ 7
스태틱 초기화 블록은 인스턴스와 관련 없다.


# 인스턴스 초기화 블록
- new 명령 실행 인스턴스 변수 생성(Heap에 생성) => 인스턴스 초기화 블록 실행
=> 생성자 호출

인스턴스 초기화 블록도 인스턴스 메서드처럼 인스턴스 주소를 담고 있는 내장 변수
this가 존재한다.

# 인스턴스 초기화 블록이 있는데 왜 생성자를 만들었을까
- 인스턴스 블록은 인스턴스를 생성할 때 우리가 원하는 임의의 값으로 초기화 시킬 수 없다.
- 즉 이 블록에 값을 전달할 방법이 없다.
- 생성자는 호출될 때 파라미터 값을 받을 수 있다.

# 생성자만 있어도 초기화가 가능한가?
- 생성자를 만들 수 없는 클래스가 존재한다.
   익명 클래스 라는 것이 있다.
이 클래스는 이름이 없기 때문에 생성자를 만들 수 없다.
생성자가 없으면 인스턴스 변수를 초기화 시킬 수 없기에 이 때 인스턴스 초기화 블록을 사용한다.







*/
