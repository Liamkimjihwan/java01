/* 값을 저장할 때 사용할 데이터 타입(메모리)를 정의한다.
*/

package step14;

public class Box {
  int value;
  Box next;


  public Box() {}

    public Box(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Box(" + this.value + ")";
    }
}
