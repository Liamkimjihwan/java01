
package step05;

 public class Exam045_4 { // 클래스 블록
   static int a = 20;
   public static void main(String[] args) { // 메서드 블록
int a = 200;// 클래스 블록에 선언된 변수는 같은 이름으로 메서드 안에 변수를 선언 가능
System.out.println(a); // 출력되는 a는 가장 가까운 변수이다.

// 클래스 블록에 선언된 변수를 쓰려면?
// 클래스명.a 로 출력!
System.out.println(Exam045_4.a);

}


static void m1() {
int a = 300;
}
}


/*

클래스 블록에 선언된 변수
=> 모든 메서드 블록에서 사용할 수 있다.






*/
