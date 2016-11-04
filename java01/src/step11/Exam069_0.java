/* 주제 : 상속- 상속 사용법

*/
package step11;

 public class Exam069_0 {
    static class A {}
    static class B extends A {}
    static class C extends A {}
    static class D extends B {}
   public static void main(String[] args) {
    KimjiCalculator calc = new KimjiCalculator();



}
}



/*
# 상속 문법
class 클래스명 extends 부모클래스명 {}

# 상속 계층도 (class hierarchy)

A라는 클래스에 B  B라는 클래스와 C라는 클래스가 있음.
A
-> B (패런츠)
 -> D 클래스(차일드) 있음.
-> C
*/
