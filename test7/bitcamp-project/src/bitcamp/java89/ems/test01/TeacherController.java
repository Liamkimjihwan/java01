package bitcamp.java89.ems.test01;
import java.util.Scanner; // 만약 여기 Scanner가 없으면 java.util 스캐너를 찾아가라 라는 뜻.
public class TeacherController {

  private LinkedList list; // 리스트 만들고 초기화 아래서 함.
  private Scanner keyScan;



  public TeacherController(Scanner keyScan) { // 생성자
    list = new LinkedList();
    this.keyScan = keyScan;
  }

  public void Service() { // loop 사용자로부터
    loop :
     while (true) {
      System.out.print("강사관리> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
        case "add": this.doAdd(); break; // 컨트롤러 파일 안에 있기 때문에
        case "list": this.doList(); break;
        case "view": this.doview(); break;
        case "delete": this.doDelete(); break;
        case "update": this.doUpdate(); break;
        case "main":
          break loop;
       default:
         System.out.println("지원하지 않는 명령어입니다.");
      }
    }

  }
private void doList() {
  for (int i = 0; i < list.size(); i++)
  Teacher teacher = list.get(i); // 리스트에서 i번째 출력
  System.out.printf(" %s,%s,%d,%s,%s,%s,%s,%s\n",
  teacher.name,
  teacher.gender,
  teacher.age,
  teacher.career,
  teacher.skill,
  teacher.major,
  teacher.email,
  teacher.tel);

}

private void doUpdate() {
  System.out.print("변경할 강사의 인덱스? ");
  int index = Integer.parseInt(this.keyScan.nextLine());
  // 유효한 인덱스인지 검사
  if (index < 0 || index >= list.size()) {
    System.out.println("인덱스가 유효하지 않습니다.");
    return;
  }
  // 변경하려는 강사 정보가 저장된 상자를 찾는다.
  Teacher oldTeacher = list.get(value); // 현재 티쳐 상자의 value에 들어있는
  Box currentBox = head;
  for (int i = 0; i < index; i++) {
    currentBox = currentBox.next;
  }
  // 찾은 상자에서 변경할 강사의 정보를 꺼낸다.

  // 새 강사 정보를 입력받는다.
  Teacher teacher = new Teacher();
  System.out.print("성별? ");
  teacher.gender = this.keyScan.nextLine();

  System.out.printf("이름(%s)? ", oldTeacher.name);
  teacher.age = Integer.parseInt(this.keyScan.nextLine());

  System.out.printf("나이(%d)? ", oldTeacher.age);
  teacher.age = Integer.parseInt(this.keyScan.nextLine());

  System.out.printf("경력(예:20년차(%s))? ",oldTeacher.career);
  teacher.career = this.keyScan.nextLine();

  System.out.print("능력? ");
  teacher.skill = this.keyScan.nextLine();

  System.out.print("전공? ");
  teacher.major = this.keyScan.nextLine();

  System.out.printf("이메일(%s)? ",oldTeacher.email);
  teacher.email = this.keyScan.nextLine();

  System.out.printf("전화번호(%s)? ", oldTeacher.tel);
  teacher.tel = this.keyScan.nextLine();

  System.out.print("저장 하시겠습니까(y/n)?");
  if (this.keyScan.nextLine().equals("y")) {
    teacher.name = oldTeacher.name;
    list.set(index, teacher); // 이 자리에 있는 index 값을 티쳐값으로 대체하라.
    System.out.println("저장하였습니다.");
  } else {
    System.out.println("변경을 취소하였습니다.");
  }
}

private void doAdd() {

  while (true) { // 멈출때까지 무한반복
    Teacher teacher = new Teacher(); // 반복문이 돌때마다 새로 생성됨.
    System.out.print("이름(예:홍길동)? ");
    teacher.name = this.keyScan.nextLine();

    System.out.print("성별? ");
    teacher.gender = this.keyScan.nextLine();

    System.out.print("나이? ");
    teacher.age = Integer.parseInt(this.keyScan.nextLine());

    System.out.print("경력(예:20년차)? ");
    teacher.career = this.keyScan.nextLine();

    System.out.print("능력? ");
    teacher.skill = this.keyScan.nextLine();

    System.out.print("전공? ");
    teacher.major = this.keyScan.nextLine();

    System.out.print("이메일(예:hong@test.com)? ");
    teacher.email = this.keyScan.nextLine();

    System.out.print("전화번호(예:010-1111-1111)? ");
    teacher.tel = this.keyScan.nextLine();


    list.add(teacher); // doAdd 에서는 이것만

    System.out.print("계속 입력하시겠습니까(y/n)?");
    if (!this.keyScan.nextLine().equals("y")) // 키스캔에 입력된 값이 y와 같지않다면 if문 실행
    break;
  }
}

 private void doview() {
   System.out.print("강사의 인덱스? ");
   int index = Integer.parseInt(this.keyScan.nextLine());

   if (index < 0 || index >= list.size()) {
     System.out.println("인덱스가 유효하지 않습니다.");
     return;
   }

     Teacher teacher = (Teacher)list.get(index); // 링크드 리스트에 있는 현재상자에서 티쳐 주소에 있는 값을 꺼내겠다.


       System.out.printf("이름: %s\n", teacher.name);
       System.out.printf("성별: %s\n", teacher.gender);
       System.out.printf("나이: %d\n", teacher.age);
       System.out.printf("경력: %s\n", teacher.career);
       System.out.printf("능력: %s\n", teacher.skill);
       System.out.printf("전공: %s\n", teacher.major);
       System.out.printf("이메일: %s\n", teacher.email);
       System.out.printf("전화번호: %s\n", teacher.tel);

   }
private void doDelete() {
 System.out.print("삭제할 강사의 인덱스? ");
  int index = Integer.parseInt(keyScan.nextLine());

 if (index < 0 || index >= list.size()) {
   System.out.println("인덱스 유효하지 않습니다.");
   return;
 }

 Teacher deletedTeacher = list.remove(index);

  System.out.printf("%s 강사 정보를 삭제하였습니다.\n", deletedTeacher.name);
}

  }
