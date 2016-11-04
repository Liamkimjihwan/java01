package step13.v5;
// LinkedList가 다룰 데이터를 특정 이름으로 정의해 두고
// 그 정의된 이름 사용하여 데이터 타입을 지정한다.
// 즉 타입을 변수로 다루는 기술을 Generic 이라 하낟.
// type을 파라미터로 다룬다 라고도 표현한다. type을 변수로 다룬다.
public class LinkedList<T> {

 Box<T> head;
 Box<T> tail;
 int length;

public LinkedList() { // 링크드리스트 기본 생성자
  head = new Box<T>();
  tail = head;
// length는 따로 초기화 안해도 0 이기 떄문에 안해도 됨./
}

public void add(T value) {
  tail.value = value;
  tail.next = new Box<T>();
  tail = tail.next;
  length++;
}

public T get(int index) { // 여기에 인덱스를 주면!
  if (index < 0 || index >= length) {
    System.out.println("인덱스가 유효하지 않습니다.");
    return null;
  }

  Box<T> cursor = head;
  for (int i = 0; i < index; i++) {
    cursor = cursor.next;
  }
  return cursor.value; // 난 현재 이 상자에 있는 값을 리턴하겠다.
}

public T set(int index, T newValue) {
  if (index < 0 || index >= length) {
    System.out.println("인덱스가 유효하지 않습니다.");
    return null;
  }

  Box<T> cursor = head;
  for (int i = 0; i < index; i++) {
    cursor = cursor.next;
 }

  T oldValue = cursor.value;
  cursor.value = newValue;
  return oldValue;
 }

public T remove(int index) {
  if (index < 0 || index >= length) {
    System.out.println("인덱스 유효하지 않습니다.");
    return null;
  }

  T oldValue = null;
  if (index == 0) {
    oldValue = head.value;
    head = head.next;
  } else {
   Box<T> cursor = head;
  for (int i = 0; i < (index- 1); i++) { // -1은 바로 전까지
     cursor = cursor.next;
   }
    oldValue = cursor.next.value;
    cursor.next = cursor.next.next;
  }
  length--;
  return oldValue;
}

public int size() {
  return length; //
}





//  특정 클래스에서만 사용하는 클래스라면
// 굳이 바깥에 두지 말고  그 클래스 안에 두어도 된다.
// 이러면서 사용범위를 좁히게 된다. => 관리가 쉬워진다.
 private class Box<T> {
   T value; // value에는 모든 값이 들어갈 수 있다.
   Box<T> next; // T를 갖고 있는 다음 박스와 연결

   public Box() {}

     public Box(T value) {
       this.value = value;
  }

  @Override
   public String toString() {
     return "Box(" + this.value + ")";
   }
 }


}
