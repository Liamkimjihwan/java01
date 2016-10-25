
package step06;
// 메서드 정의 : 명령어를 분리하여 놓고 이름을 부여한 것
 public class Exam052_1 {
   static void printStarsLine(int length) { // length에 해당 하는 값에 따라 별 출력
     // 별들의 라인을 찍는다.
    int count = 0;
     while (count++ < length) {
       System.out.print("*"); // 한줄에 별만 찍는
   }
System.out.println();
}
   public static void main(String[] args) {
   int count = 6;
    while (--count > 0) {
  printStarsLine(count); // 반복문 돌면서
                         // 2) 정의 된 메서드 호출
       }
      System.out.println("----------------------------");
      count = 0;
      while (count++ < 5) {
        printStarsLine(count); // 언제든 이렇게 메서드를 재사용 할 수 있다.
      }
   }
 }





/*


*/
