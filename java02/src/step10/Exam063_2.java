/* 스태틱 메서드와 인스턴스 메서드 -
*/
package step10;

import java.util.Scanner;

 public class Exam063_2 {
  static class Mytype {
    static void m1() {
      System.out.println("스태틱 메서드 호출...");
    }
     void m2() {
      System.out.println("인스턴스 메서드 호출..");
    }
  }


   public static void main(String[] args) {

Mytype.m1(); // 스태틱 메서드 호출

// Mytype.m2(); //  인스턴스 메서드는 인스턴스 주소를 주지않고 호출 불가능. 컴파일 오류

Mytype obj = new Mytype(); // 인스턴스 값이 없더라도 새로 만들어줘야 함
obj.m2(); // 인스턴스 주소가 있어야 호출 가능.
         // 인스턴스 안에 변수가 한 개도 없더라도 주소를 만들어서 주소를 부여해야함.


// 인스턴스 변수도 없는데 인스턴스를 생성하고
// 그 인스턴스 주소를 사용해서 인스턴스 메서드를 호출하는 것은 의미 없는 코딩 아닌가?
// 그렇다. 이건 문법 설명하기 위해 만든 것이다.
// 실무에서는 인스턴스 변수도 없는 인스턴스를 만들어 인스턴스 메서드를 호출할 일 없다.
// 만약 인스턴스 변수 없이 작업을 수행하는 메서드라면,
// 스태틱 메서드로 만들어야 한다.

// Mytype obj2 = null;
// obj2.m2();  // obj2에는 인스턴스 주소가 없다. new로 주소를 정해줘야함.

}
}





/*
# 스태틱 메서드(= 클래스 메서드)
- 호출할 때 클래스 이름(주소)을 줘야 한다.

#인스턴스 메서드
-호출할 때 인스턴스 주소 줘야한다.
- 인스턴스 변수가 한 개라도 없더라도 인스턴스를 만들어서 호출해야 한다.

# 메서드는 언제 생성되나
메서드는 클래스가 로딩될 때 메서드 에리어에 자동적으로 올라옴.
생성은 적절하지 못한 표현
- 인스턴스 메서드는?
인스턴스 메서드이든, 스태틱 메서드이든 똑같다.
인스턴스 메서드에 인스턴스 라는 말이 있어서
인스턴스를 생성할 때 로딩되는 것으로 착각할 수 있음.
인스턴스 주소를 가지고 호출해야 한다는 의미에서 이름을 부여한 것일 뿐.




*/
