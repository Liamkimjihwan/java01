
package step05;

 public class Exam045_1 { // 클래스 블록
   public static void main(String[] args) { // 메서드 블록
int a = 10;
{
  int b = 20;
  {
    int c = 30;
    System.out.printf("{{%d,%d,%d}}\n", a, b, c);
    // 안쪽에 있음에도 바깥쪽에 있는 a와 b를 사용할 수 있음. 별★
  } // 이 블록을 나가는 순간 변수는 사라짐
  //System.out.printf("{{%d,%d,%d}}\n", a, b, c); // 컴파일 오류
}
System.out.printf("{{%d,%d,%d}}\n", a, b, c);
 }
}



/*
블록 안에 선언된 변수
=> 블록 실행을 마치고 나가면 제거된다.
바깥 블록에서 안쪽 블록의 변수를 사용할수 없다.
=> 바깥에 선언된 변수는 안쪽 블록에서 사용할 수 있다. - 별★







*/
