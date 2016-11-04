/* 주제 : 셋터 겟터와 프로퍼티 
=> 속성(attribute)란?
  - 인스턴스 변수(클래스 변수 포함)를 가리키는 용어
  - 예) Score 클래스의 경우
  _name, _kor , _eng, _math , _sum, _average 가 속성이다.

=> 프로퍼티란(property)????????
   - 셋터와 겍터를 가리키는 용어이다.!!
   - 프로퍼티 명은 메서드 이름에서 set과 get, is를 제거하고 
     남은 이름 중에서 첫 알파벳을 소문자로 한 이름이다.
     setName() 이런 메서드가 있다면 이것의 프로퍼티명은 name 이다.
     setFirstName 에서의 프로퍼티명은 firstname 이다.
     Score 클래스의 경우
     setKor()/getKor() ----> kor : read/ write  프로퍼티
     setMath()/getMath() --- > math : read/ write  프로퍼티
     getSum()           ----> sum : read only
     getAverage()       ----> average : read only

     get만 있으면 only read
     set만 있으면 only write

     실무에서는 _가 없다.. 헷갈리면 안됨.

  => 프로퍼티 명과 변수 명은 다를 수 있다. 변수를 가리키는 용어는 attribute
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