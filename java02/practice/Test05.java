
public class Test05 {
  public static void main(String[] args) {
    // 계산A: 3 - 5 + 7 + 2 = ?
    // 계산B: 7 + 3 - 2 - 1 = ?


    Calc4 calcA = new Calc4();
    Calc4 calcB = new Calc4();

    // 메서드를 호출할 때 result가 들어 있는 인스턴스의 주소를 알려준다.
    // => 아규먼트로 전달하는 대신, 메서드 호출할 때 앞 부분에 선언한다.
    // => 이렇게 전달된 주소는 instance 메서드의 내장 변수인 this에 보관된다.
    // => 주의! static 메서드는 this라는 내장 변수가 없다.
    // => 보기에도 직관적이다.
    //
    calcA.plus(3); //<== calcA에 대해 plus()를 실행하라!
    calcB.plus(7); //<== calcB의 메모리를 가지고 plus()를 수행하라!
    calcA.minus(5);//<== calcA 값에 대해 minus() 연산을 수행하라!
    calcB.plus(3); // 위와 같은 표현이 들이 가능하다! 코드를 읽고 이해하기 쉽다.
    calcA.plus(7); // 이런 이유로 instance 메서드 문법이 등장한 것이다.
    calcB.minus(2);
    calcA.plus(2);
    calcB.minus(1);
    System.out.println(calcA.result);
    System.out.println(calcB.result);
  }
}
