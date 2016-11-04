
package step04;

 public class Exam042_2 {
   public static void main(String[] args) {

int[] language = new int[] {
  1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
  0, 1, 1, 0 , 0, 0, 1, 1, 0, 0
};
// java, javascript, html, css, c++, PHP, Python, perl, VB, R, Groovy
// xml, Xcala, Rubby, swift, object-c, pascal, c#, go

int v1 = (language[0]) + (language[4]) + (language[5]);
String result = (v1 == 3) ? "Yes" : "No";
System.out.println(result);

/* int v1 = (language[0]) ? 1: 0;
v1 = v1 + ((language[4]) ? 1 : 0);
v1 = v1 + ((language[4]) ? 1 : 0);
String result = (v1 == 3) ? "Yes" : "No";
System.out.println(result);
*/
 }
}
