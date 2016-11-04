// 사용자 정의 타입의 인스턴스 - 응용 1
// 자바에서는 인스턴스 주소를 자동으로 받는 메서드 사용법
package step07;

 public class Exam059_6 {
   public static void main(String[] args) {
    Student2[] arr = new Student2[3]; // 레퍼런스 배열을 3개 준비하라는 뜻.
                                     // Student 인스턴스가 아니다.
                                     // => Student s1, s2, s3; 와 같은 의미
                                     // String 객체 3개를 만드는것이 아니라
                                     // Student를 저장할수 있는 3개를 만들라는것.

  //arr1[0].name = "홍길동"; // 인스턴스에 값이 없기 때문에 0번째 정보를 못 가져옴.

 // 그래서 따로따로 인스턴스 배열로 만들어줘야함.
  arr[0] = new Student2(); // []는 레퍼런스, ()는 인스턴스
  arr[1] = new Student2();
  arr[2] = new Student2();
// 각 배열 레퍼런스를 통해 인스턴스에 값을 저장한다.
Student2.init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
Student2.init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
Student2.init(arr[2], "유관순", "yoo@test.com", "111-1113", 40, true); // Student2에 파일이 있다는..



  // 4)  각 배열 (arr[]) 레퍼런스가 가리키는 인스턴스에 값을 출력한다.
for (Student2 student : arr) {
  Student2.printStudent(student);
}
}
// init() 메서드 정의를 해줘야함.
}





/*
# 메서드 분류
- 서로 관련있는 메서드를 잘 분류해 놓으면 유지보수할 때 빠르게 해당 메서드를 찾고,
 변경할 수 있어 좋다.
- 작업 목표
 => init(), printStudent()는 student 데이터를 다루는 메서드이다.
=> 이런경우엔 해당 메서드들을 그 데이터를 정의한 클래스에 두는 것이 좋다.
=> init(), printStudent()를 Student 클래스로 옮긴다.
=> 이렇게 하기 위해서는 기존의 Student를 복제하여 Student2로 만들어 사용한다.
   기존 예제를 변경 전과 후를 참고하기 위해서

   # 인스턴스와 메서드
   인스턴스란 클래스 설계도에 따라 준비한 메모리를 말한다.
   ex) 변수 선언 메모리.
   주의할 사항은 메서드는 인스턴스 만들 때 함께 만들어지는 것이 아니다.
   메서드는 Method area 영역에 존재한다. 명령어이기 때문에




*/
