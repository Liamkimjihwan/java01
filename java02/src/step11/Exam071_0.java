/* 주제 : 상속- 상속과 메서드 호출

*/
package step11;

 public class Exam071_0 {
    static class A {
      int v1;
      void m1() {
        System.out.printf("A.m1(): %d\n", this.v1);
        // this => 해당 메서드 호출할 때의 주소값이 저장됨.
      }
    }
    static class B extends A {
      int v2;
      void m2() {
        System.out.printf("B.m2(): %d\n", this.v1);
        System.out.printf("B.m2(): %d\n", this.v2);
      }
    }


   public static void main(String[] args) {

A obj = new A(); // 2722번지라는 주소를 생성
obj.v1 = 100;
obj.m1();

B obj2 = new B(); // 3810번지라는 주소를 생성
obj2.v2 = 100;
obj2.m2();

obj2.v1 = 200;
obj2.m1(); // <-- 수퍼 클래스의 메서드를 호출 가능
           // 1) obj2에서 m1을 찾는다. 없으면 상속되어진 A 클래스로 올라가서 찾는다.
          //  2) A 클래스로 가서 찾은 this.v1에서 this는 3810번지의 주소.




}
}



/*
#상속 관계에 있는 클래스의 메서드 호출
- 레퍼런스의 타입(클래스)에서 메서드를 찾는다.
  있으면 호출한다.
- 없으면 수퍼 ㅋ르래스로 가서 메서드를 찾는다.
  있으면 호출
  없으면 다시 더 위의 수퍼 클래스로 가서 메서드를 찾는다.
  있으면 호출. 최고 꼭대기까지 도착할 때 까지 실행.
*/
