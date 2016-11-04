/* 주제 : 제네릭의 정의와 사용.
=> 제네릭은 타입 이름을 메서드의 파라미터처럼 클래스에 넘겨주는 기술
 타입 이름을 받은 클래스는 내부에서 변수처럼 타입을 사용할 수 있다.
=> 제네릭 사용 이점
 1) 특정 데이터 타입별로 클래스 또는 메서드를 만들 필요가 없다.
 2) 특정 데이터 타입에 종속되지 않고 모든 타입의 값을 다루려면 보통 Object 타입의
    레퍼런스를 사용하여 데이터를 다루지만 문제는 값을 꺼낼 때 마다 타입 캐스팅을 해야한다.
    => 이것을 해결하기 위해서 타입 이름을 파라미터처럼 클래스에 넘겨주는 제네릭이 등장.
     즉 제네릭을 사용하면 값을 꺼낼 때 타입 캐스팅(형변환)을 할 필요가 없다.
  3) 값을 어떤 클래스가 다루는 데이터의 타입을 특정 타입으로 제한할 수 있다.


*/

package step13.v5;
import java.util.Scanner;

public class Test {
  //제네릭이 적용된 클래스 사용할 때는
  // 그 클래스가 다루는 데이터의 타입 이름을 파라미터로 넘겨줘야 한다.
  // 클래스명<타입명> 변수명 = new 클래스명<타입명>();
static LinkedList<Student> list; // Linkedlist는 Student만 저장하겠다.
  static Scanner keyScan;

static {
  list = new LinkedList<Student>();
  keyScan = new Scanner(System.in);
}

 public static void main(String[] args) {

loop:
while(true) {
  System.out.print("명령> ");
  String command = keyScan.nextLine().toLowerCase();
  switch (command) {
    case "add": doAdd(); break;
    case "list": doList(); break;
    case "get": doGet(); break;
    case "delete": doDelete(); break;
    case "quit":
        System.out.println("Good bye!");
        break loop;
      default:
        System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }

  static void doAdd() {
    System.out.print("학생정보(예: 홍길동, 20, 111-1111)? ");
    String[] values = keyScan.nextLine().split(","); // nextLine이 리턴하는 건 사용자가 입력하고 엔터를 만날 때까지 리턴하지않는다.
    Student student = new Student(); // ★레퍼런스를 다른 말로 주소 변수. 주소만 있으면 찾아갈 수 있다.
    student.name = values[0].trim();
    /* Student student;  여기서 student는 값이 없는 레퍼런스 이기 때문에 메모리가 있어야하는데 아래 name을 찾아 갈 수 없음.
                          new Student()로 새로 만들어줘야 찾아갈 수 있음.
       student.name = values[0]; */
       student.age = Integer.parseInt(values[1].trim()); // trim은 입력할 때 공백을 허락하게끔 하는.
       student.tel = values[2].trim();
    list.add(student); // add 에는 Student 타입이 와야 하기 떄문에 ★ 에서 만들어진 Student 타입의 student를 넣어야함
  }

static void doList() {
  for (int i = 0; i < list.size(); i++) {
  Student student = list.get(i); // 타입 캐스팅 할 필요 없다. get의 리턴 타입은 T인데 T는 Student를 뜻함.
                                  // static LinkedList<Student> list
  System.out.printf("%s, %d, %s\n", student.name, student.age, student.tel);
   }
}

static void doGet() {
  System.out.print("인덱스? ");
  int index = Integer.parseInt(keyScan.nextLine());
Student student = (Student)list.get(index);
System.out.printf("이름: %s\n", student.name);
System.out.printf("나이: %d\n", student.age);
System.out.printf("전화: %s\n", student.tel);

}

static void doDelete() {
 System.out.print("삭제할 값의 인덱스? ");
 int index = Integer.parseInt(keyScan.nextLine());
  list.remove(index);
  }
}
