
package step04;

 public class Exam040_0 {
   public static void main(String[] args) {
// 논리 연산자(AND, OR)의 결과는 논리 값이다.
// 피연산자는 논리 값이어야 한다.
    // boolean v = 10 && 20; // 컴파일 오류 / 피연산자는 논리 값이어야하기에

    boolean v = true && true; // 논리 값이기에 && = and
System.out.println(v);
System.out.println(true && false);
System.out.println(false && false);
System.out.println(false && false);

System.out.println("----------------------");


// OR 연산자 || = OR
System.out.println(true || true);
System.out.println(true || false);
System.out.println(false || true);
System.out.println(false || false);


 }
}
