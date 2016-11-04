package bitcamp.java89,ems;
import java.util.Scanner; // 만약 여기 Scanner가 없으면 java.util 스캐너를 찾아가라 라는 뜻.
public class TeacherController {
  private Box head;
  private Box tail;
  private int length;
  private Scanner keyScan;



  public TeacherController(Scanner keyScan) { // 생성자
    head = new Box();
    tail = head;
    length = 0; // 인스턴스
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
// 아래의 doxxx() 메서드들은 오직 내부에서만 (Service()) 호출하기 떄문에 private으로 접근제한
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

    // tail이 가리키는 빈 상자에 Teacher 인스턴스의 주소를 담는다.
    // 그리고 새 상자를 만든 다음 현재 상자에 연결한다.
    // tail은 다시 맨 마지막 빈 상자를 가리킨다.
    tail.value = teacher;
    tail.next = new Box();
    tail = tail.next;
    length++;

    System.out.print("계속 입력하시겠습니까(y/n)?");
    if (!this.keyScan.nextLine().equals("y")) // 키스캔에 입력된 값이 y와 같지않다면 if문 실행
    break;
  }
}
  private void doList() {
    Box currentBox = head; // 현재 상자를 헤드라 하자.
    while (currentBox != null && currentBox != tail) { // 현재 박스가 널이 아니어야 하고 꼬리값이 아니어야함.
    //  Teacher teacher = currentBox.value; // 현재 상자에서 피쳐값 꺼낸다. 현재 value는 Object 타입이기 때문에 포함 못함
    Teacher teacher = (Teacher)currentBox.value;
      System.out.printf(" %s,%s,%d,%s,%s,%s,%s,%s\n",
        teacher.name,
        teacher.gender,
        teacher.age,
        teacher.career,
        teacher.skill,
        teacher.major,
        teacher.email,
        teacher.tel);
      currentBox = currentBox.next; // 다음 상자 박스를 현재 박스에 담는다. 또 반복 ↑
    }
}
 private void doview() {
   System.out.print("강사의 인덱스? ");
   int index = Integer.parseInt(this.keyScan.nextLine());

   if (index < 0 || index >= length) {
     System.out.println("인덱스가 유효하지 않습니다.");
     return;
   }

   Box currentBox = head;
   for (int i = 0; i < index; i++) {
     currentBox = currentBox.next;
   }
     Teacher teacher = (Teacher)currentBox.value; // 링크드 리스트에 있는 현재상자에서 티쳐 주소에 있는 값을 꺼내겠다.


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

 if (index < 0 || index >= length) {
   System.out.println("인덱스 유효하지 않습니다.");
   return;
 }

Teacher deleteTeacher = null;
 if (index == 0) {
   deleteTeacher = (Teacher)head.value; // next로 넘어가기전 현재 박스
   head = head.next;

 } else { // index가 0이 아닐 경우
   Box currentBox = head;
    for (int i = 0; i < (index- 1); i++) {
     currentBox = currentBox.next;
}
  deleteTeacher = (Teacher)currentBox.next.value;
  currentBox.next = currentBox.next.next; // 현재 박스에 있는 next 주소 대신 next.next 주소를 저장.
}
length--;
  System.out.printf("%s 강사 정보를 삭제하였습니다.\n", deleteTeacher.name);
}

  private void doUpdate() {
    System.out.print("변경할 강사의 인덱스? ");
    int index = Integer.parseInt(this.keyScan.nextLine());
  // 유효한 인덱스인지 검사
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return;
    }
  // 변경하려는 강사 정보가 저장된 상자를 찾는다.
    Box currentBox = head;
    for (int i = 0; i < index; i++) {
      currentBox = currentBox.next;
    }
    // 찾은 상자에서 변경할 강사의 정보를 꺼낸다.

    Teacher oldTeacher = (Teacher)currentBox.value; // 현재 티쳐 상자의 value에 들어있는
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
         currentBox.value = teacher; // 새로운 티쳐로 저장하기 전에 위에서 이름은 그대로 줘야함
           System.out.println("저장하였습니다.");
      } else {
          System.out.println("변경을 취소하였습니다.");
      }
    }
  }
