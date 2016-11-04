/*
*/

package step13.v4;
import java.util.Scanner;

public class Test {
static LinkedList list;
  static Scanner keyScan;

static {
  list = new LinkedList();
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
    Student student = new Student(); // 레퍼런스를 다른 말로 주소 변수. 주소만 있으면 찾아갈 수 있다.
    student.name = values[0].trim();
    /* Student student;  여기서 student는 값이 없는 레퍼런스 이기 때문에 메모리가 있어야하는데 아래 name을 찾아 갈 수 없음.
                          new Student()로 새로 만들어줘야 찾아갈 수 있음.
       student.name = values[0]; */
       student.age = Integer.parseInt(values[1].trim());
       student.tel = values[2].trim();
    list.add(student);
  }

static void doList() {
  for (int i = 0; i < list.size(); i++) {
  Student student = (Student)list.get(i); // get이 리턴하는게 Object이기 때문에 Student 에 담을 수 없음.
                                           // 컴파일 통과를 위한 방법
                                          // get이 리턴하는게 Student인지 판단함
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
