/* 객체 지향 핵심 문법 - 클래스 정리 : 정리 2 예 (6단계)
=> 인스턴스 변수를 메서드에서 쉽게 다루고 싶다.
 => 인스턴스 메서드로 만들라
  => static을 붙이지 마라.
   => 단, 호출할 때 인스턴스 주소를 메서드 앞에ㅔ 둔다.
    => 메서드는 내장 변수 this에 그 주소를 저장한다.
*/
package step08;

 public class Exam061_6 {
   static class Calculator {

     int sum = 0; // 인스턴스 변수로 선언 static 제거
    // 인스턴스 메서드 static 제거, 메서드 내장 변수 this에 인스턴스 주소가 전달되기에
    // 파라미터로 인스턴스 주소를 굳이 받을 필요 없다. = Calculator that 제거
    void plus(int a) {this.sum += a;}
     void minus(int a) {this.sum-= a;}
     void multiple(int a) {this.sum *= a;}
     void divide(int a) {this.sum /= a;}
   }
   // static은 new의 대상이 아님.

   public static void main(String[] args) {
    // 만약에 두개의 계산을 동시에 실행한다면>
    // 3+ 2 * 3 - 1 = 14
    // 4 * 5 - 7 / 2 = 6

// 두개의 계산식의 결과를 저장할 메모리를 따로 준비한다.
Calculator c1 = new Calculator();
Calculator c2 = new Calculator();


c1.plus(c1, 3); // c1 메모리에 대해서 연산 수행하라
c2.plus(c2, 4);
c1.plus(c1, 2);
c2.multiple(c2, 5);
c1.multiple(c1, 3);
c2.minus(c2, 7);
c1.minus(c1, 1);
c2.divide(c2, 2);



  // Calculator.sum = 0;  // 초기화 안해도 됨
  System.out.println(c1.sum);
  System.out.println(c2.sum);
}



}





/*



*/
