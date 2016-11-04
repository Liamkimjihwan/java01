/* 주제 : 상속-

*/
package step11;

 public class Exam068_0 {
   public static void main(String[] args) {
    KimjiCalculator calc = new KimjiCalculator();
    // 3 * 2 + 4 - 7 = 3
    calc.plus(3);
    calc.multiple(2);
    calc.plus(4);
    calc.minus(7);
    System.out.println(calc.result);
}
}



/*
#기본 생성자 (파라미터가 없는 생성자)
- 생성자가 단 한 개라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다.



*/
