
package step07;

 public class Exam057_1 {
   public static void main(String[] args) {
  int[] arr1 = {10, 20, 30};// 배열은 상수가 없다.
                            // {10, 20, 30}; = new int[] {} 의 단축 문법
  int[] arr2 = {10, 20, 30};// 힙에 배열을 생성한다.

  if (arr2 == arr1) { // 같지않다.
    System.out.println("arr2 == arr1");
  }
  }
 }





/*
인스턴스
- new 명령을 통해 Heap 영역에 만든 메모리를 말한다.
예) new String("Hello"); 히면 레퍼런스가 만들어짐
 개발자들은 인스턴스를 객체라고 부름.
 s1 = new String("홍길동"); = 클래스에 객체 만들다. 인스턴스 만들었다.
 객체 및 인스턴스 넘기다 = 주소를 넘기다.
레퍼런스
- 인스턴스 주소를 저장한 변수
String s; s가 레퍼런스

s1 = new String("홍길동");

s1 이 레퍼런스




*/
