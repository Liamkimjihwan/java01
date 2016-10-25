// d프로그램 아규먼트로 두개의 수를 입력받아 둘 중 큰 수를 쿨력하시오
//=> 조건 연산자를 활용하라.
package step04.test;

 public class Test2 {
   public static void main(String[] args) {
int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);

    int result = (a > b) ? a : b; // ok
    //          a가 b보다 크다는게 참이면  a 쪽으로 값이 나옴. 거짓이면 b에 값이 나옴
    System.out.println(result);

 }
}
