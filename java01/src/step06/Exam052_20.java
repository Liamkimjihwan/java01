

package step06;
// 메서드 정의 : 명령어를 분리하여 놓고 이름을 부여한 것
 public class Exam052_20 {
   static void printStarsLine(int length) { // length에 해당 하는 값에 따라 별 출력
     // 별들의 라인을 찍는다.
    int count = 0;
     while (count++ < length) {
       System.out.print("*"); // 한줄에 별만 찍는
   }
System.out.println();
}

static void printCenterStarsLine(int lineSize, int starLength) { // length에 해당 하는 값에 따라 별 출력
    if (lineSize % 2 == 0) {
      lineSize += 1;
    }
    if (starLength > lineSize) {
      starLength = lineSize;
    }
  int spaceLength = (lineSize - starLength) / 2;
  for (int i = 0; i < spaceLength; i++) { // 공백 출력 반복 위한 for 문
    System.out.println(" ");
  } // 블록에 종속 된 i라서 벗어나면 다시 쓸 수 있음.
  for (int i = 0; i < starLength; i++) {
    System.out.println("*");
  }
  System.out.println();
}

   static void main(String[] args) {
   int count = 6;
    while (--count > 0) {
  printStarsLine(count); // 반복문 돌면서
                         // 2) 정의 된 메서드 호출
       }
      System.out.println("----------------------------");
      count = 0;
    while (count++ < count) {
      printStarsLine(count);

}


 static void printBlanks(int length) {
  for (int i = 0; i < length; i++) { // 공백 출력 반복 위한 for 문
    System.out.println(" ");
}

System.out.println("--------");
count = 0;
while (count++ < 5) {
  printStarsLine(count);
}
   public static void main(String[] args) {
for (int i = 1; i < 9; i += 2) {
  printCenterStarsLine(9, i);
}


 }
    }







/*


*/
