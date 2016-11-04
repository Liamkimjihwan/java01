/* 주제 : 초기화 문장



*/
package step10;

import java.util.Scanner;

 public class Exam066_0 {

  static class Mytype { // 상위의 접근 1
    static int a;
    int b = 100; // 변수 만들고 바로 실행

    static {
      System.out.printf("스태틱블록: a=%d\n", Mytype.a);
      Mytype.a = 50;

    }
    {
      System.out.printf("인스턴스 블록: a=%d, b=%d\n", Mytype.a, this.b);
      this.b = 60; // 인스턴스 변수이기에
    }
    public Mytype() {
      System.out.printf("생성자: a=%d, b=%d\n", Mytype.a, this.b);
      Mytype.a = 500;
      this.b = 600;
    }
}

   public static void main(String[] args) {
  Mytype obj = new Mytype();
    System.out.printf("main(): a=%d, b=%d\n", Mytype.a, obj.b);

}
}



/*
# 초기화 문장이란?
변수 선언에 포함된 값 할당문을 말한다.
int b = 100;
여기서 b = 100; 이 문장이 초기화 문장.
초기화 문장은 변수를 생성한 후 바로 실행한다.


# 객체 생성과 메모리 준비 과정
예) Mytype obj = new Mytype();
- 클래스가 로딩되어 있지 않다면 클래스 로딩을 먼저 한다.
 => 클래스 로딩
 => 스태틱 변수 생성 및 0으로 초기값 설정 a라는 변수 = 0으로 초기값
 => 스태틱 변수에 대한 초기화 문장 실행     문장이 따로 없기 때문에 a = 0으로 계속
 => 스태틱 블록 실행                 a = 50으로 바뀜
- 인스턴스 생성
 => 인스턴스 변수 생성 및 0으로 초기값 설정   a = 50, b = 0
 => 인스턴스 변수에 대한 초기화 문장 실행     초기화 문장 int b = 100;이 있기에 b = 100으로 바뀜
 => 인스턴스 블럭 실행                      a = 50 여기서 b는 = 60으로 바뀜
 => 생성자 실행                            생성자 실행하기 전은 50, 60
                                          실행 후 a = 500, b =600으로 바뀜
- main() 실행                              a =500, b = 600 그대로

- 변수 생성 -> 0으로 설정 -> 초기화 문장 실행 -> 초기화 블록 실행 -> 생성자 실행 ->



*/
