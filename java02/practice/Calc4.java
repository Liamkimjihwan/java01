
public class Calc4 {
  int result;

  // 인스턴스 메서드
  // => static을 붙이지 않는다.
  // => 인스턴스 주소는 this라는 내장 변수에 보관되어 있다.
  void plus(int a) {
    this.result += a;
  }

  void minus(int a) {
    result -= a; // 인스턴스 메서드에서 인스턴스 변수를 사용할 때
                 // this를 생략할 수 있다.
                 // this가 생략되면 먼저 인스턴스 변수를 찾아보고,
                 // 그래도 없으면 static 변수를 찾는다.
  }
}
