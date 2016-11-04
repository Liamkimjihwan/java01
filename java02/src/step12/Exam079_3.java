/* 주제 :랩퍼 클래스 - 박싱과 파라미터

*/
package step12;

 public class Exam079_3  {
   static void m1(Object value) {
     System.out.println(value);
   }
   static void m2(int value) { // 여기서는 프리머티브를 원함
     System.out.println(value);
   }
   public static void main(String[] args)  throws Exception{
     m1(new Integer(100)); // Object value 값에 들어갈..
     // Object value 는 String 포함 다 됨. Integer도 가능.
     m1(200); // 오브젝 벨류에서는 객체(주소)를 원하지만 이것은 4바이트 정수값. 오류 날 것 같지만..
             // 이럴 때 자동으로 오토 박싱 => m1(new Integer(200));
    m2(300);
    Integer obj = new Integer(400);
    m2(obj); // 오토 언박싱. = m2(obj.intValue());
  //  m2("500"); // String 값은 자동으로 숫자로 바뀌지 않음.
  }
}



/*
#









*/
