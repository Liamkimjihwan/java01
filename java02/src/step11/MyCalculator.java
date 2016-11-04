/* 다른사람이 만든 클래스를 확장한다. */
package step11;

public class MyCalculator extends SunCalculator {

 public void remainder(int value) { // reamainder = 나머지
   this. result %=value;  // result 에서 벨류를 뺀 나머지
 }



 public void power(int value) { // power = 제곱

   int temp = this.result;
   for (int i = 0; i < value-1; i++) {
     // temp *= temp; // 템프에 템프를 곱하는건데 벨류 -1만큼 곱해야한다.
     this.result *= temp; // 이것도 가능
   }

 }
}
