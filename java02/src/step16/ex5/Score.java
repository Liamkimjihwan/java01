/* 주제 : 셋터 겟터와 프로퍼티 
=> 속성(attribute)란?
  - 인스턴스 변수(클래스 변수 포함)를 가리키는 용어
  - 예) Score 클래스의 경우
  name, kor , eng, math , sum, average 가 속성이다.

=> 프로퍼티란(property)????????
   - 셋터와 겍터를 가리키는 용어이다.
   - 
*/

package step16.ex5;

public class Score {
  String _name;
  private int _kor;
  private int _eng;
  private int _math;
  private int _sum;
  private float _average;


 public Score(String name, int kor, int eng, int math) {
   this._name = name;
   this._kor = kor;
   this._eng = eng;
   this._math = math;
   this._sum = kor + eng + math;
   this._average = this._sum / 3.0f;
 }

  private void compute() {
    this._sum = this._kor + this._eng + this._math;
    this._average = this._sum / 3f;
  }

 public void setKor (int kor) {
   this._kor = kor; // this가 붙으면 인스턴스에있는 kor 값 없으면 ?
   this.compute();
 }
  public void setEng (int eng) {
   this._eng = eng; // this가 붙으면 인스턴스에있는 kor 값 없으면 ?
   this.compute();
 }
  public void setMath (int math) {
   this._math = math; // this가 붙으면 인스턴스에있는 kor 값 없으면 ?
   this.compute();
 }


public int getKor() {return this._kor;}
public int getEng() {return this._eng;}
public int getMath() {return this._math;}

  public int getSum() {
    return this._sum;
}
  public float getAverage() {
    return this._average; 
 } 

}