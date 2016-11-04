/* 객체 지향 핵심 문법 - 클래스 정리 : 정리 2 예 (4단계)
=>  계산 결과를 개별적으로 관리하려면?
=> 안타깝게도 스태틱 변수는 클래스가 로딩될 때 한번만 생성되므로 개별적으로 값을
유지할 방법이 없다.
= > 그냥 계산식을 순차적으로 실행하는 수 밖에 없다.

*/
package step08;

 public class Exam061_4 {
   static class Calculator {

     static int sum = 0;
     static void plus(int a) {sum += a;}
     static void minus(int a) {sum-= a;}
     static void multiple(int a) {sum *= a;}
     static void divide(int a) {sum /= a;}
   }

   public static void main(String[] args) {
    // 만약에 두개의 계산을 동시에 실행한다면>
    // 3+ 2 * 3 - 1 = 14
    // 4 * 5 - 7 / 2 = 6
    // Calcluator 클래스에 sum 이라는 변수가 오직 한 개만 있기 때문에
    // 동시에 여러 계산을 진행할 수 없다.
    // 무조건 계산식을 차례대로 실행해야 한다. static 변수 한계


Calculator.plus(3);
Calculator.plus(3);
Calculator.multiple(3);
Calculator.minus(1);
System.out.println(Calculator.sum);

Calculator.sum = 0;  // 위에서 계산이 끝났기 때문에 다시 초기화
   Calculator.plus(4);
   Calculator.multiple(5);
   Calculator.minus(7);
   Calculator.divide(2);
System.out.println(Calculator.sum);
}



}





/*
# 스태틱 변수
 - 클래스를 메서드 area 영역에 로딩할 때 ( 읽어들일 때) 자동으로 생성되는 메모리이다.
 - 따라서 클래스에 한 번만 생성된다.
 - JVM이 종료 될 때 까지


*/
