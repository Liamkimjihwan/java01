
package step05;

 public class Exam046_1 {
   public static void main(String[] args) {
     int age  = Integer.parseInt(args[0]);


if (age < 19)
   System.out.println("청소년입니다.");
   System.out.println("성인은 일반 카드를 사용하셔야 합니다.");// 1

if (age >= 19)
   System.out.println("성인입니다.");
   System.out.println("청소년 카드를 사용할 수 없습니다."); // 2
   // if 문은 바로 다음 출력을 하는 명령에만 소속되고 아래 줄에 있는
   // 1과 2는 자동적으로 출력됨

 }
}
/*
자바는 들여쓰기로 명령어를 묶진 않는다.
반드시 블록 ({})을 사용하여 묶어야 한다.








*/
