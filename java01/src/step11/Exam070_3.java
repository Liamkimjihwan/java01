/* 주제 : 상속- 인스턴스 메서드 오버라이딩

*/
package step11;

 public class Exam071_1 {
    static class A {
      int v1 = 10;
      int v3 = 10;
      void m1() {
       System.out.printf("A.m1(): v1=%d\n", this.v1);
        System.out.printf("A.m1(): v3=%d\n", this.v3);
        // this => 해당 메서드 호출할 때의 주소값이 저장됨.
      }
    }
    static class B extends A {
      int v1 = 100;
      int v2 = 100;
      void m2() {
        System.out.printf("B.m2(): v1=%d\n", this.v1);
        System.out.printf("B.m2(): v2=%d\n", this.v2);
        System.out.printf("B.m2(): v3=%d\n", this.v3);
      }
    }


   public static void main(String[] args) {

A obj = new A(); // 2722번지라는 주소를 생성
obj.m1();
System.out.printf("=-----------------\n");

B obj2 = new B(); // 3810번지라는 주소를 생성
obj2.m2();
obj2.m1(); // <-- 수퍼 클래스의 메서드를 호출 가능
           // 1) obj2에서 m1을 찾는다. 없으면 상속되어진 A 클래스로 올라가서 찾는다.
          //  2) A 클래스로 가서 찾은 this.v1에서 this는 3810번지의 주소.





}
}



/*
#인스턴스 변수 오버라이딩(덮어쓰기)
- 수퍼 클래스의 변수를 자식 클래스에서 재정의 하는 것.
- 즉 수퍼 클래스의 변수 이름과 같은 인스턴스 변수를 만들 수 있다는 것이다.
- 따라서 인스턴스를 생성할 때
  이전과 동일하게 모든 직계 조상의 인스턴스 변수를 만든다. 이름이 같더라도 상관없다.

# 인스턴스 변수 찾는 순서
1) 자신ㅇㅣ 속한 클래스에 인스턴스 변수일 경우
- 자신이 속한 클래스의 설계도로 만든 인스턴스 변수를 먼저 사용한다.
2) 자신이 속한 클래스의 인스턴스 변수가 아닐 경우
- 수퍼 클래스에 인스턴스 변수를 사용한다.
레퍼런스 타입에 선언된 인스턴스 변수를 먼저 찾는다.

*/
