/* 주제 : 변수 초기화 - 인스턴스 변수의 초기값



*/
package step10;

import java.util.Scanner;

 public class Exam065_1 {

  static class Mytype { // 상위의 접근 1
    byte b;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
}

   public static void main(String[] args) {
      Mytype obj = new Mytype();

   System.out.println(obj.b);
   System.out.println(obj.s);
   System.out.println((int)obj.c);
   System.out.println(obj.i);
   System.out.println(obj.l);
   System.out.println(obj.f);
   System.out.println(obj.d);
   System.out.println(obj.bool);

 }
}



/*
# 초기값
즉 변수를 만든 후 기본적으로 저장되는 값을 말함.
- 스태틱 변수나 인스턴스 변수는 0 값이 저장된다.
byte.short/int/long/char = 0
float/double = 0.0
boolean = 0 = false
-로컬 변수(파라미터 변수 포함)는 초기화 되지 않는다.
따라서 초기화 시키지않은 변수를 사용하려하면 컴파일 오류 => 증명하러 위로




*/
