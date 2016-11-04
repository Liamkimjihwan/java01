
package step05;

 public class Exam046_8 {
   public static void main(String[] args) {
     int age  = Integer.parseInt(args[0]);


  // {} 가 없으면 출력 불가능
   if (age < 2)
   System.out.println("아기입니다.");
  else // 이 else 문은 바로 위의 if 문 소속이다.
   System.out.println("어린이입니다.");






}
 }



/*

else 문은 가장 가까운 if문의 소속이다.




*/
