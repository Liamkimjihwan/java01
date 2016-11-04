package bitcamp.java89.ems;

public class LinkedList {
  Box head;
  Box tail;
  int length;

  public LinkedList() {

    head = new Box();
    tail = head;

  }

  public void add(Object value) {
    tail.value = value;
    tail.next = new Box();
    tail = tail.next;
    length++;
  }

  public Object get(int index) {
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return null;
    }
   Box cursor = head;
   for (int i = 0; i < index; i++) {
     cursor = cursor.next;
   }
   return cursor.value;

  }
public Object set(int index, Object value) {
  if (index < 0 || index >= length) {
    System.out.println("인덱스가 유효하지 않습니다.");
    return null;
  }
  Object oldValue = null;
  if (index == 0) {
    oldvalue = head;
    head = head.next;
  } else {
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    oldValue = cursor.next;
    cursor.next = cursor.next.next;
  }
  length--;
  return oldValue;
}
    public int size() {
      return length;
    }


    public class Box {
    Objcet value;
    Box next;


    public Box() {}

      public Box(Object value) {
        this.value = value;
      }


      @Override
      public String toString() {
        return "Box(" + this.value + ")";
      }
    }



  }
}
