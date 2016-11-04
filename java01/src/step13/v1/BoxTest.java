/* 값을 저장할 때 사용할 데이터 타입(메모리)를 정의한다.
*/

package step13.v1;
import java.util.Scanner;
public class BoxTest {
 public static void main(String[] args) {
   // 1) 상자를 생성하여 값을 보관한다.
  Box b1 = new Box(100);
  Box b2 = new Box(200);
  Box b3 = new Box(300);


  // 2) 상자들을 연결한다.
  b1.next = b2;
  b2.next = b3;


  // 3) 첫 번째 상자부터 마지막 상자까지 값을 출력한다.
  Box cursor = b1;
   while (cursor != null) {
     // System.out.println(cursor.toString()); // toString 그 주소로 가서 밸류 값 출력하라는
     System.out.println(cursor); // 생략되도 됨. println에서 toStirng역할을 할거임.
     cursor = cursor.next;
    }
  }
}
