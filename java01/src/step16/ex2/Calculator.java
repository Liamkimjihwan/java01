package step16.ex2;

public class Calculator {
  // 외부에서 직접 접근하지 못하도록 막는다.
  // 막았기 때문에 result 값 리턴해주는 공개 메서드 만들어야함
  //  public int getResult(),  public void plus(int value) , public void minus(int value) Calculaotr의 멤버
  private int result;

// reasult 값을 리턴해주는 ( 꺼내주는 )  공개 메서드
  public int getResult() {
   // return this.result;
    return result; // this 생략 가능
  }

  public void plus(int value) {
    result += value;
  }

  public void minus(int value) { 
    result -= value;
  }
}