
package step05;

 public class Exam048_1 {
   public static void main(String[] args) {

   int count = 0;
    while (count < 10) {// 카운트가 10보다 낮으면 실행하라
    System.out.printf("%d: 하하하\n", ++count);
   }   // 0에서 9까지 10번 반복
System.out.println("---------------------");
count = 0; // 위에서 카운트 실행되었기 때문에 초기화
while (count < 10) {
  System.out.printf("%d: 하하하\n", count++);
}





}
 }



/*

while (조건)
- 조건에는 boolean 값만 올수 있다.
- 정수 , 부동소수점은 조건으로 올 수 없다.
- 문법
  while (조건) 문장;
  while (조건) {문장1; 문장2; ...}



*/
