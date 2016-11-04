/* 주제 : String class - 인스턴스 생성!!

*/
package step12;

 public class Exam078_0  {

   public static void main(String[] args) throws Exception {
   // 스트링 인스턴스는 Heap에 생성됨.
   String s1 = new String("ABC"); // 내부적으로 캐릭터 배열이 만들어지고 유니코드 저장됨.
   String s2 = new String("ABC");

   if ( s1 == s2) System.out.println("s1 == s2"); // 같지않다는 뜻.. 출력이 안됨

  }
}



/*
#









*/
