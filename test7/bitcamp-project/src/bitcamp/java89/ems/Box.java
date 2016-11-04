/*
*/

package bitcamp.java89.ems;

public class Box { // 오브젝트로 인해 어떤 박스도 담을 수 있게 됨.
Object  value; // 어떤 타입의 인스턴스 주소를 저장할지 모를 때. 모든걸 저장하고 싶을 때
Box next;


  public Box() {}

    public Box(Object value) {
      this.value = value;
    }

    @Override
    public String toString() { // 오버라이딩 한 toString 값을 먼저 찾음.
      return "Box(" + this.value.toString() + ")";
    }
}
