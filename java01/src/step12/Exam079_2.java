/* 주제 :랩퍼 클래스 - 오토박싱과 오토언박싱

*/
package step12;

 public class Exam079_2  {

   public static void main(String[] args)  throws Exception{
       //1) 오토 박싱
    int i1 = 10;
    Integer obj1 = i1; // primitive type --> new Interger(i1) : 오토 박싱이라 부른다.
    System.out.println(obj1.toString()); // obj로 가 값을 문자열로 출력하라는.


    //2) 오토 언박싱
    Integer obj2 = new Integer(100);
    int i2 = obj2; // 객체에서 값을 꺼냄. 인스턴스에서 primitive type : 오토 언박싱이라 부름.
                  // = obj2.intvalue() 메서드 호출한 것과 같다.
  System.out.println(i2);
  }
}



/*
#









*/
