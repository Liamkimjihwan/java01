/* 객체 지향 핵심 문법 - 클래스 정리 : 정리 2 예 (3단계)
=>  중간 계산 결과를 바깥에 두지말고 그 계산과 관련된 클래스 안에 두자!
   = 계산자체에 값이 저장되면서 계산되기 때문에 따로 적어둘 필요가 없음


*/
package step08;

 public class Exam061_3 {
   static class Calculator {
     // 스태틱 변수 : 클래스를 실행할 때(로딩할 떄) method area 영역에 자동으로 준비
     // => new 라는 명령어에서는 제외된다.
     // new 라는 명령어는 sum을 못만듦
     // => 클래스에 한 개만 존재
     static int sum = 0;
     // 리턴할 필요가 없다.
     static void plus(int a) {sum += a;}
     static void minus(int a) {sum-= a;}
     static void multiple(int a) {sum *= a;}
     static void divide(int a) {sum /= a;}
   }

   public static void main(String[] args) {
    // int sum = 0; // sum을 바깥에 두었다. 더이상 계산 결과를 담을 변수를 준비할 필요가 없다.

Calculator.plus(3);
   Calculator.plus(2);
  Calculator.multiple(3);
   Calculator.minus(1);



System.out.println(Calculator.sum);
}



}





/*
# 스태틱 변수
 - 클래스를 메서드 area 영역에 로딩할 때 ( 읽어들일 때) 자동으로 생성되는 메모리이다.
 - 따라서 클래스에 한 번만 생성된다.
 - JVM이 종료 될 때 까지


*/
